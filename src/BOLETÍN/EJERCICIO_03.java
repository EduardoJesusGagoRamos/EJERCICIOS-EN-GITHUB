// Pedir el radio de una circunferencia y calcular su longitud.

package BOLETÍN;

import java.util.Scanner;

/**
 *
 * @author GAGO RAMOS EDUARDO JESÚS
 */
public class EJERCICIO_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        double l, r; // longitud y radio
        System.out.print("Introduce el radio de una circunferencia: ");
        r = sc.nextDouble();
        l = 2 * Math.PI * r;

        System.out.println("La longitud de una circunferencia de radio " + r + " es: " + l);
    }
}
