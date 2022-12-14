// Crea un método que compruebe si una palabra está ordenada alfabéticamente

package SEMANA_06;


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
        //palabra analizada
        String palabra = "abcdef";
        if (orden(palabra)) {
            System.out.println("La palabra esta ordenada alfabeticamente");
        } else {
            System.out.println("La palabra NO esta ordenada alfabeticamente");
        }
    }
    //método que comprueba si una palabra está ordenada alfabéticamente
    //ejemplo: abcdef -> true

    public static boolean orden(String cad) {
        cad = cad.toLowerCase();
        if (cad.length() > 1) {
            if (cad.charAt(0) <= cad.charAt(1)) {
                return orden(cad.substring(1, cad.length()));
            } else {
                return false;
            }
        } else {
            return true;
        }
    }
}
