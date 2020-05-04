package be.intecbrussel.the_notebook.entities.plant_ententies;

public class Flower extends Plant   {

	public Flower(String name) {
		super(name);
	}
		
	public Flower(String name, double height) {
		super(name, height);
	}
	
	public Flower (String name, double height, Scent smell) {
		super( name, height);
		this.smell = smell;
	}

	private Scent smell;
	
	public Scent getSmell () {
		return smell;
	}
	
	public void setSmell (Scent smell) {
		this.smell = smell;
	}
	
	@Override
	public String toString() {
		return ("name: " + super.getName() + " height: "+ getHeight() + " smell: " + smell);
	}
}  
