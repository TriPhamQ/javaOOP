package com.phamqtri.objectmaster;

public class Human {
	private int strength = 3;
	private int intelligence = 3;
	private int stealth = 3;
	private int health = 100;
	
	public Human() {
		
	}
	
	public int attack(Human enemy) {
		enemy.health -= this.strength;
		return enemy.health;
	}
	
	public int getHealth() {
		return this.health;
	}
}
