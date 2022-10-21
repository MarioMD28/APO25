package Vehicle;

public class testVehicles {
	public static void main(String[] args) {
		System.out.println("Manufacturer: " + Vehicle.MAKE);
		System.out.println("Number of vehicles manufactured: " + Vehicle.numVehiculos);
		
		Vehicle vehiculo1 = new Vehicle("Vision");
		System.out.println(vehiculo1);
		
		Vehicle vehiculo2 = new Vehicle("Edict");
		System.out.println(vehiculo2);
		
		vehiculo2.setMake("Seer");
		System.out.println(vehiculo1);
		System.out.println(vehiculo2);
		
		Vehicle.Engine vehiculo3 = new Vehicle.Engine("Fortune");
		System.out.println("Vehicle number " + vehiculo3.getChassisNo() + " is a "
							+ vehiculo3.getModel() + " model and has an engine capacity of "
							+ vehiculo3.getCapacity() + " cc");
		
		System.out.println("Number of vehicles manufactured: " + Vehicle.numVehiculos);
	}
}
