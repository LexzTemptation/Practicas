// Leer 10 números enteros, guardarlos en un arreglo. Debemos mostrarlos en el 
// siguiente orden: el primero, el último, el segundo, el penúltimo, el tercero, etc.
package arreglos;

import java.util.Scanner;

public class Pract29
{
    public static void main(String[] args)
    {
        System.out.println();
        Scanner feli = new Scanner(System.in);

        int numeros[] = new int[10];
        int contador = 9, aux = 0;

        System.out.println("Ingrese 10 numero para llenar el arreglo \n");

        for (int i = 0; i < 10; i++)
        { // for para rellenar el arreglo de numeros
            System.out.print("Ingresa el valor " + (i + 1) + ": ");
            numeros[i] = feli.nextInt();
        }

        System.out.println("\nEstos son los numeros en el orden solicitado: \n");

        for (int i = 0; i < 5; i++)
        { // for para ordenar los numeros
            if (i == 0)
            {
                System.out.print(numeros[i] + " ");
                i = contador;
                System.out.print(numeros[i] + " ");
                i = 0;

            }
            else
            {
                System.out.print(numeros[i] + " ");
                aux = i;
                i = contador - 1;

                System.out.print(numeros [i] + " ");
                i = aux;
                contador -= 1;
            }
        }

        feli.close();
        System.out.println();
    }
}
