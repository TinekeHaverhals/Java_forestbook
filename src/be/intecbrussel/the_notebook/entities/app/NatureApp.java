package be.intecbrussel.the_notebook.entities.app;

import be.intecbrussel.the_notebook.entities.animal.entities.Animal;
import be.intecbrussel.the_notebook.entities.animal.entities.Carnivore;
import be.intecbrussel.the_notebook.entities.animal.entities.Herbivore;
import be.intecbrussel.the_notebook.entities.animal.entities.Omnivore;
import be.intecbrussel.the_notebook.entities.plant_ententies.Bush;
import be.intecbrussel.the_notebook.entities.plant_ententies.Flower;
import be.intecbrussel.the_notebook.entities.plant_ententies.LeafType;
import be.intecbrussel.the_notebook.entities.plant_ententies.Plant;
import be.intecbrussel.the_notebook.entities.plant_ententies.Scent;
import be.intecbrussel.the_notebook.entities.plant_ententies.Tree;
import be.intecbrussel.the_notebook.entities.plant_ententies.Weed;
import be.intecbrussel.the_notebook.entities.service.ForestNotebook;

public class NatureApp {

	public static void main(String[] args) {
		
		ForestNotebook forestNotebook = new ForestNotebook();
		Herbivore plantDiet=new Herbivore("plantDiet");
	
		//public Bush(String name, double height, String fruit, LeafType leafType)
		Plant plant1 = new Bush("Raspberry ",3 , "Raspberry ", LeafType.ROUND );
		plantDiet.addPlantToDiet(plant1);
		forestNotebook.addPlant(plant1);
		
		//public Flower (String name, double height, Scent smell)
		Plant plant2 = new Flower("Tulip ", 1 , Scent.SWEET );
		Plant plant3 = new Flower("Rose ", 1 , Scent.SWEET);
		plantDiet.addPlantToDiet(plant2);
		plantDiet.addPlantToDiet(plant3);
		forestNotebook.addPlant(plant2);
		forestNotebook.addPlant(plant3);
		
		//public Tree (String name, double height, LeafType leafType)
		Plant plant4 = new Tree("Pine tree ", 20 , LeafType.NEEDLE);
		plantDiet.addPlantToDiet(plant4);
		forestNotebook.addPlant(plant4);
		
		//public Weed (String name, double height, double area)
		Plant plant5 = new Weed("Nettles ", 2 , 80);
		plantDiet.addPlantToDiet(plant5);
		forestNotebook.addPlant(plant5);
	
//*****************************************************************************	
		
		//public Carnivore(String name, double weight, double height, double length, double maxFoodSize)
		Animal animal1 = new Carnivore ("Owl", 2, 0.8 , 0.9 , 2);
		Animal animal2 = new Carnivore ("Lion", 160, 2.5, 2.8, 4);
		Animal animal3 = new Carnivore ("Bear", 500, 3, 2.4, 3);
		forestNotebook.addAnimal(animal1);
		forestNotebook.addAnimal(animal2);
		forestNotebook.addAnimal(animal3);
		
		//public Herbivore(String name, double weight, double height, double length, Set<Plant> plantDiet)
		Animal animal4 = new Herbivore ("Gorilla", 160, 1.6, 1.7, plantDiet.getPlantDiet());
		Animal animal5 = new Herbivore ("Elephant" ,4000 , 4, 2, plantDiet.getPlantDiet() );
		Animal animal6 = new Herbivore ("Sheep" , 80, 1.3, 1.5, plantDiet.getPlantDiet());
		forestNotebook.addAnimal(animal4);
		forestNotebook.addAnimal(animal5);
		forestNotebook.addAnimal(animal6);
		
		//public Omnivore(String name, double weight, double height, double length, Set<Plant> plantDiet)
		Animal animal7 = new Omnivore ("Hedgehog", 0.9, 0.3 , 0.4 , plantDiet.getPlantDiet());
		Animal animal8 = new Omnivore ("Pig", 250, 1, 1.2, plantDiet.getPlantDiet());
		Animal animal9 = new Omnivore ("Raccoon", 7, 0.6, 0.8, plantDiet.getPlantDiet());
		forestNotebook.addAnimal(animal7);
		forestNotebook.addAnimal(animal8);
		forestNotebook.addAnimal(animal9);
		
//*****************************************************************************	
		System.out.println("----------PLANTS----------");
		System.out.println("number of plants : " + forestNotebook.getPlantCount());
		
		System.out.println("---------------------------");
		
		System.out.println("Name of the plants");
		forestNotebook.sortPlantsByName();
		
		System.out.println("---------------------------");
		
		System.out.println("Plants sorted by height");
		forestNotebook.sortPlantsByHeight();
		
		System.out.println("----------ANIMALS----------");
		
		System.out.println("number of animals: " + forestNotebook.getAnimalCount());
		
		System.out.println("---------------------------");
		
		System.out.println("Name of the animals");
		forestNotebook.sortAnimalsByName();
		
		System.out.println("---------------------------");
		
		System.out.println("animals sorted by height");
		forestNotebook.sortAnimalsByHeight();
		
		System.out.println("---------------------------");
	
		System.out.println("print Carnivores");
		forestNotebook.printCarnivores();
		
		System.out.println("---------------------------");
		
		System.out.println("print Herbivores");
		forestNotebook.printHerbivores();
		
		System.out.println("---------------------------");
		
		System.out.println("print Omnivores");
		forestNotebook.printOmnivores();;
		
		System.out.println("---------------------------");
		
		System.out.println("print notebook");
		forestNotebook.printNotebook();
		
	}
}