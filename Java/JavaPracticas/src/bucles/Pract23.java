package bucles;

import java.util.Scanner;

public class Pract23
{
    public static void main(String[] args)
    { 
        System.out.println();
        Scanner feli = new Scanner(System.in);
        
        int num, multiplicacion = 0, res;

        System.out.print("Ingrese el número de la tabla de multiplicar: ");
        num = feli.nextInt();

        System.out.println("\nA continuación se mostrara la tabla de multiplicar del: " + num);

        System.out.println();

        for(int i = 1; i <= 10; i++)
        {

            multiplicacion++;

            res = num * multiplicacion;

            System.out.println(num + " x " + multiplicacion + " = " + res);

        }
         
        feli.close();
        System.out.println();
    }
}


