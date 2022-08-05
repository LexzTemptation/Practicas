package condicionales;

import java.util.Scanner;

public class Pract7
{
    public static void main(String[] args)
    { 
        System.out.println();
        Scanner feli = new Scanner(System.in);

        int num1, num2;

        System.out.print("Ingrese el primer número: ");
        num1 = feli.nextInt();

        System.out.print("Ingrese el segundo número: ");
        num2 = feli.nextInt();

        System.out.println();

        if(num1%2 == 0 && num2%2 == 0)
        {
            System.out.println("El número " + num1 + " y el número " + num2 + " son pares");
        }
        else if(num1%2 == 1 && num2%2 == 1)
        {
            System.out.println("El número " + num1 + " y el número " + num2 + " son impares");
        }
        else if(num1%2 == 0 && num2%2 == 1)
        {
            System.out.println("El número " + num1 + " es par pero el número " + num2 + " es impar");
        }
        else
        {
            System.out.println("El número " + num1 + " es impar pero el número " + num2 + " es par");
        }

        feli.close();
        System.out.println();
    }
}
