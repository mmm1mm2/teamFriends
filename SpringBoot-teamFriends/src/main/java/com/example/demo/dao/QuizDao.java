package com.example.demo.dao;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
<<<<<<< HEAD

@Repository
public class QuizDao {
	private final JdbcTemplate jdbcTemplate;

	@Autowired
	public QuizDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public String getRandomQuestion() {
		String sql = "SELECT question FROM sample ORDER BY RAND() LIMIT 1";
		return jdbcTemplate.queryForObject(sql, String.class);
	}
=======

import com.example.demo.entity.EntQuiz;

@Repository
public class QuizDao {
	
	public List<EntQuiz> searchDb(){
		String sql = "SELECT question FROM sample where id=1";
		//データベースから取り出したデータをresultDB1に入れる
		List<Map<String, Object>> resultDb1 = db.queryForList(sql);
		//画面に表示しやすい形のList(resultDB2)を用意
		List<EntQuiz> resultDb2 = new ArrayList<EntQuiz>();
		//1件ずつピックアップ
		for(Map<String,Object> result1:resultDb1) {
		//データ1件分を1つのまとまりとしたEntForm型の「entformdb」を生成
		EntQuiz entformdb = new EntQuiz();
		//id、nameのデータをentformdbに移す
		entformdb.setName((String)result1.get("name"));
		entformdb.setQuestion((String)result1.get("question"));
		//移し替えたデータを持ったentformdbを、resultDB2に入れる
		resultDb2.add(entformdb);
		}
		//Controllerに渡す
		return resultDb2;
	}
	
//	public String mondai() {
//		String sql = "SELECT question FROM sample where id=1";
//		String resultDb1 = db.queryForList(sql);
//		return resultDb1;
//	}

	private final JdbcTemplate db;
	@Autowired
	public QuizDao(JdbcTemplate db) {
	this.db = db;
	}
	
	public void insertDb(EntQuiz entquiz) {
	db.update("INSERT INTO sample (name, question) VALUES(? ,?)", entquiz.getName(), entquiz.getQuestion()  );
	}
	
>>>>>>> 9b4b203e883f622f354ffa7e84a47cf12099dee6
}
