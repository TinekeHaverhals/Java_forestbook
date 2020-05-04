package be.intecbrussel.the_notebook.entities.animal.entities;

import java.util.HashSet;
import java.util.Set;

import be.intecbrussel.the_notebook.entities.plant_ententies.Plant;

public class Herbivore extends Animal {

	public Herbivore(String name) {
		super(name);
	}
	
	public Herbivore(String name, double weight, double height, double length) {
		super(name, weight, height, length);
	}
	
	public Herbivore(String name, double weight, double height, double length, Set<Plant> plantDiet) {
		super(name, weight, height, length);
		this.plantDiet = plantDiet;
	}
	
	private Set<Plant> plantDiet = new HashSet<Plant>();
	
	public Set<Plant> getPlantDiet (){
		return plantDiet;
	}
	
	public void setPlantDiet ( Set<Plant> plantDiet) {
		this.plantDiet = plantDiet;
	}
	
	public void addPlantToDiet(Plant plants) {
		this.plantDiet.add(plants);
	}
	
	public void printDiet() {
		 for (Plant plantDiet : this.plantDiet){
	            System.out.println(plantDiet);
	     }
	}
	
	@Override
	public String toString() {
		return ("name: " + super.getName() + " weight: " + getWeight() + " height: " + getHeight() + " Length: " + getLenght()+
				" PlantDiet: " + plantDiet );	
	}
	
}