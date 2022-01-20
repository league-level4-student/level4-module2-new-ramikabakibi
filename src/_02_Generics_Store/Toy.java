package _02_Generics_Store;

import java.util.Random;

import javax.swing.JLabel;

public class Toy extends NonFood {
	public Toy() {
		if(new Random().nextBoolean()) {
			this.item = "toy1.jpeg";
			price=1;
		}
		else {
			this.item = "toy2.jpeg";
			price=1;
		}
	}

	@Override
	public JLabel getNonFood() {
		// TODO Auto-generated method stub
		return new JLabel(loadImage(this.item));
	}
}
