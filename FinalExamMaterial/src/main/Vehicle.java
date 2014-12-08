package main;
import java.util.UUID;

public class Vehicle extends Person {
	private String Name;
	private String Color;
	private int Weight;
	private Person Owner;
	
	public Vehicle(){		
	}
	
	public Vehicle(String Name, String Color, int Weight, Person Owner){

		this.Name = Name;
		this.Color = Color;
		this.Weight = Weight;
		this.Owner = Owner;
	}
	
	public void transferOwnership(Person newOwner){
		this.Owner = newOwner;
	}
}

