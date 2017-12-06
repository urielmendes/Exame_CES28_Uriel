import presenter.UTM_CTR;
import view.GCS;

public class Main {

	public static void main(String[] args) {
		
		UTM_CTR presenter;
		presenter = UTM_CTR.getInstance();
	
		GCS view1 = new GCS();
		GCS view2 = new GCS();
		GCS view3 = new GCS();
		
		view1.setPresenter(presenter);
		view2.setPresenter(presenter);
		view3.setPresenter(presenter);
		
		view1.getStatus();
		
		view1.moveDrone(1);
		view2.moveDrone(73);
		view3.moveDrone(100);
		view1.moveDrone(19);
	}

}
