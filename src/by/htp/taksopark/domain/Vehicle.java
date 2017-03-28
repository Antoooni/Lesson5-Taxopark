package by.htp.taksopark.domain;

public abstract class Vehicle {
	private String name;
	private int carCost;//$
	private double consumption; // l/100km
	private int maxSpeed; // km/h
	
	public Vehicle(){
		super();
	}
	public Vehicle(String name, int carCost, double consumption, int maxSpead) {
		this.name=name;
		this.carCost = carCost;
		this.consumption = consumption;
		this.maxSpeed = maxSpead;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCarCost() {
		return carCost;
	}

	public void setCarCost(int carCost) {
		this.carCost = carCost;
	}

	public double getConsumption() {
		return consumption;
	}

	public void setConsumption(double consumption) {
		this.consumption = consumption;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpead) {
		this.maxSpeed = maxSpead;
	}


}
