package model.v1;

public class Drone {
	
	private int location; //Representa a posicao do drone
	
	private int id; //Mesma ID de sua GCS
	
	public Drone(int id){
		this.id = id;
		location = 0; // Drone no chao
	}

	public int getLocation(){
		return location;
	}
	
	public void move(int location){
		this.location = location;
		print();
	}
	
	public int getID(){
		return id;
	}
	
	public void print(){
		System.out.println("Drone "+id+" at position "+location);
	}
}
