package bunt_po_builderze;

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

}
