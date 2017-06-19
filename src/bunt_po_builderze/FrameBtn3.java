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
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FrameBtn3 extends JFrame{

	private static final long serialVersionUID = 1L;
	
	public FrameBtn3(String title){
		JFrame fr = this;
		setTitle(title);
		setSize(400, 300);
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
		JPanel main = new JPanel(new GridLayout(2,1));
		JTextArea opis = new JTextArea();
		opis.setText("Stosunek kwadratu okresu obiegu planety wokó³ S³oñca do szeœcianu "
				+ "wielkiej pó³osi jej orbity (czyli œredniej odleg³oœci od S³oñca) jest sta³y dla "
				+ "wszystkich planet w Uk³adzie S³onecznym\n"
				+ "Po prawej stronie zostaw jedno brakuj¹ce miejsce a program je policzy");
		opis.setLineWrap(true);
		opis.setEditable(false);
		opis.setBackground(this.getBackground());
		main.add(opis);
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3,4));
		JTextField t1 = new JTextField(20);
		JTextField t2 = new JTextField(20);
		JTextField r1 = new JTextField(20);
		JTextField r2 = new JTextField(20);
		panel.add(new JLabel("T1"));
		panel.add(t1);
		panel.add(new JLabel("r1"));
		panel.add(r1);
		panel.add(new JLabel("T2"));
		panel.add(t2);
		panel.add(new JLabel("r2"));
		panel.add(r2);
		panel.add(new JLabel());
		panel.add(new JLabel());
		panel.add(new JLabel());
		JButton licz = new JButton("Licz");
		licz.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				if(t1.getText() != "" && t2.getText() != ""){
					double it1 = 0;
					double it2 = 0;
					double ir1 = 0;
					double ir2 = 0;
					try{
						it1 = Double.parseDouble(t1.getText());
						it2 = Double.parseDouble(t2.getText());
					}catch(NumberFormatException e1){
						JOptionPane.showInternalMessageDialog(getFrame(), "Wartoœæ nie mo¿e zawieraæ liter!");
						return;
					}
					it1 = Math.pow(it1, 2);
					it2 = Math.pow(it2, 2);
					
					if (r1.getText().isEmpty() && r2.getText().isEmpty()){
						JOptionPane.showMessageDialog(fr, "Wszystkie pola po prawej s¹ puste!");
						return;
					}
					if(r1.getText().isEmpty()){
						try{
							ir2 = Double.parseDouble(r2.getText());
						}catch(NumberFormatException e1){
							JOptionPane.showInternalMessageDialog(getFrame(), "Wartoœæ nie mo¿e zawieraæ liter!");
							return;
						}
						double res = it1*Math.pow(ir2, 3)/it2;
						res = Math.cbrt(res);
						
						r1.setText(res+"");
						System.out.println(it1 +" "+it2+" "+ir1+" "+ir2+" = "+res);
						return;
					}
					if(r2.getText().isEmpty()){
						try{
							ir1 = Double.parseDouble(r1.getText());
						}catch(NumberFormatException e1){
							JOptionPane.showInternalMessageDialog(getFrame(), "Wartoœæ nie mo¿e zawieraæ liter!");
							return;
						}
						double res = it2*Math.pow(ir1, 3)/it1;
						res = Math.cbrt(res);
						r2.setText(res+"");
						System.out.println(it1 +" "+it2+" "+ir1+" "+ir2+" = "+res);
						return;
					}
					else JOptionPane.showMessageDialog(fr, "Wszystkie pola s¹ zape³nione!");
				}
			}});
		panel.add(licz);
		main.add(panel);

		add(main, BorderLayout.NORTH);
		Image img = null;
		try {
			URL url = new URL("http://fizyka.uniedu.pl/wp-content/uploads/2016/09/III-prawo-Keplera-2-liceum.png");
			img = ImageIO.read(url);
		} catch (IOException e) {
			e.printStackTrace();
		}
		add(new JLabel(new ImageIcon(img)));
		pack();
	}
	
	private JFrame getFrame(){
		return this;
	}
	
}
