package be.intecbrussel.the_notebook.entities.animal.entities;

import java.util.HashSet;
import java.util.Set;

import be.intecbrussel.the_notebook.entities.plant_ententies.Plant;

public class Omnivore extends Animal {
	
	public Omnivore(String name) {
		super(name);
	}
	
	public Omnivore(String name, double weight, double height, double length) {
	super(name, weight, height, length);
    }
	
	public Omnivore(String name, double weight, double height, double length, Set<Plant> plantDiet) {
		super(name, weight, height, length);
		this.plantDiet = plantDiet;
	}
	
	private Set<Plant> plantDiet = new HashSet<Plant>();
	private double maxFoodSize;
	
	public Set<Plant> getPlantDiet (){
		return plantDiet;
	}
	
	public void setPlantDiet ( Set<Plant> plantDiet) {
		this.plantDiet = plantDiet;
	}
	
	public double getMaxFoodSize() {
		return maxFoodSize;
	}
	
	public void setMaxFoodSize (double maxFoodSize) {
		this.maxFoodSize = maxFoodSize;
	}
	
	public void addPlantToDiet(Plant plants) {
		this.plantDiet.add(plants);
		
	}
	
	@Override
	public String toString() {
		return ("name: " + super.getName() + " weight: " + getWeight() + " height: " + getHeight() + " Length: " + getLenght()+
				" PlantDiet: " + plantDiet );	
	}
	
}