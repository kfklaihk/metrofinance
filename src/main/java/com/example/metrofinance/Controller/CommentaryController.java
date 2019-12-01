package com.example.metrofinance.Controller;




import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.example.metrofinance.Model.Commentary;

import com.example.metrofinance.repository.CommentaryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
 
@Controller
public class CommentaryController {
	@Autowired
	CommentaryRepository repository;
	
	
	@GetMapping("/getbystkname/{stkcode}")
	public String searchcode(@PathVariable String stkcode,Model model){
		
		List<Commentary> comm_list = repository.findBystkname(stkcode);
		model.addAttribute("commlist", comm_list);
		
		return "fragments/commentary::hasdata";
	}
	
	@GetMapping("/getbybhouse/{bhouse}")
	public String searchbhouse(@PathVariable String bhouse, Model model){
		
		List<Commentary> comm_list = repository.findBybhouse(bhouse);
		model.addAttribute("commlist", comm_list);
		
		return "fragments/commentary::hasdata";
	}
	
	@GetMapping("/")
	public String index(Model model) {
	   
		List<String> stklist= repository.findAllstkname();
	    List<String> bhouselist= repository.findAllbhouse();
	    model.addAttribute("stk", stklist);
	    model.addAttribute("bhouse", bhouselist);
	    return "index";
	}
	
	
	
}