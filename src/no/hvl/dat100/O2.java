package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O2 {
	public static double beregnTrinnskatt(double inntekt) {
        double skatt = 0;

        // Trinn 5
        if (inntekt > 1_350_000) {
            skatt += (inntekt - 1_350_000) * 0.176;
            inntekt = 1_350_000;
        }

        // Trinn 4
        if (inntekt > 937_900) {
            skatt += (inntekt - 937_900) * 0.166;
            inntekt = 937_900;
        }

        // Trinn 3
        if (inntekt > 670_000) {
            skatt += (inntekt - 670_000) * 0.136;
            inntekt = 670_000;
        }

        // Trinn 2
        if (inntekt > 292_850) {
            skatt += (inntekt - 292_850) * 0.04;
            inntekt = 292_850;
        }

        // Trinn 1
        if (inntekt > 208_050) {
            skatt += (inntekt - 208_050) * 0.017;
        }

        return skatt;
    }

    public static void main(String[] args) {
        try {
            String input = showInputDialog(null, "Skriv inn din bruttoinntekt:", "Trinnskatt Kalkulator");

            double bruttoinntekt = Double.parseDouble(input);

            double trinnskatt = beregnTrinnskatt(bruttoinntekt);

            showMessageDialog(null, String.format("Din trinnskatt er: %.2f kroner", trinnskatt), "Resultat");

        } catch (NumberFormatException e) {
        	showMessageDialog(null, "Vennligst skriv inn et gyldig tall for bruttoinntekt.", "Feil");
        }
    }
}

