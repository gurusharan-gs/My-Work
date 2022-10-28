package com.ex1;

public class Fibonacci {
	
	public static void main(String[] args) {
		
		System.out.println(fib(4));
		
		
	}
	
	public static int fib(int n) {
		if(n<0)   // fibonacci always is a positive integer
			return -1;  //		
		
		if(n==0 || n==1) 
			return n; // here we are returning n because fibonacci
		             // always starts from 0 & 1;
		
		// here n-1 is the next proceeding number and so on
		return fib(n-1)+fib(n-2);
		
		// fibonacci is addition of two 
		//procedding numbers; it always starts with 0 and 1
		
	}
	
	

}

