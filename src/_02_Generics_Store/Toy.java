package _02_Generics_Store;

import java.util.Random;

import javax.swing.JLabel;

public class Toy extends NonFood {
	
	public Toy() {
		name="toy";
		price=1;
		if(new Random().nextBoolean()) {
			this.item = "toy1.jpeg";
			
		}
		else {
			this.item = "toy2.jpeg";
			
		}
	}

	@Override
	public JLabel getNonFood() {
		// TODO Auto-generated method stub
		return new JLabel(loadImage(this.item));
	}
}
