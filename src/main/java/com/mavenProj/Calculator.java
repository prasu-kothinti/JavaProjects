package com.mavenProj;

public class Calculator {

	public int calculate(int a, int b, char op){
		switch(op){
			case '+' : return a + b;
			case '-' : return a - b;
			case '*' : return a * b;
			case '/' : return a / b;
			
			default: 
				return -1;
		}
	}
	
	
}

