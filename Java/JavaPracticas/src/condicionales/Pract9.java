package condicionales;

import java.util.Scanner;

public class Pract9
{
    public static void main(String[] args)
    {
        System.out.println();
        Scanner feli = new Scanner(System.in);

        int dia, mes, anio;

        System.out.print("Ingrese el día: ");
        dia = feli.nextInt();
        System.out.print("Ingrese el mes: ");
        mes = feli.nextInt();
        System.out.print("Ingrese el año: ");
        anio = feli.nextInt();

        System.out.println();

        if (dia >= 1 && dia <= 31)
        {
            if (mes >= 1 && mes <= 12)
            {
                if (anio != 0)
                {
                    System.out.println("La fecha ingresada es correcta");
                }
                else
                {
                    System.out.println("El año ingresado es incorrecto");
                }
            }
            else
            {
                System.out.println("El mes ingresado es incorrecto");
            }
        }
        else
        {
            System.out.println("El día ingresado es incorrecto");
        }

        feli.close();
        System.out.println();
    }
}
