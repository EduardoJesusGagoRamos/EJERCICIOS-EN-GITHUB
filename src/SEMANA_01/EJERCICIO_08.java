// Calcular el área de un circulo sabiendo que pi = 3,14159265 A= pi x r2, sabiendo que r=5.

package SEMANA_01;

/**
 *
 * @author GAGO RAMOS EDUARDO JESÚS
 */
public class EJERCICIO_08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here      
        
        double pi = 3.14159265;
        int r = 5;
        
        double are = pi * r * r;
        System.out.println("El area del circulo es: " + are);
    }
}
