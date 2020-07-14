package com.gl.springDataDemo.service;

import org.springframework.stereotype.Service;

@Service
public class Calculator {

		public int addCalc(int a, int b) {
			return a+b;
		}	

		public int mulCalc(int a, int b) {
			return a*b;
		}
		
		public String PrintName(String name) {
			return name;
		}
	
}
