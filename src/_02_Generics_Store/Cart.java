package _02_Generics_Store;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 * The Cart class is a Bounded Type Generic class
 * 
 * <T extends Food> means we can only create a Cart with objects part of the 
 * Food class
 */

@SuppressWarnings("unchecked")
public class Cart<T extends CartItem> {
    private T[] cart;

    public Cart() {
        cart = (T[]) new CartItem[20];
    }

    // Adds an item to the cart
    public void add(T item) {
        for (int i = 0; i < cart.length; i++) {
            if (cart[i] == null) {
                cart[i] = item;
                return;
            }
        }
        
    }
    public void remove(int index) {
    	T[] newCart=(T[]) new CartItem[cart.length-1];
    	for(int i=0; i<cart.length; i++) {
    		if(i<index) {
    			newCart[i]=cart[i];
    		}
    		if(i==index) {
    			continue;
    		}
    		if(i>index) {
    			newCart[i-1]=cart[i];
    		}
    	}
    	cart=newCart;
    }
    public CartItem get(int index) {
    	return cart[index];
    }

    // Displays everything currently in the cart
    public void showCart() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        for (int i = 0; i < cart.length; i++) {
            if (cart[i] != null) {
                panel.add(cart[i].getLabel());
            }
        }
        frame.pack();

    }

    public int length() {
        return cart.length;
    }
}
