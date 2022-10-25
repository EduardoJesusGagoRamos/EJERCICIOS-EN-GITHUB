// Pedir dos números y decir si uno es múltiplo del otro.

package BOLETÍN;

import java.util.Scanner;

/**
 *
 * @author GAGO RAMOS EDUARDO JESÚS
 */
public class EJERCICIO_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        int n1, n2;
        System.out.print("Introduce un numero: ");
        n1 = sc.nextInt();
        System.out.print("Introduce otro numero: ");
        n2 = sc.nextInt();
        if (n1 % n2 == 0) {
            System.out.println("Son multiplos");
        } else {
            System.out.println("No son multiplos");
        }
    }
}
