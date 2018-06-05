package net.crudup.virtualpetsamok;

import java.util.Collection;
import java.util.Scanner;

public class VirtualPetsAMOKApp {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);
		
		VirtualPetShelter virtualPetShelter = new VirtualPetShelter();

		Pet dog = new Dog("Lucky", 25, 25, 25, 25, 25, 25, "Organic Dog");
		Pet cat = new Cat("Sadie", 25, 25, 25, 25, 25, 25, "Organic Cat");
		Pet robodog = new RoboDog("Bella", 25, 25, 25, 25, "Robotic Dog");
		Pet robocat = new RoboCat("Charlie", 25, 25, 25, 25, "Robotic Cat");

		virtualPetShelter.addPet(dog);
		virtualPetShelter.addPet(cat);
		virtualPetShelter.addPet(robodog);
		virtualPetShelter.addPet(robocat);
		
		
		Collection<Pet> pets = virtualPetShelter.getAllPets();

		System.out.println("Welcome the Virtual Pet Shelter");
		System.out.println();
		System.out.println("Here's all of the pets in my shelter: ");
		System.out.println();
		
		for(Pet shelterPets : virtualPetShelter.getAllPets()) {
			System.out.println(shelterPets.getName() + " " + shelterPets.getDescription());
		}
		
		//virtualPetShelter.showAllPets();

		System.out.println();

		// Display Status
		
		System.out.println("Here are the current stats for all of our pets: ");
		
		for (Pet pet : virtualPetShelter.getAllPets()) {
			System.out.println(pet.getName() + "\t" + " " + "\t" + pet.getDescription() + "\t" + pet.getHealth()
			+ "\t" + pet.getHappiness() + "\t" + pet.getBoredom());
			System.out.println();
		}
		
		for (Pet pet : virtualPetShelter.showAllOrganicPets(); {
			if (pet instanceof OrganicPet) {
				System.out
						.println("Name: " + pet.getName() + " Description: " + pet.getDescription() + " Hunger level: "
								+ ((OrganicPet) pet).getHunger() + " Thirst level: " + ((OrganicPet) pet).getThirst()
								 + " Waste level: " + ((OrganicPet) pet).getWaste());
			}
		}
	
		for (Pet pet : virtualPetShelter.showAllRoboticPets(); {
		if (pet instanceof RoboticPet) {
			System.out.println("Name: " + pet.getName() + " Description: " + pet.getDescription() + " Oil level: "
					+ ((RoboticPet) pet).getOilLevel());
		}
	}

		String choice = "";

		do {
			System.out.println();
			System.out.println("Please choose from the following options below:");
			System.out.println();
			System.out.println("Option 1: Feed the Organic Pets");
			System.out.println("Option 2: Water the Organic Pets");
			System.out.println("Option 3: Oil the Robotic Pets");
			System.out.println("Option 4: Walk a Pet");
			System.out.println("Option 5: Play with a Pet");
			System.out.println("Option 6: Adopt a Pet");
			System.out.println("Option 7: Admit a Pet");
			System.out.println("Option 8: Clean the Dog Crates");
			System.out.println("Option 9: Clean the Litter Boxes");
			System.out.println("Option 10: Find a Pet");
			System.out.println("Option 11: Exit the System");
			choice = userInput.nextLine();

			System.out.println();


			if (choice.equals("1")) {
				
				// Tick instanceof OrganicPet: feed
				
				for (Pet pet : pets.values()) {
					if (pet instanceof OrganicPet) {
						System.out.println("Name: " + pet.getName() + " Description: " + pet.getDescription()
								+ " Hunger level: " + ((OrganicPet) pet).getHunger());
					}

				}
				
				System.out.println();
				System.out.println("You've chosen to feed all of the organic pets.");
				System.out.println();

			} else if (choice.equals("2")) {

				// Tick instanceof OrganicPet: water
				System.out.println("You've chose to water all of the organic pets.");
				System.out.println();
				virtualPetShelter.showAllOrganicPets();
				System.out.println();

			} else if (choice.equals("3")) {

				// Tick instanceof RoboticPet: oil

				System.out.println("You've chosen to oil all of the robotic pets.");
				System.out.println();
				virtualPetShelter.showAllRoboticPets();
				System.out.println();
				
			} else if (choice.equals("4")) {

				// Walk all of the pets

				System.out.println("You have chosen to walk all of the pets.");
				System.out.println();
				virtualPetShelter.showAllPets();
				System.out.println();

			} else if (choice.equals("5")) {

				// Play with a pet

				System.out.println("You have chosen to play with a pet.");
				System.out.println();
				virtualPetShelter.showAllPets();
				System.out.println();

			} else if (choice.equals("6")) {

				// adopt a pet

				System.out.println("You have chosen to adopt a pet.");
				System.out.println();
				virtualPetShelter.showAllPets();
				System.out.println();

			} else if (choice.equals("7")) {

				// Intake Pets

				System.out.println("You would like to admit a pet.");
				System.out.println();
				virtualPetShelter.showAllPets();
				System.out.println();

			} else if (choice.equals("8")) {

				System.out.println("You have chosen to clean the dog crates.");
				System.out.println();
				virtualPetShelter.showAllPets();
				System.out.println();

			} else if (choice.equals("9")) {

				System.out.println("You have chosen to empty the litter boxes.");
				System.out.println();
				virtualPetShelter.showAllPets();
				System.out.println();

			} else if (choice.equals("10")) {

				System.out.println("You have chosen to find a pet.");
				System.out.println();
				virtualPetShelter.showAllPets();
				System.out.println();
				

			} else if (choice.equals("11")) {

				System.out.println("You have chosen to exit the system. Goodbye!");

				System.exit(0);

			} else {

			}

		} while (!choice.equals("11"));

	}
}
