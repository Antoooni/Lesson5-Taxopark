package by.htp.taksopark.main;

import by.htp.taksopark.domain.Car;
import by.htp.taksopark.domain.Garage;
import by.htp.taksopark.domain.Truck;
import by.htp.taksopark.domain.Vehicle;

public class Main {

	public static void main(String[] args) {

		Vehicle truck1 = new Truck();
		truck1.setCarCost(200000);
		truck1.setName("Peterbilt");
		truck1.setConsumption(30);
		truck1.setMaxSpeed(120);

		Vehicle truck2 = new Truck();
		truck2.setCarCost(70000);
		truck2.setName("MAZ");
		truck2.setConsumption(25);
		truck2.setMaxSpeed(90);

		Garage vehicle = new Garage();
		Car car = new Car();
		car.setCarCost(40000);
		car.setName("BMW");
		car.setConsumption(5.5);
		car.setMaxSpeed(250);

		//add to array
		vehicle.addVehicleArray(car);
		vehicle.addVehicleArray(truck1);
		vehicle.addVehicleArray(truck2);
		System.out.println("Your garage: ");
		vehicle.getVehicleArray();
		System.out.println("Total cost of taxopark: " + vehicle.totalGarageCost(vehicle) + "$");
		vehicle.sortByConsumption(vehicle);
		System.out.println("Sorted garage by consumption: ");
		vehicle.getVehicleArray();
		// Speed range (separated by a dash)
		String maxSpeedInRange = "100-250";
		System.out.println("The vehicle with max spead in range " + maxSpeedInRange + " km/h: ");
		vehicle.getSpeedVehicle(vehicle, maxSpeedInRange);
		vehicle.getVehicleArray();
	}

}
