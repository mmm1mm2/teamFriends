package com.example.demo.quiz;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class QuizController {
	
	@RequestMapping("/quiz1")
	public String top(Model model) {
		return "quiz/quiz1";
	}
	
	@RequestMapping("/right")
	public String right(Model model) {
		return "quiz/right";
	}
	
	@RequestMapping("/wrong")
	public String wrong(Model model) {
		return "quiz/wrong";
	}

}