// 
package arreglos;

import java.util.Scanner;

public class Pract28
{
    public static void main(String[] args)
    {
        System.out.println();
        Scanner feli = new Scanner(System.in);

        int numeros[] = new int[5];

        for (int i = 4; i >= 0; i--)
        {
            System.out.print("Digite un numero: ");
            numeros[i] = feli.nextInt();
        }

        System.out.println("");

        for (int i : numeros)
        {
            System.out.println(i);
        }

        feli.close();
        System.out.println();
    }
}
