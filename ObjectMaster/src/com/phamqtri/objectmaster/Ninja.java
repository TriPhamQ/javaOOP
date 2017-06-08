package com.phamqtri.objectmaster;

public class Ninja extends Human {
	private static int counter;
	
	public Ninja() {
		counter++;
	}
	
	public int attack(Human enemy) {
		System.out.println(this.getClass().getSimpleName() + " Attacks " + enemy.getClass().getSimpleName() + " hit for " + this.getStrength());
		return enemy.damaged(this.getStrength());
	}
	
	public int steal(Human enemy) {
		System.out.println(this.getClass().getSimpleName() + " steal " + this.getStealth() + " from " + enemy.getClass().getSimpleName() + " and heal self for " + this.getStealth());
		enemy.damaged(this.getStealth());
		return this.healed(this.getStealth());
	}
	
	public int runAway() {
		System.out.println(this.getClass().getSimpleName() + " ranaway from the fight and lose 10 health");
		return this.damaged(10);
	}
}
