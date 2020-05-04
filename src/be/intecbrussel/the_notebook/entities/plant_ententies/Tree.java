package be.intecbrussel.the_notebook.entities.plant_ententies;

public class Tree extends Plant{

	public Tree(String name) {
		super(name);
	}
	
	public Tree (String name, double height) {
		super(name, height);
	}
	
	public Tree (String name, double height, LeafType leafType) {
		super(name, height);
		this.leafType = leafType;
	}
	
	private LeafType leafType;

	
	public LeafType getLeafType () {
	return leafType;
	}
	
	public void setLeafType (LeafType leafType) {
		this.leafType = leafType;
	}
	
	@Override 
	public String toString() {
		return ("name: " + super.getName() + " height: "  + getHeight() + " leafType: " + leafType );
		
	}
}
