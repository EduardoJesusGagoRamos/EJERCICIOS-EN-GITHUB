// Suma de dos números

package SEMANA_01;
import java.util.Scanner;

/**
 *
 * @author mbt99
 */
public class EJEMPLO_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int numero1;
        int numero2;

        System.out.println("Ingresa el primero numero");
        Scanner num1 = new Scanner(System.in);
        numero1 = num1.nextInt();
        System.out.println("Ingresa el segundo numero");
        Scanner num2 = new Scanner(System.in);
        numero2 = num2.nextInt();
        int suma = numero1 + numero2;
        System.out.println("La suma de los dos numeros es: " + suma);
    }

}
