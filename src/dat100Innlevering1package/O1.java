package dat100Innlevering1package;
import static javax.swing.JOptionPane.showInputDialog.*;
public class O1 {

		public static void main(String[] args) {
			
			for (int a = 0; a <= 10; a++)
				System.out.println("Karakteren er " + karakter(90));
		}
			
		public static char karakter (int score) {
			String poengsumInn = showInputDialog("Vis poengsum");
			int poengsum = Integer.parseInt(poengsumInn);
			if (poengsum < 0)
				return '-';
			if (poengsum > 100)
				return '-'; // TODO Skriv feilmelding om programmet får tastet inn ett tall mindre enn 0 eller større enn 100
			if (poengsum >= 90)
				return 'A';
			if (poengsum >= 80)
				return 'B';
			if (poengsum >= 60)
				return 'C';
			if (poengsum >= 50)
				return 'D';
			if (poengsum >= 40)
				return 'E';
			return 'F';
			}
		}
	}

}
