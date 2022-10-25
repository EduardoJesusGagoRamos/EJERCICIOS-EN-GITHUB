// Realizar un programa que calcule el perímetro y area de las siguientes figuras geométricas: CUADRADO

package SEMANA_01;
import java.util.Scanner;
/**
 *
 * @author GAGO RAMOS EDUARDO JESÚS
 */
public class EJERCICIO_04_CUADRADO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
              
        int a;
  
        System.out.print("Ingresa el lado: ");
        Scanner numa = new Scanner(System.in);
        a = numa.nextInt();
        int per = 4 * a;
        System.out.println("El perimetro del cuadrado es: " + per);
        int are = a * a;
        System.out.println("El area del cuadrado es: " + are);
    }
}
