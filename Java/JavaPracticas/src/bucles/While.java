package bucles;

import java.util.Scanner;

public class While
{
    public static void main(String[] args)
    { 
        System.out.println();
        Scanner feli = new Scanner(System.in);

        /*
        while (condición) //Mientras se cumpla una condición se van a ejecutar determinado número de condiciones
            {
                instrucciones; //se van a ejecutar determinado número de instrucciones
            }
        */

        int i = 1, i2 = 10, i3 = 0, contador;

        while(i <= 10)
        {
            System.out.println(i);
            i++;
        }

        System.out.println();

        while(i2 >= 1)
        {
            System.out.println(i2);
            i2--;
        }

        System.out.print("\nDigite cuantos números quiere ver en pantalla:");
        contador = feli.nextInt();

        System.out.println();

        while(i3 <= contador)
        {
            System.out.println(i3);
            i3++;
        }

        feli.close();
        System.out.println();
    }

}
