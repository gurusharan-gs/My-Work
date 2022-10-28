package com.ex1;

public class Main {
	
	public static void main(String[] args) {
		
		int n = 4;
		
		System.out.println(fac(n));
		
	}

	public static int fac(int n) {
		if( n<1)
			return -1;		
		
		if(n==0 || n==1) 
			return 1;
		
		return n*fac(n-1);
		
		
	}
	
}


