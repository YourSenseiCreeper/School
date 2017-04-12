package bunt_po_builderze;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class FrameBtn1 extends JFrame{

	private static final long serialVersionUID = 1L;

	public FrameBtn1(){
		setSize(100, 300);
		center(this);
		this.addWindowListener(new WindowListener(){

			@Override
			public void windowActivated(WindowEvent arg0) {}
			@Override
			public void windowClosed(WindowEvent arg0) {
			Main.getProgramFrame().setVisible(true);
			}

			@Override
			public void windowClosing(WindowEvent arg0) {
				Main.getProgramFrame().setVisible(true);
				
			}

			@Override
			public void windowDeactivated(WindowEvent arg0) {}
			@Override
			public void windowDeiconified(WindowEvent arg0) {}
			@Override
			public void windowIconified(WindowEvent arg0) {}
			@Override
			public void windowOpened(WindowEvent arg0) {}
		});
	}
	
	public void center(JFrame f){
		Toolkit tk = Toolkit.getDefaultToolkit();
		int width = tk.getScreenSize().width;
		int height = tk.getScreenSize().height;
		f.setLocation(width/2-f.getWidth()/2, height/2-f.getHeight()/2);
	}
	
}
