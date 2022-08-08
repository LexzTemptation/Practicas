package bucles;

import java.util.Scanner;

public class CicloFor 
{
    public static void main(String[] args)
    { 
        System.out.println();
        Scanner feli = new Scanner(System.in);

        /*for
        
        for (inicialización ; condición ; aumento o decremento)
        {
            instrucciones;
        }
        */

        for (int i = 1; i <= 10; i++)
        {
            System.out.println(i);
        }

        System.out.println();

        for (int i2 = 10; i2 >= 1; i2--)
        {
            System.out.println(i2);
        }

        System.out.println();

        int contador;

        System.out.print("Digite la cantidad de terminos: ");
        contador = feli.nextInt();

        System.out.println();

        for (int i3 = 1; i3 <= contador ; i3++)
        {
            System.out.println(i3);
        }

        feli.close();
        System.out.println();
    }
}
