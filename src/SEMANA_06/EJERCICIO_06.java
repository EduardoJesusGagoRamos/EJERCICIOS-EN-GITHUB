package SEMANA_06;

// Crear un método que obtenga el resultado de elevar un número a otro. Ambos números se deben pasar como parámetros

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
        int base = 2;
        int exp = 0;
        System.out.println(base + " elevado a " + exp + " = " + poten(base, exp));
    }
    //método que devuelve base elevado a exp
    //ejemplo: base = 2 y exp = 4 -> 4

    static int poten(int base, int exp) {
        if (exp == 0) {
            return 1; // cualquier número elevado a cero es 1
        } else if (exp == 1) {
            return base;
        } else {
            return base * poten(base, exp - 1);
        }
    }
}
