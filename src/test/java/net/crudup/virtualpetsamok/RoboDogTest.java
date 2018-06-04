package net.crudup.virtualpetsamok;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RoboDogTest {
	                                  //boredom, health, happiness, oilLevel
	
	RoboDog anyRoboDog = new RoboDog("name", 10, 10, 10, 10, "description");
	
	@Test
	public void shouldReturnAllDogProperties() {
		String name = anyRoboDog.getName();
		int boredom = anyRoboDog.getBoredom();
		int health = anyRoboDog.getHealth();
		int happiness = anyRoboDog.getHappiness();
		int oilLevel = anyRoboDog.getOilLevel();
		String description = anyRoboDog.getDescription();
		
		assertEquals("name", name);
		assertEquals(10, boredom);
		assertEquals(10, health);
		assertEquals(10, happiness);
		assertEquals(10, oilLevel);
		assertEquals("description", description);
	}
	
	@Test
	public void shouldHavePlayDescreasesBoredomBy5() {
		anyRoboDog.play();
		int boredom = anyRoboDog.getBoredom();
		assertEquals(5, boredom);
	}
	
	@Test
	public void shouldHaveWalkIncreaseHappinessBy5() {
		anyRoboDog.walk();
		int happiness = anyRoboDog.getHappiness();
		assertEquals(15, happiness);
	}
	
	@Test
	public void shouldHaveHealthDecreaseBy5() {
		anyRoboDog.reduceHealth();
		int health = anyRoboDog.getHealth();
		assertEquals(5, health);
	}
	
	
	@Test
	public void shouldHaveOilLevelDecreaseBy5() {
		anyRoboDog.reduceOilLevel();
		int oilLevel = anyRoboDog.getOilLevel();
		assertEquals(5, oilLevel);
	}
	
	@Test
	public void shouldDescreaseOilLevelBy5BecauseOfPlay() {
		anyRoboDog.play();
		int oilLevel = anyRoboDog.getOilLevel();
		assertEquals(5, oilLevel);
	}
	
	@Test
	public void shouldIncreaseOilLevelAfterAddingOilBy5() {
		anyRoboDog.increaseOilLevel();
		int oilLevel = anyRoboDog.getOilLevel();
		assertEquals(15, oilLevel);
	}
	
	
	
	
	
	
}
