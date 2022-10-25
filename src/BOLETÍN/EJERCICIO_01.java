// Pedir los coeficientes de una ecuación se 2º grado, y muestre sus soluciones reales. Si no existen, debe indicarlo.

package BOLETÍN;

import java.util.Scanner;

/**
 *
 * @author GAGO RAMOS EDUARDO JESÚS
 */
public class EJERCICIO_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner numero = new Scanner(System.in);

        double a, b, c; // coeficientes ax^2+bx+c=0
        double x1, x2, d; // soluciones y determinante

        System.out.println("Introduzca primer coeficiente (a):");
        a = numero.nextDouble();
        System.out.println("Introduzca segundo coeficiente: (b):");
        b = numero.nextDouble();
        System.out.println("Introduzca tercer coeficiente: (c):");
        c = numero.nextDouble();

        // calculamos el determinante
        d = ((b * b) - 4 * a * c);
        if (d < 0) {
            System.out.println("No existen soluciones reales");
        } else {
            // queda confirmar que a sea distinto de 0.

            // si a=0 nos encontramos una división por cero.
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Solucion1: " + x1);
            System.out.println("Solucion2: " + x2);
        }
    }
}
