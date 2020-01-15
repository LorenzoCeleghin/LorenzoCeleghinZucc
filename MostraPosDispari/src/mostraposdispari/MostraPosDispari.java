package mostraposdispari;

import java.util.Scanner;

public class MostraPosDispari {

    public static void main(String[] args) {
        long num;
        Scanner sc = new Scanner(System.in);
        long cifra;
        int indice = 0;
        int lungCifre = 0;
        long[] cifre = new long[10];
        String numStr = "";
        num = sc.nextLong();
        while (num > 0) {
            cifra = num % 10;
            num /= 10;
            cifre[indice] = cifra;
            indice++;
        }
        lungCifre = indice;
        for (int c = 0; c < lungCifre; c++) {
            System.out.println(cifre[c]);
        }
        indice = lungCifre - 1;
        do {
            //System.out.print(cifre[indice]);
            numStr = String.valueOf(cifre[indice]);
            indice -= 2;
        } while (indice >= 0);
        System.out.println("");
        System.out.println(numStr);
    }
        
}
