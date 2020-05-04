package be.intecbrussel.the_notebook.entities.plant_ententies;

public  class Bush extends Plant{
	
	public Bush(String name) {
		super(name);
	}
	
	public Bush(String name, double height) {
		super(name, height);
	}
	
	public Bush(String name, double height, String fruit, LeafType leafType) {
		super(name, height);
		this.fruit = fruit;
		this.leafType = leafType;
	}

	private String fruit;
	private LeafType leafType;
	
	public String getFruit () {
		return fruit;
	}
	
	public void setFruit (String fruit) {
		this.fruit = fruit;
	}
	public LeafType getLeafType () {
		return leafType;
	}
	
	public void setLeafType (LeafType leafType) {
		this.leafType = leafType;
	}
	
	@Override
	public String toString() {
		return ("name: " + super.getName() + " height: " + getHeight() + " fruit: " + fruit + " leadType= " + leafType );
		
	}

}
