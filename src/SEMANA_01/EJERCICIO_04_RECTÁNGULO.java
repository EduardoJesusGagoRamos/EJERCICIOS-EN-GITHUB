// Realizar un programa que calcule el perímetro y area de las siguientes figuras geométricas: RECTÁNGULO

package SEMANA_01;
import java.util.Scanner;
/**
 *
 * @author GAGO RAMOS EDUARDO JESÚS
 */
public class EJERCICIO_04_RECTÁNGULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
              
        int b;
        int h;
        
        System.out.print("Ingresa la base: ");
        Scanner numb = new Scanner(System.in);
        b = numb.nextInt();
        System.out.print("Ingresa la altura: ");
        Scanner numh = new Scanner(System.in);
        h = numh.nextInt();
        int per = 2 * b + 2 * h;
        System.out.println("El perimetro del rectangulo es: " + per);
        int are = b * h;
        System.out.println("El area del rectangulo es: " + are);
    }
}
