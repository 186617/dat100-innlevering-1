package dat100Innlevering1package;

import static javax.swing.JOptionPane.*;

public class O2 {

	public static void main(String[] args) {
		System.out.println(bruttoIntekt * trinnSkattProsent(1));
	}
	public static double trinnSkattProsent (double score) {
		// TODO Auto-generated method stub
		String bruttoIntektInn = showInputDialog("Vis bruttointekt");
		int bruttoIntekt = Integer.parseInt(bruttoIntektInn);
		if (bruttoIntekt >= 1350001)
		return 0.824;
		if (bruttoIntekt >= 937901)
			return 0.834;
		if (bruttoIntekt >= 670001)
			return 0.864;
		if (bruttoIntekt >= 292851)
			return 0.96;
		if (bruttoIntekt >= 208051)
			return 0.983;
		return 1.0;
		}

	}