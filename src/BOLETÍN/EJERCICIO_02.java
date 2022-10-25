// Pedir el radio de un círculo y calcular su área. A=PI*r^2

package BOLETÍN;

import java.util.Scanner;

/**
 *
 * @author GAGO RAMOS EDUARDO JESÚS
 */
public class EJERCICIO_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        double a, r; // área y radio
        System.out.print("Introduce el radio de un circulo: ");
        r = sc.nextDouble();
        a = Math.PI * (r * r); // para elevar al cuadrado otra opción es: Math.pow (r, 2)

        System.out.println("El area de una circunferencia de radio " + r + " es: " + a);

    }
}
