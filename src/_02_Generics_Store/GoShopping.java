package _02_Generics_Store;

public class GoShopping {
	// 1. Look through other classes to see how they all interact.
	//
	//    There is a generic Cart class that can hold different 
	//    types of objects.
	//
	//    Candy and Cereal are Food objects
	//    Clothing and Toy are NonFood objects.
	
	public static void main(String[] args) {
//		// 2. Create a Cart object of type Candy
//			Cart<Candy> candyCart=new Cart<Candy>();
//		// 3. Create another Cart object of type Cereal
//			Cart<Cereal> cerealCart=new Cart<Cereal>();
//		// 4. Add a few items to EACH cart
//			Candy candy1=new Candy();
//			Candy candy2=new Candy();
//			Cereal cereal1=new Cereal();
//			Cereal cereal2=new Cereal();
//			candyCart.add(candy1);
//			candyCart.add(candy2);
//			cerealCart.add(cereal1);
//			cerealCart.add(cereal2);
//		// 5. Call the showCart() method on EACH cart
//		candyCart.showCart();
//		cerealCart.showCart();
		
		// 6. Run the code
		
		// 7. Comment out the code you have so far
		
		// 8. Repeat steps 2-5 for a Clothing Cart and a Toy Cart
		
		Cart<Clothing> clothingCart=new Cart<Clothing>();
		Cart<Toy> toyCart=new Cart<Toy>();
		Toy toy=new Toy();
		Toy toy1=new Toy();
		Clothing clothing1=new Clothing();
		Clothing clothing2=new Clothing();
		clothingCart.add(clothing1);
		clothingCart.add(clothing2);
		toyCart.add(toy);
		toyCart.add(toy1);
		clothingCart.showCart();
		toyCart.showCart();
		
		// Why are there errors?
		
		// 9. Modify the Cart class so that this code compiles
		// HINT: There are 3 lines of code to edit
				
		// 10. Run the code. Does it work?
		
	}
}
