package _06_Console_Store;

import java.util.Scanner;

import _02_Generics_Store.Candy;
import _02_Generics_Store.Cereal;
import _02_Generics_Store.Clothing;
import _02_Generics_Store.Toy;

public class ConsoleStore {
	static Scanner scan;
	static Person customer;
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
	 * money to purchase all their items and offer to put items back.
	 * 
	 * -If the user successfully purchases the items you should remove the amount
	 * from their stipend, show them the pictures of what they bought and print out
	 * a receipt showing their name, the individual prices of the items and their
	 * total.
	 */

	public static void main(String[] args) {
		 scan = new Scanner(System.in);
		 customer = new Person();
		System.out.println("Welcomoe to the Console Store! What is your name?");
		String customerName = scan.nextLine();

		System.out.println("Hello " + customerName
				+ " ! Would you like to add something to your cart, remove something, view your items or check out?");
		String firstStep = scan.nextLine();
		do {
			if (firstStep.substring(0, 3).equalsIgnoreCase("add")) {
				System.out.println("Would you like to add candy($2), cereal($6), clothing($4) or toys($1) to your cart?");
	    		String item=scan.nextLine();
	    		addItems(item);
			}

			if (firstStep.substring(0, 6).equalsIgnoreCase("remove")) {
//START ON THIS REMOVE STUFF, I created a method down below, in this if need to ask
				//what type of item they want, then save that in a variable and 
//use it to call the removeThings method down below, and then maybe ask how many, 
//and then go through their cart, each item has a name, so that makes it easy to
//identify which item it is, so you can remove the appropriate one and how many of them(
				//that can be part of the for loop to see how many times to run)
//also when remove the itmes, need to add the appropriate amount of money back
				//After you do that then start on the view and check things(make seaprate
				//methods for those
			}
			if (firstStep.substring(0, 4).equalsIgnoreCase("view")) {

			}
			if (firstStep.substring(0, 5).equalsIgnoreCase("check")) {

			}
		} while (customer.isCheckedOut == false);

	}
	
	static public void addItems(String item) {
		if(item.equalsIgnoreCase("candy")){
			System.out.println("How many pieces of candy do you want?");
			int numItems=scan.nextInt();
		for(int i=0; i<numItems; i++) {
			customer.customerCart.add(new Candy());
			customer.money-=2;
			System.out.println("Remaining money: "+customer.money+"$");
		}
		}
		if(item.equalsIgnoreCase("cereal")){
			System.out.println("How many boxes of cereal do you want?");
			int numItems=scan.nextInt();
		for(int i=0; i<numItems; i++) {
			customer.customerCart.add(new Cereal());
			customer.money-=6;
			System.out.println("Remaining money: "+customer.money+"$");
		}
		}
		if(item.equalsIgnoreCase("clothing")){
			System.out.println("How many pieces of clothing do you want?");
			int numItems=scan.nextInt();
		for(int i=0; i<numItems; i++) {
			customer.customerCart.add(new Clothing());
			customer.money-=4;
			System.out.println("Remaining money: "+customer.money+"$");
		}
		}
		if(item.equalsIgnoreCase("toys")){
			System.out.println("How many toys do you want?");
			int numItems=scan.nextInt();
		for(int i=0; i<numItems; i++) {
			customer.customerCart.add(new Toy());
			customer.money-=1;
			System.out.println("Remaining money: "+customer.money+"$");
		}
		}
	}
	
	static public void removeThings(String item) {
		
	}
}
