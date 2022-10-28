
package com.inter1;


// Q1 ) How to find the sum of digit of a positive integer number using recursion?
// O/P --> 10 -> 1+0 =1 i.e. ans is 1;
public class SumOfDigit {

	public static void main(String[] args) {
		
		int s = 24;
		System.out.println(sumOfDigit(s));
	}
	
	
	public static int sumOfDigit(int n) {
//		if (n<0)    // unintentional case 
//			return -1;
		
		if(n==0 || n<0) // base condition 
			return n;
		
		return n%10 + sumOfDigit(n/10);
		
		// in above expression we have taken 
		//remainder and added it to divisor;
	    // 
	
	// 10 --> 10/10 = 1 and Remiander = 0;
	// 54 --> 54/10 = 5 and Remained = 4;	
		
		
	}
	
	
}
