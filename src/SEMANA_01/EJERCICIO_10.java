// Calcular la suma de las áreas de 8 círculos cuyos radios son 18.9, 16.7, 71.9, 4.6, 6.7, 5.6, .4.7 y 10.

package SEMANA_01;

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
        
        double pi = 3.14159265;
        double r1 = 18.9;
        double r2 = 16.7;
        double r3 = 71.9;
        double r4 = 4.6;
        double r5 = 6.7;
        double r6 = 5.6;
        double r7 = 4.7;
        double r8 = 10;
        
        double are = (pi * r1 * r1) + (pi * r2 * r2) + (pi * r3 * r3) + (pi * r4 * r4)  + (pi * r5 * r5) + (pi * r6 * r6) + (pi * r7 * r7) + (pi * r8 * r8);
        System.out.println("La suma de las areas de 8 circulos es: " + are);
    }
}
