package Vehicle;

public class Vehicle {
	public static String MAKE = "Augur";
	public static int numVehiculos = 0;
	
	private String chassisNo;
	private String model;
	
	public Vehicle(String model) {
		numVehiculos++;
		chassisNo = "ch" + numVehiculos;
		this.model = model;
		System.out.println("Vehicle manufactured");
	}

	public static class Engine extends Vehicle{
		private static final String MAKE = "Predicter";
		private static final int CAPACITY = 1600;
		
		public Engine(String model) {
			super(model);
		}
		
		public static String getMAKE() {
			return MAKE;
		}
		
		public static int getCapacity() {
			return CAPACITY;
		}
	}
	
	public void setMake(String MAKE) {
		this.MAKE = MAKE;
	}
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	public String getChassisNo() {
		return chassisNo;
	}

	public void setChassisNo(String chassisNo) {
		this.chassisNo = chassisNo;
	}

	public String toString() {
		return "The vehicle is manufacturated by: " + Vehicle.MAKE
				+"\nThe model type is " + this.model
				+"\nThe chassis number is " + chassisNo
				+"\nThe engine make is " + Engine.getMAKE()
				+"\nThe engine capacity is " + Engine.getCapacity() + "cc";
	}
}
