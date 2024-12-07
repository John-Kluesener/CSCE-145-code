//Written by John Kluesener

public class Car extends Vehicle {
	private double gasMileage;
	private int numberOfPassengers;
	
	public Car() {
		super();
		this.gasMileage = 0;
		this.numberOfPassengers = 1;
	}
	public Car(String aM, int aN, String aO, double gM, int nP) {
		super(aM, aN, aO);
		this.setGasMileage(gM);
		this.setNumberOfPassengers(nP);
	}
	public double getGasMileage() {
		return this.gasMileage;
	}
	public int getNumberOfPassengers() {
		return this.numberOfPassengers;
	}
	// Mutators
	public void setGasMileage(double gM) {
		if(gM > 0) {
			this.gasMileage = gM;
		}
		else {
			this.gasMileage = 0;
		}
	}
	public void setNumberOfPassengers(int nP) {
		if(nP >= 0) {
			this.numberOfPassengers = nP;
		}
		else {
			this.numberOfPassengers = 1;
		}
	}
	// Other Methods
	public boolean equals(Car aC) {
		return aC != null &&
				this.gasMileage == aC.getGasMileage() &&
				this.numberOfPassengers == aC.getGasMileage();
	}
	public String toString() {
		return super.toString()+" Gas Mileage: "+this.gasMileage+" Passenger Capacity: "+this.numberOfPassengers;
	}
}
