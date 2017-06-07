package com.phamqtri.zookeeper;

public class DragonTest {
	public static void main(String[] args) {
		Dragon eragon = new Dragon();
		
		eragon.attackTown();
		eragon.displayEnergy();
		eragon.eatHumans();
		eragon.displayEnergy();
		eragon.attackTown();
		eragon.displayEnergy();
	}
}
