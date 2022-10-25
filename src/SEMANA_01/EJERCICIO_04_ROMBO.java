// Realizar un programa que calcule el perímetro y area de las siguientes figuras geométricas: ROMBO

package SEMANA_01;
import java.util.Scanner;
/**
 *
 * @author GAGO RAMOS EDUARDO JESÚS
 */
public class EJERCICIO_04_ROMBO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int a;
        int d;
        int D;
        
        System.out.print("Ingresa el lado: ");
        Scanner numa = new Scanner(System.in);
        a = numa.nextInt();
        System.out.print("Ingresa la diagonal menor: ");
        Scanner numd = new Scanner(System.in);
        d = numd.nextInt();
        System.out.print("Ingresa la diagonal mayor: ");
        Scanner numD = new Scanner(System.in);
        D = numD.nextInt();
        int per = 4 * a;
        System.out.println("El perimetro del rombo es: " + per);
        int are = (D * d) / 2;
        System.out.println("El area del rombo es: " + are);
    }
}
