package NutritionApp;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import NutritionApp.services.*;


@Controller
public class MainController {
	
	@Autowired
	NutritionixApiService nutriapi;
	
	@GetMapping("/index")
	private String index() {
		nutriapi.nutritionixTestCall(); 
		return "index";
	}
	
	@PostMapping("/searchresults")
	private String searchResults(@RequestParam String search, Model model) {
		InstantResponse results = nutriapi.instantSearch(search);
		
		List<Branded> brands = results.getBranded();
		model.addAttribute("brands", brands);
		System.out.println(brands.toString());
		
		List<Common> commons = results.getCommon();
		model.addAttribute("commons", commons);
				
		return "searchresults";
	}
	
	@GetMapping("/searchresults")
	private String searchResults() {
		return "searchresults";
	}

}
