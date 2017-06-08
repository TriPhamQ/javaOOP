package com.phamqtri.objectmaster;

public class Human {
	private int strength = 3;
	private int intelligence = 3;
	private int stealth = 3;
	private int health = 100;
	
	public Human() {
		
	}
	
	public int getHealth() {
		return this.health;
	}
	
	public int getStrength() {
		return this.strength;
	}
	
	public int getIntelligence() {
		return this.intelligence;
	}
	
	public int getStealth() {
		return this.stealth;
	}
	
	public void setHealth(int health) {
		this.health = health;
	}
	
	public void setStrength(int strength) {
		this.strength = strength;
	}
	
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
	
	public void setStealth(int stealth) {
		this.stealth = stealth;
	}
	
	public int damaged(int damage) {
		this.health -= damage;
		return damage;
	}
	
	public int healed(int heal) {
		this.health += heal;
		return heal;
	}
}
