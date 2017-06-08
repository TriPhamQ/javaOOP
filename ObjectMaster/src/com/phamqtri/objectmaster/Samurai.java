package com.phamqtri.objectmaster;

public class Samurai extends Human {
	public Samurai() {
		
	}
	
	public int attack(Human enemy) {
		System.out.println(this.getClass().getSimpleName() + " Attacks " + enemy.getClass().getSimpleName() + " hit for " + this.getStrength());
		enemy.damaged(this.getStrength());
		return this.getStrength();
	}
}
