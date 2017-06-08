package com.phamqtri.objectmaster;

public class Wizard extends Human {
	private static int counter;
	
	public Wizard() {
		this.setHealth(50);
		this.setIntelligence(8);
		counter++;
	}
	
	public int attack(Human enemy) {
		System.out.println(this.getClass().getSimpleName() + " attacks " + enemy.getClass().getSimpleName() + " for " + this.getStrength());
		return enemy.damaged(this.getStrength());
	}
	
	public int heal(Human friendly) {
		System.out.println(this.getClass().getSimpleName() + " healed " + friendly.getClass().getSimpleName() + " for " + this.getIntelligence());
		return friendly.healed(this.getIntelligence());
	}
	
	public int fireball(Human enemy) {
		System.out.println(this.getClass().getSimpleName() + " hit " + enemy.getClass().getSimpleName() + " with fireball for " + this.getIntelligence() * 3);
		return enemy.damaged(this.getIntelligence() * 3);
	}
}
