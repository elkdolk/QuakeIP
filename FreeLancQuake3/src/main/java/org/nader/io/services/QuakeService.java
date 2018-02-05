package org.nader.io.services;

import java.util.List;
import org.nader.io.entities.Item;
import org.nader.io.exception.RssException;
import org.nader.io.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class QuakeService {

	@Autowired
	private RssService rssService;
	
	@Autowired
	private ItemRepository itemRepository;
	
	/**
	 * 1 hour = 60 seconds * 60 minutes * 1000 milliseconds
	 */
	@Scheduled(fixedDelay = 3600000)
	public void saveItems() throws RssException{

		List<Item> items = rssService.getItems(new String("http://irsc.ut.ac.ir/events_list.xml"));
		for (Item aitem : items) {
			Item savedItem = itemRepository.findByDateAndLatAndReg1(aitem.getDate(), aitem.getLat(), aitem.getReg1());
			if(savedItem == null){
				itemRepository.save(aitem);
			}
		}
	}
}