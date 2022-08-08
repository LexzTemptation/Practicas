package bucles;

import java.util.Scanner;

public class DoWhile
{
    public static void main(String[] args)
    { 
        System.out.println();
        Scanner feli = new Scanner(System.in);

        /*do While
        
        do
        {
            instrucciones;
        }
        while (condición);
        */

        int i = 1, i2 = 10, i3 = 1, contador;

        do
        {
            System.out.println(i);
            i++;
        }
        while (i <= 10);

        System.out.println();

        do
        {
            System.out.println(i2);
            i2--;
        }
        while (i2 >= 1);

        System.out.println();

        System.out.print("Digite la cantidad de terminos: ");
        contador = feli.nextInt();

        System.out.println();

        do
        {
            System.out.println(i3);
            i3++;
        }
        while (i3 <= contador);



        feli.close();
        System.out.println();
    }
}
