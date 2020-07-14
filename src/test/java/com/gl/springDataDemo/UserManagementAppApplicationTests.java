package com.gl.springDataDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Optional;

import org.assertj.core.util.Lists;
import org.junit.Assert;
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
	 public void testfindAllUsers() {
    	//Set-up Data
    	User user = new User();
	 	user.setId(2L);
	 	user.setFirstName("Amit");
	 	user.setLastName("Ganguly");		 	
	 	user.setGender("M");
	 	user.setAddress("Vashi");
	 	
	 	User user1 = new User();
	 	user1.setId(2L);
	 	user1.setFirstName("Amit1");
	 	user1.setLastName("Ganguly1");		 	
	 	user1.setGender("M");
	 	user1.setAddress("Vashi_1");
	 	
    	List<User> userList = Lists.newArrayList();
    	
    	userList.add(user);
    	userList.add(user1);
    	
    	//Stubbing the data
	 	Mockito.when(repository.findAll()).thenReturn(userList);
	 	
	 	//Service Call
        List<User> userListResponse = service.findAllUsers();
        
        //Data validation
        Assert.assertEquals(userList.size(), userListResponse.size());
      
        
	
    }
    
	 @Test
	 public void testfindUserByName() {
	    	//set-up data
		 	User user = new User();
		 	user.setId(2L);
		 	user.setFirstName("Amit");
		 	user.setLastName("Ganguly");		 	
		 	user.setGender("M");
		 	user.setAddress("Vashi");
		 	
		 	//Stubbing the data
		 	Mockito.when(repository.findById(2L)).thenReturn(Optional.of(user));
		 	
		 	//Service Call
	        User newuser = service.findUserByName(2L);
	        
	        //Data validation
	        Assert.assertEquals(user, newuser);
	        System.out.println(newuser.toString());
	        
	        
	    }

	
	
	
	
}

