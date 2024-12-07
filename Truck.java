//Written By John Kluesener
public class Truck extends Vehicle {
	private double loadCapacity;
	private double towingCapacity;
	
	public Truck() {
		super();
		this.loadCapacity = 0;
		this.towingCapacity = 0;
	}
	public Truck(String aM, int aN, String aO, double lC, double tC) {
		super(aM, aN, aO);
		this.setLoadCapacity(lC);
		this.setTowingCapacity(tC);
	}
	// Accessors
	public double getLoadCapacity() {
		return this.loadCapacity;
	}
	public double getTowingCapacity() {
		return this.towingCapacity;
	}
	// Mutators
	public void setLoadCapacity(double lC) {
		if(lC >= 0) {
			this.loadCapacity = lC;
		}
		else {
			this.loadCapacity = 0;
		}
	}
	public void setTowingCapacity(double tC) {
		if(tC >= 0) {
			this.towingCapacity = tC;
		}
		else {
			this.towingCapacity = 0;
		}
	}
	public boolean equals(Truck aT) {
		return aT != null &&
				this.loadCapacity == aT.getLoadCapacity() &&
				this.towingCapacity == aT.getTowingCapacity();
	}
	public String toString() {
		return super.toString()+" Load Capacity: "+this.loadCapacity+" Towing Capacity: "+this.towingCapacity;
	}
}
