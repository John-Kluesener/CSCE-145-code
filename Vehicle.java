//Written By John Kluesener

public class Vehicle {
	private String manufacturersName;
	private int numberOfCylinders;
	private String ownersName;
	
	public Vehicle() {
		this.manufacturersName = "none";
		this.numberOfCylinders = 1;
		this.ownersName = "none";
	}
	public Vehicle(String aM, int aN, String aO) {
		this.setManufacturersName(aM);
		this.setNumberOfCylinders(aN);
		this.setOwnersName(aO);
	}
	// Accessors
	public String getManufacturersName() {
		return this.manufacturersName;
	}
	public int getNumberOfCylinders() {
		return this.numberOfCylinders;
	}
	public String getOwnersName() {
		return this.ownersName;
	}
	// Mutators
	public void setManufacturersName(String aM) {
		if(aM != null) {
			this.manufacturersName = aM;
		}
		else {
			this.manufacturersName = "none";
		}
	}
	public void setNumberOfCylinders(int aN) {
		if(aN > 0) {
			this.numberOfCylinders = aN;
		}
		else {
			this.numberOfCylinders = 1;
		}
	}
	public void setOwnersName(String aO) {
		if(aO != null) {
			this.ownersName = aO;
		}
		else {
			this.ownersName = "none";
		}
	}
	public boolean equals(Vehicle aV) {
		return aV != null &&
				this.manufacturersName.equalsIgnoreCase(aV.getManufacturersName()) &&
				this.numberOfCylinders == aV.getNumberOfCylinders() &&
				this.ownersName.equalsIgnoreCase(aV.getOwnersName());
	}
	public String toString() {
		return "Manufacturer's Name: "+this.manufacturersName+" Number of Cylinders: "+this.numberOfCylinders+" Owner: "+this.ownersName;
	}
}
