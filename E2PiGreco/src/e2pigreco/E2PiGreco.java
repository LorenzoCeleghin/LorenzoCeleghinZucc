package e2pigreco;

import java.util.Scanner;

public class E2PiGreco {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //metodo per leggere da tastiera
        System.out.println("Questo programma restituisce il valore di PiGreco con l'approssimazione desiderata");
        System.out.println("Approssimazione = ");
        double approssimazione = sc.nextDouble(); //lettura da tastiera
        double denominatore = 1;
        double PiGreco = 0; //valore da restituire
        double PiGrecoPrec; //variabile di confronto
        double termine; 
        boolean somma = true; //variabile di controllo
        do {
            PiGrecoPrec = PiGreco;
            termine = 4 / denominatore;
            if (somma == true) {
                PiGreco += termine;
                somma = false;
            } else {
                PiGreco -= termine;
                somma = true;
            }
            denominatore += 2;

        } while (Math.abs(PiGrecoPrec - PiGreco) > approssimazione);
        System.out.println("Il valore di PiGreco approssimato all'approssimazione desiderata è " + PiGreco);
    }

}
