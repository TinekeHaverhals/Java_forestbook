package be.intecbrussel.the_notebook.entities.animal.entities;

public class Carnivore extends Animal{

	public Carnivore(String name) {
		super(name);
	}
	
	public Carnivore(String name, double weight, double height, double length) {
		super(name, weight, height, length);
	}
	
	public Carnivore(String name, double weight, double height, double length, double maxFoodSize) {
		super(name, weight, height, length);
		this.maxFoodSize = maxFoodSize;
	}

	private double maxFoodSize;
	
	public double getMaxFoodSize() {
		return maxFoodSize;
	}
	
	public void setmaxFoodSize (double maxFoodSize) {
		this.maxFoodSize = maxFoodSize;
	}
	
	@Override
	public String toString() {
		return ("name: " + super.getName() + " weight: " + getWeight() + " height: " + getHeight() + " Length: " + getLenght()+
				" maxFoodSize: " + maxFoodSize );	
	}
}
