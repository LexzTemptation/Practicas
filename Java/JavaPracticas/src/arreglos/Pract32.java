
package arreglos;

import java.util.Scanner;

public class Pract32
{
    public static void main(String[] args)
    {
        System.out.println();
        Scanner feli = new Scanner(System.in);

        int[] num = new int[100];
        int suma = 0;
        double media = 0;

        // 1. Crea un array que contenga los numeros del 1 al 100. Muestralos por pantalla.

        for (int i = 0; i < num.length; i++)
        {
            num[i] = i + 1; // Aquí si se necesito poner "i+1" ya que si se hace de la manera tradicional
                            // "i++" no da el resultado esperado
            suma += num[i];

            System.out.println(num[i]);
        }

        // 2. Con el array creado anteriormente, calcula la suma y la media de todos sus valores.

        media = (double) suma / num.length;

        System.out.println("suma: " + suma + " media: " + media);

        System.out.println("*********************************");

        //3. Crea un array de una longitud que determine el usuario y que le permita insertar numeros entre 0 y 10

        System.out.print("\nIngrese la longitud: ");
        int longitud = feli.nextInt();

        int[] num2 = new int[longitud];

        int numComp;

        for (int i = 0; i < num2.length; i++)
        {
            do
            {
                System.out.print((i + 1) + ".- Ingrese un número: ");
                numComp = feli.nextInt();

                if (!(numComp >= 0 && numComp <= 10))
                {
                    System.out.print("Numeros ingresados fuera del rango permitido: ");
                }
            }
            while (!(numComp >= 0 && numComp <= 10));

            num2[i] = numComp;
        }

        System.out.print("\nNumeros elegidos: ");

        for (int i = 0; i < num2.length; i++)
        {
            System.out.print(num2[i] + " ");
        }

        System.out.println("\n*********************************");

        // 4. Crea un array insertando numeros aleatorios entre 0 y 10. Muestralos por pantalla.

        System.out.print("\nIngrese la longitud: ");
        int longit = feli.nextInt();

        int[] num3 = new int[longit];

        System.out.println();

        for (int i = 0; i < num3.length; i++)
        {
            num3[i] = (int) (Math.random() * 10) + 1;
            System.out.println((i + 1) + ".- " + num3[i]);
        }

        feli.close();
        System.out.println(" ");
    }
}
