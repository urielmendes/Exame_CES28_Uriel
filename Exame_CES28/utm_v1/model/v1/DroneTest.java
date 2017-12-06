package model.v1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DroneTest {
	
	Drone drone;
	
	@Before
	public void setUp() throws Exception {
		drone = new Drone(1);
	}
	
	@Test
	public void testaIdentificacao() {
		assertEquals(drone.getID(), 1);
	}
	
	@Test
	public void testaLocalizacao() {
		assertEquals(drone.getLocation(), 0);
	}
	
	@Test
	public void testaMovimentos() {
		drone.move(23);
		
		assertEquals(drone.getLocation(), 23);
	}
}