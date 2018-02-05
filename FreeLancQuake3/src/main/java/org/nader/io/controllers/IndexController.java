package org.nader.io.controllers;

import org.nader.io.exception.RssException;
import org.nader.io.repositories.IPrepository;
import org.nader.io.repositories.ItemRepository;
import org.nader.io.services.IPservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@Autowired
	private ItemRepository itemRepository;
	
	@Autowired
	private IPrepository ipRepository;
	
	@Autowired
	private IPservice ipService;
	
	@RequestMapping("/")
	public String index(Model model) throws RssException{
		model.addAttribute("quakes",itemRepository.findAll()); 
		return "index";
	}
	
	@RequestMapping("/ipaddress")
	public String remoteAdd(Model model) throws RssException{
		ipService.getClientIP();
		model.addAttribute("ips", ipRepository.findAll()); 
		return "ipaddress";
	}
	
}
