package view.v1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import presenter.v1.UTM_CTR;

public class GCSTest {
	
	@InjectMocks GCS gcs;
	@Mock UTM_CTR presenter;
	
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testaID() {
		assertEquals(1,gcs.getID());
		
		gcs = new GCS();
		assertEquals(2,gcs.getID());
	}

	@Test
	public void testaChamadaPresenter() {
		
		Mockito.doNothing().when(presenter).moveDrone(Mockito.anyInt(), Mockito.anyInt());
		
		Mockito.doNothing().when(presenter).getStatus();
	}
}
