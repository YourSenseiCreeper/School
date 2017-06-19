package bunt_po_builderze;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.*;

public class FrameBtn1 extends JFrame{

	private static final long serialVersionUID = 1L;

	public FrameBtn1(){
		setSize(200, 300);
		Main.center(this);
		addWindowListener(new WindowListener(){
			@Override
			public void windowActivated(WindowEvent arg0) {}
			@Override
			public void windowClosed(WindowEvent arg0) {
				Main.getProgramFrame().setVisible(true);
				Main.center(Main.getProgramFrame());
			}
			@Override
			public void windowClosing(WindowEvent arg0) {
				Main.getProgramFrame().setVisible(true);
				Main.center(Main.getProgramFrame());
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
		
		JPanel panel = new JPanel(new GridLayout(2,3));
		panel.add(new JLabel("Prêdkoœæ pocz¹tkowa (m/s)"));
		panel.add(new JLabel("Czas (s)"));
		panel.add(new JLabel("Pszyssspieszenie (m/s^2) ;)"));
		JTextField v0 = new JTextField(20);
		panel.add(v0);
		JTextField time = new JTextField(20);
		panel.add(time);
		JTextField przysp = new JTextField(20);
		panel.add(przysp);
		Image img = null;
		try {
			URL url = new URL("http://www.1papacaio.com.br/modules/Cliparts/gallery/cliparts_cartoons/cliparts_disney/cars/mcqueen_sally001.gif");
			img = ImageIO.read(url);
		} catch (IOException e) {
			e.printStackTrace();
		}
		add(new JLabel(new ImageIcon(img)));
		
		add(panel, BorderLayout.NORTH);
		JPanel south = new JPanel(new GridLayout(1,2));
		JTextField result = new JTextField(20);
		JButton wynik = new JButton("Wynik (m)");
		wynik.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				double valv0 = 0;
				double valtime = 0;
				double vala = 0;
				try{
					valv0 = Double.parseDouble(v0.getText());
					valtime = Double.parseDouble(time.getText());
					vala = Double.parseDouble(przysp.getText());
				}catch(NumberFormatException e1){
					JOptionPane.showInternalMessageDialog(getFrame(), "Wartoœæ nie mo¿e zawieraæ liter!");
					return;
				}
				double res = valv0*valtime + vala*valtime*valtime/2;
				result.setText(res+"");
			}});
		south.add(wynik);
		south.add(result);
		add(south, BorderLayout.SOUTH);
		pack();
	}
	
	private JFrame getFrame(){
		return this;
	}
	
}
