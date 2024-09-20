package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O1 {

	public static void main(String[] args) { 
		for (int i = 1; i <= 10; i++) {
			boolean kontroll = false;
			
			while (!kontroll) {
				String poenginn = showInputDialog("Skriv inn poengsum (0-100):");

	        try {
	        	
	            int poeng = Integer.parseInt(poenginn);

	            String karakter;
	            if (poeng >= 90 && poeng <= 100) {
	            	karakter = "A";
	            	kontroll = true;
	            } else if (poeng >= 80 && poeng <= 89) {
	            	karakter = "B";
	            	kontroll = true;
	            } else if (poeng >= 60 && poeng <= 79) {
	            	karakter = "C";
	            	kontroll = true;
	            } else if (poeng >= 50 && poeng <= 59) {
	            	karakter = "D";
	            	kontroll = true;
	            } else if (poeng >= 40 && poeng <= 49) {
	            	karakter = "E";
	            	kontroll = true;
	            } else if (poeng >= 0 && poeng <= 39) {
	            	karakter = "F";
	            	kontroll = true;
	            } else {
	                showMessageDialog(null, "Ugyldig poengsum. Vennligst skriv inn et tall mellom 0 og 100.");
	                continue;
	            }
	            showMessageDialog(null, "Karakteren din er: " + karakter);
	        } catch (NumberFormatException e) {
	            showMessageDialog(null, "Ugyldig poengsum. Vennligst skriv inn et gyldig tall.");
	        }
			}
		}		
	}
}
