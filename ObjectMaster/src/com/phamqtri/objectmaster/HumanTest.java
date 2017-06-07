package com.phamqtri.objectmaster;

public class HumanTest {
	public static void main(String[] args) {
		Human wizard = new Human();
		Human ninja = new Human();
		Human samurai = new Human();
		
		ninja.attack(samurai);
		
		System.out.println(samurai.getHealth());
		System.out.println(ninja.getHealth());
	}
}
