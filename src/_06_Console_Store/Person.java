package _06_Console_Store;

import _02_Generics_Store.Cart;
import _02_Generics_Store.CartItem;

public class Person {
 int money=15;
 String name;
 Cart<CartItem> customerCart;
 boolean isCheckedOut=false;
 
 
//So what I'm thinking here is that we already have a bunch of stuff with like the items and 
 //their prices and adding and the cart and all that class hierarchy in generics store
 //So, we make a class called person that has like that fixed amount of money and has a 
 //cart Anyways, in this class the scanner asks for the name, and then
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
