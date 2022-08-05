package condicionales;

import java.util.Scanner;

public class Pract12
{
    public static void main(String[] args)
    {
        System.out.println();
        Scanner feli = new Scanner(System.in);

        int op = 0;
        double kg, libra, onza, gramo, tonelada;

        System.out.print("Ingrese la unidad de masa en kg: ");
        kg = feli.nextFloat();

        System.out.print("\n¿A que unidad desea convertir?: "
                + "\n 1.- Libra (lb)"
                + "\n 2.- Onza (oz)"
                + "\n 3.- Gramo (g)"
                + "\n 4.- Tonelada (t)\n"
                + "\n Opción: ");
        op = feli.nextInt();

        System.out.println();

        switch (op)
        {
            case 1:
            {
                libra = kg * 20462;
                System.out.println("Los gramos son: " + libra);
            }
            break;

            case 2:
            {
                onza = kg * 35.273;
                System.out.println("Los gramos son: " + onza);
            }
            break;

            case 3:

            {
                tonelada = kg * 0.00110231;
                System.out.println("Los gramos son: " + tonelada);
            }
            break;

            case 4:
            {
                gramo = kg * 1000;
                System.out.println("Los gramos son: " + gramo);
            }
            break;

            default:
            {
                System.out.println("La opción no está disponible");
            }
            break;
        }

        feli.close();
        System.out.println();
    }
}
