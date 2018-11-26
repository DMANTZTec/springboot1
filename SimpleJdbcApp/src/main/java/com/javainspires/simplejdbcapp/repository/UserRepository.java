package com.javainspires.simplejdbcapp.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository

public class UserRepository {
	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<String> getAllUserNames() {
		List<String> usernameList=new ArrayList<>();
		//usernameList.addAll(jdbcTemplate.queryForList("select * from user",String.class));
	//usernameList.addAll(jdbcTemplate.queryForList("select id,email,name from user ",String.class));
	usernameList.addAll(jdbcTemplate.queryForList("select email from user ",String.class));
	//usernameList.addAll(jdbcTemplate.queryForList("select id from user ",String.class));
		return usernameList;
	}

}
