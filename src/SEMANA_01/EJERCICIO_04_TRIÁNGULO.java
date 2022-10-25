// Realizar un programa que calcule el perímetro y area de las siguientes figuras geométricas: TRIÁNGULO

package SEMANA_01;

import java.util.Scanner;

/**
 *
 * @author GAGO RAMOS EDUARDO JESÚS
 */
public class EJERCICIO_04_TRIÁNGULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        int base;
        int altura;
        int lado1;
        int lado2;
        int lado3;
        int b;
        int h;

        System.out.print("Ingresa el lado 1: ");
        Scanner numl = new Scanner(System.in);
        lado1 = numl.nextInt();
        System.out.print("Ingresa el lado 2: ");
        Scanner num2 = new Scanner(System.in);
        lado2 = num2.nextInt();
        System.out.print("Ingresa el lado 3: ");
        Scanner num3 = new Scanner(System.in);
        lado3 = num3.nextInt();
        int per = lado1 + lado2 + lado3;
        System.out.println("El perimetro del triangulo es: " + per);
        System.out.print("Ingresa la base: ");
        Scanner numb = new Scanner(System.in);
        b = numb.nextInt();
        System.out.print("Ingresa la altura: ");
        Scanner numh = new Scanner(System.in);
        h = numh.nextInt();
        int area = (b * h) / 2;
        System.out.println("El area del triangulo es: " + area);
    }
}
