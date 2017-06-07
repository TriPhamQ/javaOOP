package com.phamqtri.zookeeper;

public class Dragon extends Mammal {	
	public Dragon() {
		this.setEnergy(300);
	}
	
	public void eatHumans() {
		System.out.println("Eating humans");
		this.changeEnergy(25);
	}
	
	public void fly() {
		System.out.println("Flying");
		this.changeEnergy(-50);
	}
	
	public void attackTown() {
		System.out.println("Attacking town, Town is on fire!");
		this.changeEnergy(-100);
	}
}
