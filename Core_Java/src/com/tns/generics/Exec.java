package com.tns.generics;

public class Exec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericProgram <String> obj=new GenericProgram();
		obj.setData("hello");
		System.out.println("the string obj is"+ obj.getData());
		GenericProgram <Integer> iobj=new GenericProgram();
		iobj.setData(22);
		System.out.println("the string obj is"+ iobj.getData());

	}


	

}
