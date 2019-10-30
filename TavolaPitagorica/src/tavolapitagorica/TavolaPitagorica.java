
package tavolapitagorica;

import java.util.Scanner;

public class TavolaPitagorica {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci un numero");
        System.out.println("N = ");
        int n = sc.nextInt();
        int a = 1;
        int b = 1;
        while (a <= n) {
            b = 1;
            while (b <= n) {
                System.out.print(a * b + "\t");
                b++;
            }

            System.out.println();
            a++;
        }
    }
}
