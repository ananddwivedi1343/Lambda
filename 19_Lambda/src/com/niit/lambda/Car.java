package com.niit.lambda;

public class Car implements Vehicle {

	private final String brand;
	public Car(String brand)
	{
		super();
		this.brand=brand;
	}

	public String getBrand() {
		// TODO Auto-generated method stub
		return "brand";
	}

	
	public String speedUp() {
		// TODO Auto-generated method stub
		return "The car is Speeding up";
	}

	
	public String slowDown() {
		// TODO Auto-generated method stub
		return "The car is slowing down";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
