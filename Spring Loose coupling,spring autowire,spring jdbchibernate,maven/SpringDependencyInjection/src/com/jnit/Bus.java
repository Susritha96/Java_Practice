package com.jnit;

public class Bus implements Vehicle {
	private String fuelType;
	private int speed;
	
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void move() {
		System.out.println("Bus has Started");
		System.out.println("Bus Speed "+speed);
		System.out.println("Bus Type "+fuelType);
	}

	

}
