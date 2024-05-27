package com.example.demo.dao;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Entquiz;

@Repository
public class QuizDao {
	
	public List<Entquiz> searchDb(){
		String sql = "SELECT question FROM sample where id=1";
		//データベースから取り出したデータをresultDB1に入れる
		List<Map<String, Object>> resultDb1 = db.queryForList(sql);
		//画面に表示しやすい形のList(resultDB2)を用意
		List<Entquiz> resultDb2 = new ArrayList<Entquiz>();
		//1件ずつピックアップ
		for(Map<String,Object> result1:resultDb1) {
		//データ1件分を1つのまとまりとしたEntForm型の「entformdb」を生成
		Entquiz entformdb = new Entquiz();
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
	
	public void insertDb(Entquiz entquiz) {
	db.update("INSERT INTO sample (name, question) VALUES(? ,?)", entquiz.getName(), entquiz.getQuestion()  );
	}
	
}
