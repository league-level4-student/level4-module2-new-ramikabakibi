package _02_Generics_Store;

import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public abstract class NonFood extends CartItem {
	
	public JLabel getLabel() {
		return getNonFood();
	}
	public abstract JLabel getNonFood();
		
	
}
