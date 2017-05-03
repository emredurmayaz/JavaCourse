import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;


public class EkrN extends JFrame {
   private JButton btnMesaj;
   private JButton btnBilgi;
	public EkrN() {
		// TODO Auto-generated constructor stub
		btnMesaj= new JButton("mesaj ver");
		btnBilgi=new JButton("Bilgi ver");
		setTitle("Grid Projesi");
		setLayout(new GridLayout(2,2));
		setSize(250,250);
		
add(btnMesaj);
add(btnBilgi);
		
	}
	
	
}
