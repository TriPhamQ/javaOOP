package com.phamqtri.zookeeper;

public class Gorrilla extends Mammal {
	public Gorrilla() {
		
	}
	
	public void throwStuff() {
		System.out.println("Is throwing things");
		this.changeEnergy(-5);
	}
	
	public void eatBananas() {
		System.out.println("Eating bananas");
		this.changeEnergy(10);
	}
	
	public void climb() {
		System.out.println("Climbing");
		this.changeEnergy(-10);
	}
}
