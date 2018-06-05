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

	// All Pets

	public Collection<Pet> getAllPets() {
		return pets.values();
	}

	public void showAllPets() {
		for (Pet pet : pets.values()) {
			System.out.println("Name: " + pet.getName() + ":" + " " + "Description: " + pet.getDescription()
					+ " Boredom level: " + pet.getBoredom() + "Health level: " + pet.getHealth() + "Happiness level: "
					+ pet.getHappiness());
		}
	}

	// Organic Pets

	public void showAllOrganicPets() {
		for (Pet pet : pets.values()) {
			if (pet instanceof OrganicPet) {
				System.out
						.println("Name: " + pet.getName() + " Description: " + pet.getDescription() + " Hunger level: "
								+ ((OrganicPet) pet).getHunger() + " Thirst level: " + ((OrganicPet) pet).getThirst()
								 + " Waste level: " + ((OrganicPet) pet).getWaste());
			}
		}
	}

	public void feedAllOrganicPets() {
		for (Pet pet : pets.values()) {
			if (pet instanceof OrganicPet) {
				System.out.println("Name: " + pet.getName() + " Description: " + pet.getDescription()
						+ " Hunger level: " + ((OrganicPet) pet).getHunger());
			}
		}
	}

	public void waterAllOrganicPets() {
		for (Pet pet : pets.values()) {
			if (pet instanceof OrganicPet) {
				System.out.println("Name: " + pet.getName() + " Description: " + pet.getDescription()
						+ " Thirst level: " + ((OrganicPet) pet).getThirst());
			}
		}
	}

	public void cleanAllOrganicPets() {
		for (Pet pet : pets.values()) {
			if (pet instanceof OrganicPet) {
				System.out.println("Name: " + pet.getName() + " Description: " + pet.getDescription() + " Waste level: "
						+ ((OrganicPet) pet).getWaste());
			}
		}
	}

	// Robotic Pets

	public void showAllRoboticPets() {
		for (Pet pet : pets.values()) {
			if (pet instanceof RoboticPet) {
				System.out.println("Name: " + pet.getName() + " Description: " + pet.getDescription() + " Oil level: "
						+ ((RoboticPet) pet).getOilLevel());
			}
		}
	}

	public void tick() {

	}

	public Pet findPet(Pet name) {
		
		return name;
	}

}
