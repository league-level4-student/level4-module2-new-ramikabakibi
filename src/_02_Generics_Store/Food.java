package _02_Generics_Store;

import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public abstract class Food extends CartItem{
	int price;
	public JLabel getLabel() {
		return getFood();
	}
	
    public abstract JLabel getFood();

   
}
