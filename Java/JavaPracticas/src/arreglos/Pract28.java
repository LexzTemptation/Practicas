// 
package arreglos;

import java.util.Scanner;

public class Pract28
{
    public static void main(String[] args)
    {
        System.out.println();
        Scanner feli = new Scanner(System.in);

        float numeros[] = new float[5];

        for (int i = 4; i >= 0; i--)
        {
            System.out.print("Digite un numero: ");
            numeros[i] = feli.nextFloat();
        }
        for (float i : numeros)
        {
            System.out.println(i);
        }

        feli.close();
        System.out.println();
    }
}
