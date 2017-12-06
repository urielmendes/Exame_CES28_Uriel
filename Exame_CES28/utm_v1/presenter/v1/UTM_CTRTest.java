package presenter.v1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import model.v1.Drone;
import view.v1.GCS;

public class UTM_CTRTest {

	@InjectMocks UTM_CTR presenter;
	@Mock GCS gcs;
	@Mock Drone drone;
	
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		presenter = UTM_CTR.getInstance();
	}

	@Test
	public void testaSingleton() {
		UTM_CTR newPresenter;
		newPresenter = UTM_CTR.getInstance();
		
		assertEquals(presenter, newPresenter);
	}
}
