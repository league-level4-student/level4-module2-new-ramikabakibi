package _06_Console_Store;

import java.util.Scanner;

public class ConsoleStore {

    /*
     * Write a program that simulates shopping in a store using the Scanner and
     * the classes in Generics_Store.
     * 
     * Note: You may need to modify existing code in Generics Store and/or add
     * additional items and pictures to fulfill all the requirements. You are
     * also free to add any additional methods or classes in Console Store that
     * might be helpful to you.
     * 
     * Requirements:
     * 
     * -Use Ternary operators in place of simple if/else statements and do-while
     * loops instead of while loops where appropriate.
     * 
     * - There should be at least four unique items the user can buy. These can
     * be food items, nonfood items or both.
     * 
     * - The user should have a stipend of money to spend and each item should
     * have its own price.
     * 
     * -The user should have the ability to add items to their cart, remove
     * items, view items or check out.
     * 
     * -The program should continue until the user chooses to check out.
     * 
     * -When the user checks out you should let them know if they do not have
     * enough money to purchase all their items and offer to put items back.
     * 
     * -If the user successfully purchases the items you should remove the
     * amount from their stipend, show them the pictures of what they bought and
     * print out a receipt showing their name, the individual prices of the
     * items and their total.
     */

    public static void main(String[] args) {
    	Scanner scan=new Scanner(System.in);
    	Person customer=new Person();
    	System.out.println("Welcomoe to the Console Store! What is your name?");
    	String customerName=scan.nextLine();
    	customer.setName(customerName);
    	System.out.println("Hello "+ customerName+ " ! Would you like to add something to your cart, remove something, view your items or check out?");
    	String firstStep=scan.nextLine();
    	if(firstStep.equals("add something")) {
    		//START ON THIS 
    	}
    	if(firstStep.equals("remove something")) {
    		
    	}
    	if(firstStep.equals("view items")) {
    		
    	}
    	if(firstStep.equals("check out")){
    			
    }

    //So what I'm thinking here is that we already have a bunch of stuff with like the items and 
    //their prices and adding and the cart and all that class hierarchy in generics store
    //So, we make a class called person that has like that fixed amount of money and has a 
    //cart(I'm not sure how to declare the cart because each one needs a specific type of item. Do we have
    // a cart for each item??? idk) Anyways, in this class the scanner asks for the name, and then
    // says do you want to remove, add, view, or check out, and then there'll be a bunch of ifs
    // for everything based on what they want to do. And we surround that with a do while loop
    // so it runs until the person hasn't checked out yet(can make a boolean checked out) and the 
    //person can have a checkOut() method that sets that boolean to true, so in the do while loop
    // the condiition would person.checkedOut==true or something like that. Go from there. I already 
    	//added a cart variable and money variable to the person, now need to start on each
    	//scenario in this class, so after add something, I need to ask what they want to add
    	// and add it to their cart and decrease their money and all that stuff
    	//make sure after your done you go through the requirements again. Good luck lel
}
}
