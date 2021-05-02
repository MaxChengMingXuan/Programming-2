package exercise_4_2;

public class Lemon extends Fruit{
	private int quantity;//in RM
	private int mass;//in kg
	
	public Lemon(String name, String taste,int quantity,int mass) {
		super(name,taste);
		System.out.println("Lemon constructor is invoked");
		this.quantity=quantity;
		this.mass=mass;
		System.out.println("");;
	}
	
	//Overriding print hint method in fruit class
	public void printHint() {
		System.out.println("This is a type of lemon.");
		System.out.println("It tastes "+super.getTaste()+".");
	}
	
	public double totalMass() {
		double pricePerMass=this.quantity*this.mass;
		return pricePerMass;
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	
	public int getMass() {
		return this.mass;
	}
	
	//Overriding toString of Fruit class
	public String toString() {
		return super.toString()
			  +"\nMass  : "+mass+"kg"
			  +"\nNumber: "+quantity
			  +"\nTotal mass: "+totalMass()+"kg";
	}

}
