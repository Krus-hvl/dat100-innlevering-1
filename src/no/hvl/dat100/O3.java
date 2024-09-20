package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class O3 {

	public static void main(String[] args) {
		
			String nfakultetinn = showInputDialog("Skriv inn et heltall for n! (n > 0): ");
			
			int nfakultet = Integer.parseInt(nfakultetinn);
			
			int fakultet = 1;
			for (int i = 1; i <= nfakultet; i++) {
				fakultet *= i;
				System.out.println(nfakultet);
			}
			showMessageDialog(null, nfakultetinn + "! = " + fakultet);
			
	}
}
