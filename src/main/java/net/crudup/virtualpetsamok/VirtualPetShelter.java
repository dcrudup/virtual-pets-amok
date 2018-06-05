package net.crudup.virtualpetsamok;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	Map<String, Pet> pets = new HashMap<>();

	public void addPet(Pet pet) {
		pets.put(pet.getName(), pet);
	}
	
	public void adoptPet(Pet pet) {
		pets.remove(pet.getName());
	}

	public Collection<Pet> getAllPets() {
		return pets.values();
	}

	public void showAllPets() {
		for (Pet pet : pets.values()) {
			System.out.println("Name: " + pet.getName() +":" + " " + "Description: "+pet.getDescription());
		}
	}
	
	public void showAllRoboticPets() {
		for (Pet pet : pets.values()) {
			if (pet instanceof RoboticPet) {
				System.out.println("Name: " + pet.getName() + " Description: " + pet.getDescription());
			}
		}
	}
	
	public void showAllOrganicPets() {
		for (Pet pet : pets.values()) {
			if (pet instanceof OrganicPet) {
				System.out.println("Name: " + pet.getName() + " Description: " + pet.getDescription());
			}
		}
	}
	
}
