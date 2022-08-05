package condicionales;

import java.util.Scanner;

public class Pract6
{
    public static void main(String[] args)
    {
        System.out.println();
        Scanner feli = new Scanner(System.in);

        // Ejercicio 13
        
        int num1, nuw2;

        System.out.print("Ingrese el primer número: ");
        num1 = feli.nextInt();

        System.out.println();

        System.out.print("Ingrese el segundo número: ");
        nuw2 = feli.nextInt();

        System.out.println();

        if (num1 > nuw2)
        {
            System.out.println("El número " + num1 + " es mayor al número " + nuw2);
        }
        else if (num1 == nuw2)
        {
            System.out.println("El número " + num1 + " es igual al número " + nuw2);
        }
        else
        {
            System.out.println("El número " + nuw2 + " es mayor al número " + num1);
        }

        
        // Ejercicio 13

        //Ejercicio 15



        //Ejercicio 15

        feli.close();
        System.out.println();
    }
}
