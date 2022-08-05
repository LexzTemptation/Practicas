package condicionales;

import java.util.Scanner;

public class Pract11
{
    public static void main(String[] args)
    {
        System.out.println();
        Scanner feli = new Scanner(System.in);

        int nota;

        System.out.print("Ingrese la nota que obtuvo: ");
        nota = feli.nextInt();

        System.out.println();

        if ( nota <= 5 ) 
        {
            System.out.println("La nota es INSUFICIENTE");
        }
        else if  (nota >= 6 && nota <= 7)
        {
            System.out.println("La nota es SUFICIENTE");
        }
        else if  (nota >= 8 && nota < 9)
        {
            System.out.println("Su nota es NOTABLE");
        }
        else if  (nota >=9 && nota <= 10)
        {
            System.out.println("La nota es SOBRESALIENTE");
        }
        else
        {
            System.out.println("Solo se permiten notas hasta 10");
        }

        feli.close();
        System.out.println();
    }

}
