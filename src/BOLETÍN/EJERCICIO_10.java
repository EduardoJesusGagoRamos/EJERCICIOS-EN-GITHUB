// Pedir tres números y mostrarlos ordenados de mayor a menor

package BOLETÍN;

import java.util.Scanner;

/**
 *
 * @author GAGO RAMOS EDUARDO JESÚS
 */
public class EJERCICIO_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("Introduzca primer numero: ");
        a = sc.nextInt();
        System.out.println("Introduzca segundo numero: ");
        b = sc.nextInt();
        System.out.println("Introduzca tercer numero: ");
        c = sc.nextInt();

        if (a > b && b > c) {
            System.out.println(a + ", " + b + ", " + c);

        } else {
            if (a > c && c > b) {
                System.out.println(a + ", " + c + ", " + b);
            } else {
                if (b > a && a > c) {
                    System.out.println(b + ", " + a + "," + c);
                } else {
                    if (b > c && c > a) {
                        System.out.println(b + ", " + c + ", " + a);

                    } else {
                        if (c > a && a > b) {
                            System.out.println(c + ", " + a + ", " + b);

                        } else {
                            if (c > b && b > a) {
                                System.out.println(c + ", " + b + ", " + a);
                            }
                        }
                    }
                }
            }
        }

    }

}
