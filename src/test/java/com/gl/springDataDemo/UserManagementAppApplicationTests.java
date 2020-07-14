package com.gl.springDataDemo;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.gl.springDataDemo.dto.User;
import com.gl.springDataDemo.repository.UserRepository;
import com.gl.springDataDemo.service.Calculator;
import com.gl.springDataDemo.service.UserServiceImpl;


@RunWith(SpringRunner.class)
@SpringBootTest
public class UserManagementAppApplicationTests {

	/*
	 * @Test public void contextLoads() { }
	 */

	@Autowired
	Calculator calculator;
	
	@InjectMocks
	UserServiceImpl service;
	
	@Mock
	UserRepository repository;
	
	
	@Test
	public void testMulCalc() {
		
		assertEquals(6,calculator.mulCalc(2, 3),"The correct sum is 6");
		
	}

	
	@Test
	public void testAddCalc() {
		
		assertEquals(5,calculator.addCalc(2, 3),"The correct sum is 5");
		
	}

	
	
	
	
	 @Test
	 public void testfindUserByName() {
	    	
		 	User user = new User();

		 	user.setId(2L);
		 	user.setFirstName("Amit");
		 	user.setLastName("Ganguly");		 	
		 	user.setGender("M");
		 	user.setAddress("Vashi");
		 	
		 	Mockito.when(repository.findById(2L).thenReturn(user);
	        User newuser = service.findUserByName(2L);
	        System.out.println(newuser.toString());
	        
	        
	    }

	
	
	
	
}

