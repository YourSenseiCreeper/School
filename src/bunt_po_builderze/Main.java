package bunt_po_builderze;

import java.awt.Toolkit;

import javax.swing.JFrame;

public class Main {
	
	private static ProgramFrame pf;
	public static void main(String[] args) {
		
		pf = new ProgramFrame();
		pf.setVisible(true);
		pf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static JFrame getProgramFrame(){
		return pf;
	}
	
	public static void center(JFrame f){
		Toolkit tk = Toolkit.getDefaultToolkit();
		int width = tk.getScreenSize().width;
		int height = tk.getScreenSize().height;
		f.setLocation(width/2-f.getWidth()/2, height/2-f.getHeight()/2);
	}

}
