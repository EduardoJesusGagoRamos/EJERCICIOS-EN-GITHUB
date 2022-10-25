// Realizar un programa que calcule la multiplicación de 5 números ingresados por teclado.

package SEMANA_01;
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

        int numero1;
        int numero2;
        int numero3;
        int numero4;
        int numero5;

        System.out.print("Ingresa el primer numero: ");
        Scanner numl = new Scanner(System.in);
        numero1 = numl.nextInt();
        System.out.print("Ingresa el segundo numero: ");
        Scanner num2 = new Scanner(System.in);
        numero2 = num2.nextInt();
        System.out.print("Ingresa el tercer numero: ");
        Scanner num3 = new Scanner(System.in);
        numero3 = num3.nextInt();
        System.out.print("Ingresa el cuarto numero: ");
        Scanner num4 = new Scanner(System.in);
        numero4 = num4.nextInt();
        System.out.print("Ingresa el quinto numero: ");
        Scanner num5 = new Scanner(System.in);
        numero5 = num5.nextInt();
        int prod = numero1 * numero2 * numero3 * numero4 * numero5;
        System.out.println("El producto es: " + prod);
    }
}
