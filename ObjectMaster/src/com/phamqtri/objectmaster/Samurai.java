package com.phamqtri.objectmaster;

public class Samurai extends Human {
	private static int counter;
	
	public Samurai() {
		this.setHealth(200);
		counter++;
	}
	
	public int attack(Human enemy) {
		System.out.println(this.getClass().getSimpleName() + " Attacks " + enemy.getClass().getSimpleName() + " hit for " + this.getStrength());
		return enemy.damaged(this.getStrength());
	}
	
	public int deathBlow(Human enemy) {
		System.out.println(this.getClass().getSimpleName() + " used half health (" + this.getHealth()/2 + ") to kill deal death blow on " + enemy.getClass().getSimpleName());
		this.damaged(this.getHealth()/2);
		return enemy.damaged(enemy.getHealth());
	}
	
	public int meditate() {
		System.out.println(this.getClass().getSimpleName() + " meditated to heal self for " + this.getHealth()/2);
		return this.healed(this.getHealth()/2);
	}
	
	public int howMany() {
		System.out.println(counter + " samurais was created");
		return counter;
	}
}
