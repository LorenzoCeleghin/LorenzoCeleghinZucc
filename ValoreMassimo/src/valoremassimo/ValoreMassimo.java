
package valoremassimo;

import java.util.Scanner;
public class ValoreMassimo {

    
    public static void main(String[] args) {
        System.out.println("Programma che legge i valori positivi dalla tastiera e restituisce il valore massimo inserito quando viene inserito 0");
      Scanner sc = new Scanner (System.in);
      int max = 0;
      System.out.println("Inserire un valore positivo");
      System.out.println("a = ");
      int a = sc.nextInt();
        if (a == 0) {
            System.out.println("Il valore massimo è " + max);
        }
        if (a < 0 ) {
                   System.out.println("Il programma funziona solo con valori positivi");
        }
        if (a > 0) {
            if (max < a) {
                max = a;
                System.out.println("Inserire un altro valore");
                System.out.println("a = ");
                a = sc.nextInt();
                
            } 
            
        }
        
    }
    
}
