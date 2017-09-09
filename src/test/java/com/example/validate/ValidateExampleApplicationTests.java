package com.example.validate;

import com.example.validate.domain.vo.Person;
import com.example.validate.domain.vo.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ValidateExampleApplicationTests {

	@Test
	public void contextLoads() throws JsonProcessingException {
		User user = new User();
		user.setUserId(1);
		user.setAddress("成都高新区顶聚科技");
		user.setUserName("吕潘锋");
		user.setAge(25);
		String userJson = new ObjectMapper().writeValueAsString(user);
		System.out.println(userJson);
		Person person = new Person();
		person.setName("lvpanfeng");
		person.setPassword("123456");
		person.setPersonId(1);
		String personJson = new ObjectMapper().writeValueAsString(person);
		System.out.println(personJson);
	}

}
