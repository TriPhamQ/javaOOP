package com.phamqtri.zookeeper;

public class Mammal {
	private int energyLevel = 100;
	
	public int displayEnergy() {
		System.out.println(this.energyLevel);
		return this.energyLevel;
	}
	
	public void changeEnergy(int energy) {
		this.energyLevel += energy;
	}
	
	public void setEnergy(int energy) {
		this.energyLevel = energy;
	}
}
