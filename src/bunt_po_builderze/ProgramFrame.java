package bunt_po_builderze;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ProgramFrame extends JFrame{

	private static final long serialVersionUID = 1L;
	
	public ProgramFrame(){
		setTitle("Fizyczne rozmaitoœci");
		setSize(400, 300);
		center(this);
		Image img = null;
		try {
			URL url = new URL("http://lo.trzcianka.com.pl/theme/images/logo.png");
			img = ImageIO.read(url);
		} catch (IOException e) {
			e.printStackTrace();
		}
		add(new JLabel(new ImageIcon(img)));
		FrameBtn1 fbtn1 = new FrameBtn1();
		FrameBtn3 fbtn3 = new FrameBtn3("Trzecie prawo Keplera");
		
		JButton btn1 = new JButton("Droga w ruchu przyspieszonym");
		btn1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				fbtn1.setVisible(true);
				Main.center(fbtn1);
			}});

		JButton btn3 = new JButton("Trzecie prawo Keplera");
		btn3.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				fbtn3.setVisible(true);
				Main.center(fbtn3);
			}});
		JButton btn4 = new JButton("Wyjœcie");
		btn4.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);}});
		JPanel panel1 = new JPanel();
		panel1.setLayout(new GridLayout(4,1));
		panel1.add(btn1);
		panel1.add(btn3);
		panel1.add(btn4);
		add(panel1, BorderLayout.NORTH);
	}
	
	public void center(JFrame f){
		Toolkit tk = Toolkit.getDefaultToolkit();
		int width = tk.getScreenSize().width;
		int height = tk.getScreenSize().height;
		f.setLocation(width/2-f.getWidth()/2, height/2-f.getHeight()/2);
	}

}
