package com.techstar.hellomaven;
/**
* groupId + artifactId
**/
public class HelloMaven{
	public String sayHello(){
		return "Hello Maven";
	}
	public static void main(String[] args){
		HelloMaven hw = new HelloMaven();
		System.out.println("say: "+ hw.sayHello());
	}
}

