package com.phamqtri.objectmaster;

public class HumanTest {
	public static void main(String[] args) {
		Wizard wizard = new Wizard();
		Ninja ninja = new Ninja();
		Samurai samurai = new Samurai();
		Samurai samurai2 = new Samurai();
		
		wizard.fireball(ninja);
		System.out.println("Ninja's health left " + ninja.getHealth());
		wizard.heal(ninja);
		System.out.println("Ninja's health left " + ninja.getHealth());
		ninja.steal(samurai);
		System.out.println("Samurai's health left " + samurai.getHealth());
		System.out.println("Ninja's health left " + ninja.getHealth());
		ninja.runAway();
		System.out.println("Ninja's health left " + ninja.getHealth());
		wizard.fireball(samurai);
		System.out.println("Samurai's health left " + samurai.getHealth());
		samurai.deathBlow(wizard);
		System.out.println("Wizard's health left " + wizard.getHealth());
		System.out.println("Samurai's health left " + samurai.getHealth());
		samurai.howMany();
		
		System.out.println("Wizard's health left " + wizard.getHealth());
		System.out.println("Samurai's health left " + samurai.getHealth());
		System.out.println("Ninja's health left " + ninja.getHealth());
	}
}
