package bunt_po_builderze;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ProgramFrame extends JFrame{

	private static final long serialVersionUID = 1L;
	
	public ProgramFrame(){
		setTitle("Bry³ki sztywne, tak w trumnach");
		setSize(300, 300);
		center(this);
		
		FrameBtn1 fbtn1 = new FrameBtn1();
		
		JButton btn1 = new JButton("Energia bry³y");
		btn1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				fbtn1.setVisible(true);
			}
			
		});
		JButton btn2 = new JButton("Wykres zaleznosci predkosci k¹towej od okresu");
		JButton btn3 = new JButton("Button 3");
		JPanel panel1 = new JPanel();
		panel1.setLayout(new GridLayout(3,1));
		panel1.add(btn1);
		panel1.add(btn2);
		panel1.add(btn3);
		add(panel1, BorderLayout.NORTH);
	}
	
	public void center(JFrame f){
		Toolkit tk = Toolkit.getDefaultToolkit();
		int width = tk.getScreenSize().width;
		int height = tk.getScreenSize().height;
		f.setLocation(width/2-f.getWidth()/2, height/2-f.getHeight()/2);
	}

}
