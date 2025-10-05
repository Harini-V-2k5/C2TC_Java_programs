package com.tns.lambdaexp;

public class WithoutParameter {
	public static void main(String[] args) {
		
		cube c=(a)->{return a*a*a;};
		System.out.println(c.cal(5));
	}

}
