/*
 * Llenado de arreglos desde teclado
 */

package arreglos;

import java.util.Scanner;

public class Pract27
{
    public static void main(String[] args)
    {
        System.out.println();
        Scanner feli = new Scanner(System.in);

        int nElementos;

        System.out.print("Digite la cantidad de elementos del arreglo: ");
        nElementos = feli.nextInt();

        char[] letras = new char[nElementos];

        System.out.println();

        for (int i = 0; i < letras.length; i++)
        {
            System.out.print("Digite los elementos del arreglo: ");
            letras[i] = feli.next().charAt(0);
        }

        System.out.println();

        System.out.println("Los caracteres del arreglo son: ");

        System.out.println();

        for (int i = 0; i < nElementos; i++) 
        {
            System.out.print(letras[i]);
        }

        feli.close();
        System.out.println("\n");
    }
}
