package inputs;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import main.GamePanel;

public class KeyboardInputs implements KeyListener  {
	private GamePanel gamepanel;
	public KeyboardInputs(GamePanel gamepanel)
{	this.gamepanel=gamepanel;
	
}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		switch(e.getKeyCode())
		{
		case KeyEvent.VK_W:
			gamepanel.changeYDelta(-5);
			break;
		case KeyEvent.VK_A:
			gamepanel.changeXDelta(-5);
			break;
		case KeyEvent.VK_S:
			gamepanel.changeYDelta(5); 
			break;
		case KeyEvent.VK_D:
			gamepanel.changeXDelta(5);
			break;
			
			
			
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
