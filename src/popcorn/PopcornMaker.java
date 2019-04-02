package popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
public static void main(String[] args) {
	String flavor = JOptionPane.showInputDialog("What do you want your flavor or your popcorn to be?");
	String time = JOptionPane.showInputDialog("How long do you want it to cook?");
	int timeInt = Integer.parseInt(time);
	Popcorn Popcorn = new Popcorn(flavor);
	Microwave wave = new Microwave();
	wave.putInMicrowave(Popcorn);
	wave.setTime(timeInt);
	wave.startMicrowave();
	Popcorn.applyHeat();
	Popcorn.eat();
}
}
