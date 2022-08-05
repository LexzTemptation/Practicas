package condicionales;

import java.util.Scanner;

public class Pract8
{
    public static void main(String[] args)
    { 
        System.out.println();
        Scanner feli = new Scanner(System.in);

        int num;

        System.out.print("Ingrese un número: ");
        num = feli.nextInt();

        System.out.println();

        if(num < 10)
        {
            System.out.println("El número ingresado tiene UNA sola cifra");
        }
        else if(num >= 10 && num < 100)
        {
            System.out.println("El número ingresado tiene DOS cifras");
        }
        else if(num >= 100 && num < 1000)
        {
            System.out.println("El número ingresado tiene TRES cifras");
        }
        else if(num >= 1000 && num <10000)
        {
            System.out.println("El número ingresado tiene CUATRO cifras");
        }
        else if(num >= 10000 && num <100000)
        {
            System.out.println("El número ingresado tiene 5INK0 cifras");
        }
        else
        {
            System.out.println("El número ingresado tiene MÁS DE 5INK0 cifras");
        }

        feli.close();
        System.out.println();
    }
}
