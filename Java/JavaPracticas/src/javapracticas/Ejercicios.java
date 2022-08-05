//Formula General

package javapracticas;

import java.util.Scanner;

public class Ejercicios
{
    public static void main(String[] args)
    {
        System.out.println();
        Scanner feli = new Scanner(System.in);

        //Ejercicio 8, Formula general
        
        double a, b, c, x1, x2;

        System.out.print("Ingrese la primer variable: ");
        a = feli.nextFloat();

        System.out.print("Ingrese la segunda variable: ");
        b = feli.nextFloat();

        System.out.print("Ingrese la tercer variable: ");
        c = feli.nextFloat();

        x1 = (-(b) + (Math.sqrt((Math.pow(b ,2)-4*(a)*(c)))))/(2*(a));

        x2 = (-(b) - (Math.sqrt((Math.pow(b ,2)-4*(a)*(c)))))/(2*(a));

        System.out.println("El resultado es: " + x1 +" "+ x2);
        
        //Ejercicio 8

        feli.close();
    }
}
