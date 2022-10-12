/*
 * Diseñar una aplicación que declare una tabla de 10 elementos enteros. Leer
 * mediante el teclado 8 números. Después se debe pedir un número y una
 * posición, insertarlo en la posición indicada, desplazando los que estén
 * detrás.
 */

package arreglos;

import java.util.Scanner;

public class Pract31
{
    public static void main(String[] args)
    {
        System.out.println();
        Scanner feli = new Scanner(System.in);

        int a[] = new int[10];
        int numero, posicion;

        // Introduciendo los primeros 8 elementos del arreglo.
        for (int i = 0; i < 8; i++)
        {
            System.out.print((i + 1) + ". Digite un número: ");
            a[i] = feli.nextInt();
        }

        // Ingresar 2 número en posiciones determinadas por el usuario.
        for (int i = 0; i < 2; i++)
        {
            System.out.print("\nDigite una posición entre 1-10: ");
            posicion = feli.nextInt();

            System.out.print("\nDigite un número para ingresar al arreglo: ");
            numero = feli.nextInt();

            for (int j = 9; j >= posicion; j--)
            {
                a[j] = a[j - 1];
            }
            a[posicion - 1] = numero;
        }

        // Imprimiendo el arreglo.
        System.out.print("\nEl arreglo es: ");
        for (int i = 0; i < 10; i++)
        {
            System.out.print(a[i] + " ");
        }

        feli.close();
        System.out.println("\n");
    }
}
