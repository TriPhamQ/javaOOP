package com.phamqtri.objectmaster;

public class HumanTest {
	public static void main(String[] args) {
		Wizard wizard = new Wizard();
		Ninja ninja = new Ninja();
		Samurai samurai = new Samurai();
		
		wizard.attack(ninja);
		
		System.out.println("Wizard's health left " + wizard.getHealth());
		System.out.println("Samurai's health left " + samurai.getHealth());
		System.out.println("Ninja's health left " + ninja.getHealth());
	}
}
