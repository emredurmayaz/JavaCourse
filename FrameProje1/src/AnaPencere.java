import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;


public class AnaPencere extends JFrame {

	
	private JButton btnSelamla;
	
	public AnaPencere(){
		//yeni bir buton olsuturduk
		btnSelamla=new JButton("Selamla");
		//nesnelerin yerlesim ayarýný yaptýk
		add(btnSelamla);
		setLayout(new FlowLayout());
		//nesneyi ekliyoruz
		
		
		
		
		setTitle("ilk ygulama");
		setSize(500,500);
	}
}
