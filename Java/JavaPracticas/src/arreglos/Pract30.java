
/*
 * Pedir 12 numeros para dos tablas, guardar esos numeros en dos arrays, y
 * mezclarlos en un tercer array
 * de la siguiente forma: 3 numeros del primero,3 del segundo, 3 del primero, 3
 * del segundo etc ...
 */

package arreglos;

import java.util.Scanner;

public class Pract30
{
    public static void main(String[] args)
    {
        System.out.println();
        Scanner feli = new Scanner(System.in);

        int a[] = new int[12];
        int b[] = new int[12];
        int c[] = new int[24];
        int j = 0;

        for (int i = 0; i < 12; i++)
        {
            System.out.print((i + 1) + ".-Ingrese el número " + (i + 1) + " del arreglo A: ");
            a[i] = feli.nextInt();
        }

        System.out.println("");

        for (int i = 0; i < 12; i++)
        {
            System.out.print((i + 1) + ".-Ingrese el número " + (i + 1) + " del arreglo B: ");
            b[i] = feli.nextInt();
        }

        System.out.println();

        for (int i = 0; i < 12; i++)
        {
            c[j] = a[i];
            c[j+3] = b[i];
            j++;

            if (j == 3 || j == 9 || j == 15)
            {
                j += 3;
            }
        }

        System.out.println("Orden: ");
        for (int i = 0; i < 24; i++)
        {
            System.out.print(c[i] + " ");
        }

        feli.close();
        System.out.println();
    }
}
