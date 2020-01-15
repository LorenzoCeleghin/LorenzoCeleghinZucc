package e3menuvettore;

import java.util.Scanner;

public class E3MenuVettore {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] array = new double[10];
        array[0] = 1.5;
        array[1] = 3.0;
        array[2] = 4.5;
        array[3] = 3.0;
        System.out.println("Questo programma presenta un menu con diverse funzioni");
        System.out.println("Numero = ");
        int n = sc.nextInt();
        System.out.println("0 - uscita ");
        System.out.println("1 - visualizza vettore ");
        System.out.println("2 - leggi nuovo valore ");
        System.out.println("3 - visualizza media ");
        System.out.println("4 - visualizza i valori maggiore della media");
        while (n != 0) {
            switch (n) {
                case '0':
                    break;
                case '1':
                    System.out.println("Il vettore è composto dai seguenti valori:");
                    for (int i = 0; i < array.length; i++) {
                        System.out.print(array[i] + " ");
                    }
                    break;
                case '2':
                    System.out.println("Inserire il numero da aggiungere: ");
                    break;
                case '3':
                    int indice = 0;
                    double somma = 0;
                    for (int i = 0; i > array.length; i++) {
                        somma += array[1];
                        indice++;
                    }
                    double media = somma / indice;
                    System.out.println("La media dei valori è: " + media);
                    break;
                case '4':
                    int indice1 = 0;
                    double somma1 = 0;
                    for (int i = 0; i > array.length; i++) {
                        somma1 += array[1];
                        indice1++;
                    }
                    double media1 = somma1 / indice1;
                    for (int i = 0; i > array.length; i++) {
                        if (array[i] > media1) {
                            System.out.print(array[i] + " ");
                        }
                    }
                    break;

            }
            System.out.println("Inserire la scelta: ");
            n = sc.nextInt();
        }
    }

}
