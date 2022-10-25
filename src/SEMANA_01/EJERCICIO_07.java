// Realizar un programa que permita ingresar 10 números por teclado, el programa debe calcular la multiplicación entre la suma de los primeros 5 números y la suma de los 5 últimos números.

package SEMANA_01;
import java.util.Scanner;
/**
 *
 * @author GAGO RAMOS EDUARDO JESÚS
 */
public class EJERCICIO_07 {

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
        int numero6;
        int numero7;
        int numero8;
        int numero9;
        int numero10;

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
        System.out.print("Ingresa el sexto numero: ");
        Scanner num6 = new Scanner(System.in);
        numero6 = num6.nextInt();
        System.out.print("Ingresa el septimo numero: ");
        Scanner num7 = new Scanner(System.in);
        numero7 = num7.nextInt();
        System.out.print("Ingresa el octavo numero: ");
        Scanner num8 = new Scanner(System.in);
        numero8 = num8.nextInt();
        System.out.print("Ingresa el noveno numero: ");
        Scanner num9 = new Scanner(System.in);
        numero9 = num9.nextInt();
        System.out.print("Ingresa el decimo numero: ");
        Scanner num10 = new Scanner(System.in);
        numero10 = num10.nextInt();
        int prod = (numero1 + numero2 + numero3 + numero4 + numero5) * (numero6 + numero7 + numero8 + numero9 + numero10);
        System.out.println("El producto es: " + prod);
    }
}
