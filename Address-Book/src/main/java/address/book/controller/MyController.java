package address.book.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import address.book.service.SearchService;

@Controller
public class MyController {

	@RequestMapping("/")
	public String home() throws IOException {
		System.out.println("home page");
		
		return "index";
	
	}
	
	@PostMapping("/searchword")
	public String searchWord(@RequestParam("word")String str, Model m) throws IOException {
		
		List<String> list=new SearchService().searchContact(str);
		m.addAttribute("data", list);
		
		Iterator<String> iterable=list.iterator();
		while(iterable.hasNext()) {
			 System.out.println(iterable.next());
		}
		
		return "index";
	}
	
}
