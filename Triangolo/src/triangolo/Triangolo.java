
package triangolo;
import java.util.Scanner;
public class Triangolo {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Inserire un numero");
        System.out.println("N = ");
        int n = sc.nextInt();
        int a = 1;
        int b = 0;
        int c = 1;
        while (c<=n) {
            while (b<c) {
                System.out.print(a);
                a++;
                b++;
            }
            System.out.println("");
            b=0;
            c++;
        }    
          
            
        
        
    }
    
}

