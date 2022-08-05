
package javapracticas;

import java.util.Scanner;

public class Pract1
{
    public static void main(String[] args)
    {
        System.out.println();

        Scanner feli = new Scanner(System.in);
        
        /*double horasTrabajadas, sueldoXHora = 0, total;
        
        System.out.println();

        System.out.print("Ingrese las horas trabajadas: ");
        horasTrabajadas = feli.nextFloat();
        
        System.out.println();
        
        System.out.print("Ingrese el sueldo por hora: ");
        sueldoXHora = feli.nextFloat();
        
        total = horasTrabajadas * sueldoXHora;
        
        System.out.println();
        
        System.out.println("El total es: " + total);*/

        double a, b, resultado;

        System.out.print("ingrese la primer variable: ");
        a = feli.nextFloat();
        System.out.print("ingrese la segunda variable: ");
        b = feli.nextFloat();

        resultado = (int)Math.pow((a+b),2); /*Math.pow(a, 2) + Math.pow(b, 2) + (2*a*b);*/

        System.out.println();
        System.out.println("El cuadrado de la suma es: " + resultado);
        
        feli.close();
        System.out.println();
    }
    
}
