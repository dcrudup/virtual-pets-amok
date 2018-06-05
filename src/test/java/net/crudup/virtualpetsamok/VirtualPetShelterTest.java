package net.crudup.virtualpetsamok;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

public class VirtualPetShelterTest {

	VirtualPetShelter virtualPetShelter = new VirtualPetShelter();
	
	Dog lucky;
	Cat sadie;
	RoboDog bella;
	
	@Before
	public void setUp(){
	lucky = new Dog(null, 0, 0, 0, 0, 0, 0, null);
	sadie = new Cat(null, 0, 0, 0, 0, 0, 0, null);
	bella = new RoboDog(null, 0, 0, 0, 0, null);
	}

	@Test
	public void shouldBeAbleToAllowIntakeOfPets() {
		Dog dog = new Dog(null, 0, 0, 0, 0, 0, 0, null);
		virtualPetShelter.addPet(dog);
		Collection<Pet> check = virtualPetShelter.getAllPets();
		assertThat(check, contains(dog));
	}
	
	@Test
	public void shouldBeAbleToAddTwoDifferentSpeciesOfPets() {
		Dog dog = new Dog("1", 0, 0, 0, 0, 0, 0, "2");
		RoboCat roboCat = new RoboCat("3", 0, 0, 0, 0, "4");
		virtualPetShelter.addPet(dog);
		virtualPetShelter.addPet(roboCat);
		Collection<Pet> check = virtualPetShelter.getAllPets();
		assertThat(check, containsInAnyOrder(dog, roboCat));
	}
	
	@Test
	public void shelterShouldBeAbleToIntakeACollectionOfPets() {
		
		virtualPetShelter.addPet(lucky);
		virtualPetShelter.addPet(sadie);
		Collection<Pet> admittedPets = virtualPetShelter.getAllPets();
		assertThat(admittedPets, containsInAnyOrder(sadie));
	}
	
	@Test
	public void shelterShouldBeAbleToAllowAdoptions() {
		virtualPetShelter.addPet(lucky);
		virtualPetShelter.addPet(sadie);
		virtualPetShelter.adoptPet(sadie);
		Collection<Pet> admittedPets = virtualPetShelter.getAllPets();
		assertThat(admittedPets, containsInAnyOrder(lucky));
		
		//or
		
		assertThat(admittedPets.size(), is(1));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
