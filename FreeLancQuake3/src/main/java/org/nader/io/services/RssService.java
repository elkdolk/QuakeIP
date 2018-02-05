package org.nader.io.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import org.nader.io.entities.Item;
import org.nader.io.exception.RssException;
import org.nader.io.rss.Items;
import org.nader.io.rss.ObjectFactory;
import org.springframework.stereotype.Service;

@Service
public class RssService {
	public List<Item> getItems(String url) throws RssException {
		return getItems(new StreamSource(url));
	}
	private List<Item> getItems(Source source) throws RssException {
		ArrayList<Item> list = new ArrayList<Item>();
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(ObjectFactory.class);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
   		    JAXBElement<Items> jaxbElement = unmarshaller.unmarshal(source, Items.class);
   		    Items rssItems = jaxbElement.getValue();
   		    List<org.nader.io.rss.Items.Item> items = rssItems.getItem();
   		    for (org.nader.io.rss.Items.Item rssItem : items) {
   		    	Item item = new Item();
				item.setReg1(rssItem.getReg1());
				item.setMag(rssItem.getMag());
				item.setDep(rssItem.getDep());
				item.set_long(rssItem.getLong());
				item.setLat(rssItem.getLat());
				item.setReg1(rssItem.getReg1());
				Date rssDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).parse(rssItem.getDate());
				item.setDate(rssDate);
				list.add(item);
			}
			
		} catch (JAXBException e) {
			throw new RssException(e);
		} catch (ParseException e) {
			throw new RssException(e);
		}
		return list;
	}
}