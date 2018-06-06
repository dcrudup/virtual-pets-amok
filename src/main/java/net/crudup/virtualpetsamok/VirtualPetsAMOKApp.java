package net.crudup.virtualpetsamok;

import static org.mockito.Mockito.after;

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

		System.out.println("Welcome the Virtual Pet Shelter");
		System.out.println();
		System.out.println("Here's all of the pets in our shelter with their current biostats:  ");
		System.out.println();

		virtualPetShelter.showAllPets();

		System.out.println();

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

				System.out.println();
				System.out.println("You've chosen to feed all of the organic pets.");
				System.out.println();
				virtualPetShelter.showAllOrganicPets();
				virtualPetShelter.feedAllOrganicPets();
				virtualPetShelter.tick();
				System.out.println();

			} else if (choice.equals("2")) {

				System.out.println("You've chose to water all of the organic pets.");
				System.out.println();
				virtualPetShelter.showAllOrganicPets();
				virtualPetShelter.waterAllOrganicPets();
				virtualPetShelter.tick();
				System.out.println();

			} else if (choice.equals("3")) {

				System.out.println("You've chosen to oil all of the robotic pets.");
				System.out.println();
				virtualPetShelter.showAllRoboticPets();
				virtualPetShelter.oilAllRoboticPets();
				virtualPetShelter.tick();
				System.out.println();

			} else if (choice.equals("4")) {
                System.out.println("You have chosen to walk all of the dogs.");
                virtualPetShelter.walkAllDogs();
				System.out.println();
				virtualPetShelter.showAllPets();
				virtualPetShelter.walkAllDogs();
				virtualPetShelter.tick();
				System.out.println();

			} else if (choice.equals("5")) {

				System.out.println("You have chosen play with a pet.");
				System.out.println();
				System.out.println("Which pet do you want to play with?");
				String petName = userInput.nextLine();
				virtualPetShelter.findPet(petName);
				virtualPetShelter.playWithOnePet();
				System.out.println();
				System.out.println("Excellent choice!");
				virtualPetShelter.tick();
				System.out.println();

			} else if (choice.equals("6")) {

				System.out.println("You have chosen to adopt a pet.");
				System.out.println();
				virtualPetShelter.showAllPets();
				System.out.println("Which pet would you like to adopt?");
				String petName = userInput.nextLine();
				virtualPetShelter.findPet(petName);
				System.out.println();
				System.out.println(petName + " will be an excellent addition to your family!");

			} else if (choice.equals("7")) {

				System.out.println("You would like to admit a pet.");
				System.out.println();
				System.out.println("What is the name of the pet you'd like to admit?");
				String newAdmit = userInput.nextLine();
				System.out.println("Welcome " + newAdmit + "!");
				System.out.println();

			} else if (choice.equals("8")) {

				System.out.println("You have chosen to clean the dog crates.");
				System.out.println();
				virtualPetShelter.showAllOrganicPets();
				virtualPetShelter.cleanDogCrates();
				virtualPetShelter.tick();
				System.out.println();

			} else if (choice.equals("9")) {

				System.out.println("You have chosen to empty the litter boxes.");
				System.out.println();
				virtualPetShelter.showAllOrganicPets();
				virtualPetShelter.emptyLitterBoxes();
				virtualPetShelter.tick();
				System.out.println();

			} else if (choice.equals("10")) {

				System.out.println("You have chosen to find a pet.");
				System.out.println();
				virtualPetShelter.showAllPets();
				System.out.println("What is the name of the pet that you'd like to find?");
				String petName = userInput.nextLine();
				virtualPetShelter.findPet(petName);
				System.out.println("We found " + virtualPetShelter.findPet(petName) +  "." );
				System.out.println();

			} else if (choice.equals("11")) {
				System.out.println("You have chosen to exit the system. Goodbye!");
				System.exit(0);
			} else {

			}

		} while (!choice.equals("11"));

	}
}
