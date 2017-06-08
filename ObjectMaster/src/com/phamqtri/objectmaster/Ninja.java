package com.phamqtri.objectmaster;

public class Ninja extends Human {
	public Ninja() {
		
	}
	
	public int attack(Human enemy) {
		System.out.println(this.getClass().getSimpleName() + " Attacks " + enemy.getClass().getSimpleName() + " hit for " + this.getStrength());
		enemy.damaged(this.getStrength());
		return this.getStrength();
	}
}
