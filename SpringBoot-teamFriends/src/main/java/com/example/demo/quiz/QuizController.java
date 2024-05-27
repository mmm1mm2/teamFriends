package com.example.demo.quiz;

<<<<<<< HEAD
=======
import java.util.List;

>>>>>>> 9b4b203e883f622f354ffa7e84a47cf12099dee6
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.QuizDao;
<<<<<<< HEAD



@Controller
public class QuizController {

=======
import com.example.demo.entity.Entquiz;

@Controller
public class QuizController {
	
	//QuizDaoの用意
	private final QuizDao quizdao;
	
	@Autowired
	public QuizController(QuizDao quizdao) {
	this.quizdao = quizdao;
	}
	
>>>>>>> 9b4b203e883f622f354ffa7e84a47cf12099dee6
	@RequestMapping("/index")
	public String start(Model model) {
		model.addAttribute("title", "この人誰だろな？");
		return "index";
	}
<<<<<<< HEAD

	@RequestMapping("/quiz1")
	public String quiz1(Model model) {
		model.addAttribute("message", "問題文");
=======
	
	
	@RequestMapping("/quiz1")
	public String quiz1(Model model) {
		
		List<Entquiz> list = quizdao.searchDb();
		model.addAttribute("dbList",list);
		
		
//		model.addAttribute("dbList",quizdao.mondai());
		
		
		model.addAttribute("message","問題");
>>>>>>> 9b4b203e883f622f354ffa7e84a47cf12099dee6
		return "quiz/quiz1";
	
		
		
	}

<<<<<<< HEAD
=======
	
>>>>>>> 9b4b203e883f622f354ffa7e84a47cf12099dee6
	@RequestMapping("/right")
	public String right(Model model) {
		return "quiz/right";
	}

	@RequestMapping("/wrong")
	public String wrong(Model model) {
		return "quiz/wrong";
	}
	
	private final QuizDao quizdao;
	@Autowired
	public QuizController(QuizDao quizdao) {
	this.quizdao = quizdao;
	}
	
}


