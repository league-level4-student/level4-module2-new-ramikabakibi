package _06_Console_Store;

import java.util.Scanner;

import _02_Generics_Store.Candy;
import _02_Generics_Store.Cereal;
import _02_Generics_Store.Clothing;
import _02_Generics_Store.Toy;

public class ConsoleStore {
	static Scanner scan;
	static Person customer;
	static int newMoney;
	/*
	 * Write a program that simulates shopping in a store using the Scanner and the
	 * classes in Generics_Store.
	 * 
	 * Note: You may need to modify existing code in Generics Store and/or add
	 * additional items and pictures to fulfill all the requirements. You are also
	 * free to add any additional methods or classes in Console Store that might be
	 * helpful to you.
	 * 
	 * Requirements:
	 * 
	 * -Use Ternary operators in place of simple if/else statements and do-while
	 * loops instead of while loops where appropriate.
	 * 
	 * - There should be at least four unique items the user can buy. These can be
	 * food items, nonfood items or both.
	 * 
	 * - The user should have a stipend of money to spend and each item should have
	 * its own price.
	 * 
	 * -The user should have the ability to add items to their cart, remove items,
	 * view items or check out.
	 * 
	 * -The program should continue until the user chooses to check out.
	 * 
	 * -When the user checks out you should let them know if they do not have enough
	 * money to purchase all their items and offer to put items back(don't offer to
	 * put back just say that you don't have enough money, go return stuff until you
	 * have something less than or equal to 15 then go back to the question of like
	 * add, remove, ect. and they'll just remove until its less than or equal to 15
	 * 
	 * -If the user successfully purchases the items you should remove the amount
	 * from their stipend, show them the pictures of what they bought and print out
	 * a receipt showing their name, the individual prices of the items and their
	 * total.
	 */

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		customer = new Person();
		newMoney=customer.money;
		System.out.println("Welcome to the Console Store! What is your name?");
		String customerName = scan.nextLine();
		
		do {
			System.out.println("Hello " + customerName
					+ "! Would you like to add something to your cart, remove something, view your items or check out?");
			String firstStep = scan.nextLine();
			switch (firstStep) {
			case "add":
				System.out
						.println("Would you like to add candy($2), cereal($6), clothing($4) or toys($1) to your cart?");
				String item = scan.nextLine();
				addItems(item);
				break;
			case "remove":
				System.out.println(
						"Would you like to remove candy($2), cereal($6), clothing($4) or toys($1) from your cart?");
				String removedItem = scan.nextLine();
				removeThings(removedItem);
				break;

			case "view":

				break;

			case "check":

				break;
			default:
				System.out.println(firstStep);
				break;

			// START ON THIS REMOVE STUFF, I created a method down below, in this if need to
			// ask
			// what type of item they want, then save that in a variable and
			// use it to call the removeThings method down below, and then maybe ask how
			// many,
			// and then go through their cart, each item has a name, so that makes it easy
			// to
			// identify which item it is, so you can remove the appropriate one and how many
			// of them(
			// that can be part of the for loop to see how many times to run)
			// also when remove the itmes, need to add the appropriate amount of money back
			// After you do that then start on the view and check things(make seaprate
			// methods for those

			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} while (customer.isCheckedOut == false);

	}

	static public void addItems(String item) {
		if (item.equalsIgnoreCase("candy")) {
			System.out.println("How many pieces of candy do you want?");
			int num = Integer.parseInt(scan.nextLine());
			
			for (int i = 0; i < num; i++) {
				customer.customerCart.add(new Candy());
				newMoney-=2;
				
			}
			System.out.println(num+" candies added. Remaining money: " + newMoney + "$");

		}
		if (item.equalsIgnoreCase("cereal")) {
			System.out.println("How many boxes of cereal do you want?");
			int numItems = Integer.parseInt(scan.nextLine());
			
			for (int i = 0; i < numItems; i++) {
				customer.customerCart.add(new Cereal());
				newMoney-= 6;
				
			}
			System.out.println(numItems+" cereals added. Remaining money: " + newMoney + "$");

		}
		if (item.equalsIgnoreCase("clothing")) {
			System.out.println("How many pieces of clothing do you want?");
			int numItems = Integer.parseInt(scan.nextLine());
			
			for (int i = 0; i < numItems; i++) {
				customer.customerCart.add(new Clothing());
				newMoney-= 4;
				

			}
			System.out.println(numItems+ " clothing added. Remaining money: " + newMoney + "$");

		}
		if (item.equalsIgnoreCase("toys")) {
			System.out.println("How many toys do you want?");
			int numItems = Integer.parseInt(scan.nextLine());
			
			for (int i = 0; i < numItems; i++) {
				customer.customerCart.add(new Toy());
				newMoney-= 1;
				

			}
			System.out.println(numItems+ " toys added  Remaining money: " + newMoney + "$");
		}
	}

	static public void removeThings(String item) {
		if (item.equalsIgnoreCase("candy")) {
			System.out.println("How many pieces of candy do you want to remove?");
			int numItems = Integer.parseInt(scan.nextLine());
		
			for (int i = 0; i < numItems; i++) {
				for (int j = customer.customerCart.length() - 1; j >= 0; j--) {

					if (customer.customerCart.get(j) != null && customer.customerCart.get(j).name.equals("candy")) {
						customer.customerCart.remove(j);
						newMoney+=2;
						System.out.println("Remaining money: " + newMoney + "$");
						break;
					} 
				}
			}
			
				System.out.println("Remaining money: " + newMoney + "$");
				
			
		}

		if (item.equalsIgnoreCase("cereal")) {
			System.out.println("How many boxes of cereal do you want to remove?");
			int numItems = Integer.parseInt(scan.nextLine());
			
			for (int i = 0; i < numItems; i++) {
				for (int j = 0; j < customer.customerCart.length(); j++) {
					if (customer.customerCart.get(j) != null && customer.customerCart.get(j).name.equals("cereal")) {
						customer.customerCart.remove(j);
						newMoney += 6;
						System.out.println("Remaining money: " + newMoney + "$");
						break;
					} 
				}
			}
			
				System.out.println("No more cereal in the cart! Remaining money: " + newMoney + "$");
				
			
		}

		if (item.equalsIgnoreCase("clothing")) {
			System.out.println("How many pieces of clothing do you want to remove?");
			int numItems = Integer.parseInt(scan.nextLine());
		
			for (int i = 0; i < numItems; i++) {
				for (int j = 0; j < customer.customerCart.length(); j++) {
					if (customer.customerCart.get(j) != null && customer.customerCart.get(j).name.equals("clothing")) {
						customer.customerCart.remove(j);
						newMoney += 4;
						System.out.println("Remaining money: " + newMoney + "$");
						break;
					} 
				}
			}
			
				System.out.println("No more clothing in the cart! Remaining money: " + newMoney + "$");
				
			
		}

		if (item.equalsIgnoreCase("toys")) {
			System.out.println("How many toys do you want to remove?");
			
			int numItems = Integer.parseInt(scan.nextLine());
			for (int i = 0; i < numItems; i++) {
				for (int j = 0; j < customer.customerCart.length(); j++) {
					if (customer.customerCart.get(j) != null && customer.customerCart.get(j).name.equals("toy")) {
						customer.customerCart.remove(j);
						newMoney += 1;
						System.out.println("Remaining money: " + newMoney + "$");
						break;
					} 
				}
			}
			
				System.out.println("No more toys in the cart! Remaining money: " + newMoney + "$");
				
			
		}

	}
}
