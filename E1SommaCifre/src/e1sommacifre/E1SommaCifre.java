package e1sommacifre;

import java.util.Scanner;

public class E1SommaCifre {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //metodo per leggere da tastiera
        int n; //numero da leggere
        System.out.println("Questo programma restituisce la somma delle cifre di un intero");
        System.out.println("Numero = ");
        n = sc.nextInt(); //lettura da tastiera
        int somma = 0;
        if (n < 1) { // controllo della validità del numnero
            System.out.println("Questo valore è minore di 0, perciò non è possibile effettuare la somma delle cifre");
        } else {
            while (n > 0) {
                somma += n % 10;
                n /= 10;
            }
            System.out.println("La somma delle cifre di questo numero intero è " + somma);
        }
    }
}
