package com.example.demo.quiz;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public class QuizController {

	@RequestMapping("/start")
	public String top(Model model) {
		model.addAttribute("title", "クイズ"); 
		return "index";
	}


}
