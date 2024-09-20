package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O2 {
	
	public static void main(String[] args) {
		
		double skatteprosent1 = 1.7;
		double skatteprosent2 = 4.0;
		double skatteprosent3 = 13.6;
		double skatteprosent4 = 16.6;
		double skatteprosent5 = 17.6;
		
		
		String inntektinn = showInputDialog("Skriv inn din inntekt for å regne skatt (venligst bruk heltall): ");
		
		int inntekt = Integer.parseInt(inntektinn);
		
		double skattbetale = 0;
		
		//trinn 1
		if (inntekt >= 208051 && inntekt <= 292850) {
			skattbetale = inntekt * (skatteprosent1 / 100);
		}
		//trinn 2
		else if (inntekt >= 292851 && inntekt <= 670000) {
			skattbetale = inntekt * (skatteprosent2 / 100);
		}
		//trinn 3
		else if (inntekt >= 670001 && inntekt <= 937900) {
			skattbetale = inntekt * (skatteprosent3 / 100);
		}
		//trinn 4
		else if (inntekt >=  937901 && inntekt <= 1350000) {
			skattbetale = inntekt * (skatteprosent4 / 100);
		}
		//trinn 5
		else if (inntekt >= 1350001) {
			skattbetale = inntekt * (skatteprosent5 / 100);
		}
		else {
			showMessageDialog(null, "Ugyldig inntekt");
		}
		showMessageDialog(null, "Skatten du må betale er: " + skattbetale);
		
	}
}