package be.intecbrussel.the_notebook.entities.plant_ententies;

public class Weed extends Plant {

	public Weed(String name) {
		super(name);
	}
	
	public Weed (String name, double height) {
		super(name, height);
	}
	
	public Weed (String name, double height, double area) {
		super(name, height);
		this.area = area;
	}

	private double area;
	
	public double getArea() {
		return area;
	}
	
	public void setArea (double area) {
		this.area = area;
	}
	
	@Override 
	public String toString() {
		return ("name: " + super.getName() + " height: " +  getHeight() + " area: " + area  );
	}
}

