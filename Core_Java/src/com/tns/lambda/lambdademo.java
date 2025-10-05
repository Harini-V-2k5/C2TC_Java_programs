package com.tns.lambda;

public class lambdademo {
	public static void main(String[] args) {
		Message m=()->{return "hello";
		};
		System.out.println(m.Greet());
	}

}
