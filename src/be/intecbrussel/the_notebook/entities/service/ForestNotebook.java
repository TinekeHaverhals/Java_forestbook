package be.intecbrussel.the_notebook.entities.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import be.intecbrussel.the_notebook.entities.animal.entities.Animal;
import be.intecbrussel.the_notebook.entities.animal.entities.Carnivore;
import be.intecbrussel.the_notebook.entities.animal.entities.Herbivore;
import be.intecbrussel.the_notebook.entities.animal.entities.Omnivore;
import be.intecbrussel.the_notebook.entities.plant_ententies.Plant;

public class ForestNotebook {

	private List<Carnivore> carnivores = new ArrayList<Carnivore>();
	private List<Omnivore> omnivores = new ArrayList<Omnivore>();
	private List<Herbivore> herbivores = new ArrayList<Herbivore>();
	private int plantCount;
	private int animalCount;
	private List<Animal> animals = new ArrayList<Animal>();
	private List<Plant> plants = new ArrayList<Plant>();
	
	public ForestNotebook() {
		
	}
	
	public List<Carnivore> getCarnivores(){
		return carnivores;
	}
	
	public void setCarnivores (List<Carnivore> carnivores) {
		this.carnivores = carnivores;
	}
	
	public List<Omnivore> getOmnivore(){
		return omnivores;
	}
	
	public void setOmnivores (List<Omnivore> omnivores) {
		this.omnivores = omnivores;
	}
	
	public List<Herbivore> getHerbivores(){
		return herbivores;
	}
	
	public void setHerbivores (List<Herbivore> herbivores) {
		this.herbivores = herbivores;
	}
	
	public int getAnimalCount() {
		return animalCount;
	}

	public void addAnimal(Animal animal) {
		if(animals.contains(animal))
			System.out.println("The animal is already in the list");
		else {
			animals.add(animal);
			this.animalCount++;
			
			} if (animal instanceof Carnivore)
			carnivores.add((Carnivore) animal);
		
			else if (animal instanceof Herbivore)
			herbivores.add((Herbivore) animal);
		
			else
			omnivores.add((Omnivore) animal);
	}

	public void sortAnimalsByName() {
		this.animals.stream().sorted(Comparator.comparing(Animal::getName)).forEach(System.out::println);
	}
	
	public void sortAnimalsByHeight() {
		this.animals.stream().sorted(Comparator.comparing(Animal::getHeight)).forEach(System.out::println);
	}

	public void printCarnivores() {
		for (Animal animal : carnivores) {
			System.out.println(animal);
		}
	}

	public void printHerbivores() {
		for (Animal animal : herbivores) {
			System.out.println(animal);
		}
	}

	public void printOmnivores() {
		for (Animal animal : omnivores) {
			System.out.println(animal);
		}
	}
	
	public int getPlantCount() {
		return plantCount;
	}
	
	public void addPlant(Plant plant) {
		if (plants.contains(plant))
			System.out.println("The plant is already in the list");
		else {
			plants.add(plant);
			this.plantCount++;
		}
	}
	
	public void sortPlantsByName() {
		this.plants.stream().sorted(Comparator.comparing(Plant::getName)).forEach(System.out::println);
	}
	
	public void sortPlantsByHeight() {
		this.plants.stream().sorted(Comparator.comparing(Plant::getHeight)).forEach(System.out::println);
	}

	public void printNotebook() {
		for (Plant plant : plants) {
			System.out.println( plant.getName());
		}
		for (Animal animal : animals) {
			System.out.println (animal.getName());
		}
	}
}