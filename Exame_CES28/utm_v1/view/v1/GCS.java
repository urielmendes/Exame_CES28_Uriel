package view.v1;

import presenter.v1.UTM_CTR;

public class GCS {
	
	private static int count = 0 ;
	private int id;
	private UTM_CTR presenter;
	
	public GCS(){
		count++;
		id = count;
	}
	
	public int getID(){
		return id;
	}

	public void setPresenter(UTM_CTR presenter){
		this.presenter = presenter;
		this.presenter.add(this);
	}
	
	public void moveDrone(int location){
		presenter.moveDrone(id, location);
	}
	
	public void getStatus(){
		presenter.getStatus();
	}
}
