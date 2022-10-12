
package arreglos;

import java.util.Scanner;

public class Pract32
{
    public static void main(String[] args)
    {
        System.out.println();
        Scanner feli = new Scanner(System.in);

        int arreglo[] = new int[10];
        int ultimo, desplazar;

        for (int i = 0; i < arreglo.length; i++)
        {
            System.out.print(i + ".- Digite el valor: ");
            arreglo[i] = feli.nextInt();
        }

        ultimo = arreglo[9];

        System.out.print("\nIngrese las pocisiones a desplazar: ");
        desplazar = feli.nextInt();

        for (int i = desplazar; i > 0; i--)
        {
            for (int j = 8; j >= 0; j--)
            {
                arreglo[j + 1] = arreglo[j];
            }

            arreglo[0] = ultimo;
            ultimo = arreglo[9];
        }

        for (int i : arreglo)
        {
            System.out.println(i + " ");
        }

        feli.close();
        System.out.println();
    }
}
