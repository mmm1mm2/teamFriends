package com.example.demo.quiz;

<<<<<<< HEAD
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

=======
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
>>>>>>> 775078cc81bb51af21c49f13f792705bc6e45a03
public class QuizController {
	@RequestMapping("/quiz1")
	public String top(Model model) {
		return "quiz/quiz1";
	}
	

	@RequestMapping("/start")
	public String top(Model model) {
		model.addAttribute("title", "クイズ"); 
		return "index";
	}


}
