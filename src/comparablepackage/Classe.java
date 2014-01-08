package comparablepackage;

public class Classe implements Comparable<Classe>{
	
	private String name;
	private int quantity;
	
	
	
	public Classe(String name, int quantity) {
		this.name = name;
		this.quantity = quantity;
	}

	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getQuantity() {
		return quantity;
	}



	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public boolean equals(Object obj) {
		return this.getName().equals(((Classe)obj).getName()); 	
	}



	@Override
	// if negative "this" is before "toCompare"
	// if equal they have the same value
	// if greater "this" is after " toCompare
	
	// I would prefer if the comparision doesn't depend
	// on the order of the operators
	public int compareTo(Classe toCompare) {
		return this.quantity - toCompare.getQuantity();
	}
	
	
	
}
