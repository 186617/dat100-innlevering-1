package dat100Innlevering1package;
import static javax.swing.JOptionPane.*;
import static java.lang.Math.*;
public class O3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String aInn = showInputDialog("Skriv inn ett heltall større enn 0");
		int a = Integer.parseInt(aInn);
		int b = a;
		while (b > 1) {
			a=a*(b-1);
			b=b-1;
		}
		System.out.println(a);
		
	}

}
