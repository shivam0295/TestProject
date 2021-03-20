package com.telusko.SpringDemo;

public class Alien {
	private int Age;
	private Computer com;

//	public Alien(int age) {
//
//		Age = age;
//	}

	public Alien() {
		System.out.println("inside constructor");
	}

	public int getAge() {
		return Age;
	}

	public Computer getCom() {
		return com;
	}

	public void setCom(Computer com) {
		this.com = com;
	}

	public void setAge(int age) {
		System.out.println("age assigned");
		Age = age;
	}

	

	public void code() {
		System.out.println("i am codeing");
		com.compile();
	}
}
