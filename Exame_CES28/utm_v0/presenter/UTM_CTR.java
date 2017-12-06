package presenter;
import java.util.ArrayList;
import java.util.List;

import model.Drone;
import view.GCS;

public class UTM_CTR {
	
	private static UTM_CTR instance = null;	
	private List<Drone> models = new ArrayList<Drone>();
	private List<GCS> views = new ArrayList<GCS>();
	
	protected UTM_CTR(){
		
	}
		
	public static UTM_CTR getInstance(){
		if(instance == null)
			instance = new UTM_CTR();
		
		return instance;
	}
	
	public void add(GCS gcs){
		if(views.add(gcs))
			models.add(new Drone(gcs.getID()));		
	}

	public void moveDrone(int id, int location){
		for(Drone drone : models){
			if(drone.getID() == id)
				drone.move(location);
		}
	}
	
	public void getStatus(){
		for(Drone drone : models){
			drone.print();
		}
	}
}