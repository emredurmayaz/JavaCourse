import java.util.ArrayList;

import javax.swing.JOptionPane;


public class OgrenciTest {

	public static void main(String[] args) {
		
		//Ogrenci ogr = new Ogrenci("Emre","Durmayaz");
		//JOptionPane.showMessageDialog(null,ogr.ad+""+ogr.soyad);
//ogr.selamVer();
		
		ArrayList<Insan> sinifListe = new ArrayList<Insan>();
		Ogrenci ogr = new Ogrenci("ali","aydemir");
		sinifListe.add(ogr);
		
		Ogrenci ogr1 = new Ogrenci("emre","durmayaz");
		sinifListe.add(ogr1);
		
		Ogrenci ogr2 = new Ogrenci("Anderson ","Talisca");
		sinifListe.add(ogr2);
		
		for (Insan insan : sinifListe) {
			insan.selamVer();
		}
		
	}

}
