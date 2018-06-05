package net.crudup.virtualpetsamok;

import java.util.Collection;
import java.util.Scanner;

public class VirtualPetsAMOKApp {

	public static void main(String[] args) {
		
		VirtualPetShelter virtualPetShelter = new VirtualPetShelter();
		
		Pet dog = new Dog("Lucky", 25, 25, 25, 25,25,25,"Organic Dog");
		Pet cat = new Cat("Sadie", 25, 25, 25, 25, 25, 25, "Organic Cat");
		Pet robodog = new RoboDog("Bella", 25, 25, 25, 25, "Robotic Dog");
		Pet robocat = new RoboCat("Charlie", 25, 25, 25, 25, "Robotic Cat");
		
		virtualPetShelter.addPet(dog);
		virtualPetShelter.addPet(cat);
		virtualPetShelter.addPet(robodog);
		virtualPetShelter.addPet(robocat);
		
		
		System.out.println("Here's all of the pets in my shelter: ");
		
		virtualPetShelter.getAllPets();
		
		System.out.println();
		
		virtualPetShelter.showAllPets();
		System.out.println();
		
		Scanner userInput = new Scanner(System.in);
		
		
		
		System.out.println("Please choose from the following options below:");
		System.out.println();
		System.out.println("Option 1: Feed the Organic Pets");
		System.out.println("Option 2: Water the Organic Pets");
		System.out.println("Option 3: Play with a Pet");
		System.out.println("Option 4: Walk a Pet");
		System.out.println("Option 5: Adopt a Pet");
		System.out.println("Option 6: Admit a Pet");
		System.out.println("Option 7: Clean the Dog Crates");
		System.out.println("Option 8: Clean the Litter Boxes");
		System.out.println("Option 9: Oil the Robotic Pets");
		System.out.println("Option 10: Exit the System");
		System.out.println();
		
		String choice = "";
		
		
		
		
		
		

	}

}
