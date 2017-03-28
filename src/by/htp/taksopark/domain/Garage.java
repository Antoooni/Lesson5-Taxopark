package by.htp.taksopark.domain;

public class Garage {

	private int curentSize;
	private int newSize;
	private int size = curentSize = 1;
	private int position = 0;

	Vehicle vehicleArray[] = new Vehicle[size];

	public Vehicle[] getVehicleArray() {
		int curentSize = 0;
		for (Vehicle e : vehicleArray) {
			if (e != null) {
				curentSize = curentSize + 1;
			}
		}
		int i = 0;
		if (vehicleArray[i] == null) {
			System.out.println("Your garage is empty ");
		} else {
			if (vehicleArray[i] != null) {
				for (i = 0; i < curentSize; i++) {

					System.out.println(
							"The vehicle " + vehicleArray[i].getName() + " price " + vehicleArray[i].getCarCost() + "$"
									+ " and average consumption: " + vehicleArray[i].getConsumption() + " l/100km"
									+ " and max speed " + vehicleArray[i].getMaxSpeed() + " km/h");
				}
			}
		}
		return vehicleArray;
	}

	public Vehicle[] addVehicleArray(Vehicle vehicle) {
		for (int j = 0; j < vehicleArray.length; j++) {
			if (vehicleArray[j] == null) {
				position = j;
				j = vehicleArray.length;
			} else if (j >= position) {
				// increase array capacity
				newSize = (curentSize * 3) / 2 + 1;
				Vehicle hehicleArrayExtended[] = new Vehicle[newSize];
				// System.arraycopy(vehicleArray, 0, hehicleArrayExtended,
				// 0,vehicleArray.length);
				for (int i = 0; i < vehicleArray.length; i++) {
					hehicleArrayExtended[i] = vehicleArray[i];
				}
				curentSize = newSize;
				vehicleArray = hehicleArrayExtended;
			}
		}
		vehicleArray[position] = vehicle;
		return vehicleArray;
	}

	public int totalGarageCost(Garage vehicle) {
		int curentSize = 0;
		for (Vehicle e : vehicleArray) {
			if (e != null) {
				curentSize = curentSize + 1;
			}
		}
		int totalCost = 0;
		for (int i = 0; i < curentSize; i++) {
			totalCost += vehicleArray[i].getCarCost();
		}
		return totalCost;
	}

	public Vehicle[] sortByConsumption(Garage vehicle) {
		int curentSize = 0;
		for (Vehicle e : vehicleArray) {
			if (e != null) {
				curentSize = curentSize + 1;
			}
		}
		int i = 1;
		while (i < curentSize) {
			if (i == 0 || vehicleArray[i - 1].getConsumption() <= vehicleArray[i].getConsumption())
				i++;
			else {
				Vehicle temp = vehicleArray[i];
				vehicleArray[i] = vehicleArray[i - 1];
				vehicleArray[i - 1] = temp;
				i--;
			}
		}
		return vehicleArray;
	}

	public Vehicle[] getSpeedVehicle(Garage vehicle, String maxSpeed) {
		Vehicle hehicleArraySpeed[] = new Vehicle[newSize];
		int curentSize = 0;
		for (Vehicle e : vehicleArray) {
			if (e != null) {
				curentSize = curentSize + 1;
			}
		}
		String[] randeValue = maxSpeed.split("-");
		int j = 0;
		for (int i = 0; i < curentSize; i++) {
			if (vehicleArray[i].getMaxSpeed() >= Double.parseDouble(randeValue[0])
					&& vehicleArray[i].getMaxSpeed() <= Double.parseDouble(randeValue[1])) {
				hehicleArraySpeed[j] = vehicleArray[i];
				j = j + 1;
			}
		}
		vehicleArray = hehicleArraySpeed;
		return vehicleArray;
	}

}
