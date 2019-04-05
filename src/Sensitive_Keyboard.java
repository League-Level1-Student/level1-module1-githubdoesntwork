import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public  class Sensitive_Keyboard implements KeyListener {

public void run() {
	JFrame frame = new JFrame();
	frame.addKeyListener(this);
	frame.setVisible(true);
}
	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("Ouch!");
	}



	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


}
