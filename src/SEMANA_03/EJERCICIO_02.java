// Leer 10 números enteros y mostrar la media de los valores positivos y de los valores negativos

package SEMANA_03;
import java.util.Scanner;

/**
 *
 * @author GAGO RAMOS EDUARDO JESÚS
 */


public class EJERCICIO_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Leer 10 números enteros y mostrar la media de los valores positivos
        //y la de los valores negativos.
        
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int pos = 0, neg = 0; //contadores positivos y negativos
        int i;
        double sumaPos = 0, sumaNeg = 0; //suma de positivos y negativos
       
        //Leemos los valores por teclado y los guardamos en el array                                              
        System.out.println("Lectura de los elementos del array: ");
        for (i = 0; i < numeros.length; i++) {
            System.out.print("numeros[" + i + "]= ");
            numeros[i] = sc.nextInt();
        }
  
        //se recorre el array para contar positivos, negativos y ceros
        for (i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                sumaPos += numeros[i];
                pos++;
            } else if (numeros[i] < 0) { //sumar Negativos
                sumaNeg += numeros[i];
                neg++;
            }
        }
  
        //mostrar resultados
        if(pos != 0){
            System.out.println("Media de los valores positivos: "+sumaPos/pos);
        }else{
            System.out.println("No ha introducido numeros positivos");
        }
        if(neg != 0){
            System.out.println("Media de los valores positivos: "+sumaNeg/neg);
        }else{
            System.out.println("No ha introducido numeros negativos");
        }
    }
}
