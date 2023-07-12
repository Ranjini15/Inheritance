package com.java;

public class Inherit2 extends Inherit1
{
	private void chair1() {

		System.out.println("furniture");

	}

	public static void main(String[] args) {
		Inherit2 mi = new Inherit2();
		mi.furniture();
		mi.chair();
		mi.chair1();
	}
}
