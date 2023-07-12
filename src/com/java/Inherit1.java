package com.java;

public class Inherit1 extends Multilevel {
	public void chair() {

		System.out.println("table");

	}

	public static void main(String[] args) {
		Inherit1 mi = new Inherit1();
		mi.furniture();
		mi.chair();
	}
}
