package com.example.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

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
}
