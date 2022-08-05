package condicionales;

import java.util.Scanner;

public class Pract10
{
    public static void main(String[] args)
    {
        System.out.println();
        Scanner feli = new Scanner(System.in);

        int num1, num2, suma, resta, multip, division;
        char op;

        System.out.print("Digite el primer numero: ");
        num1 = feli.nextInt();
        System.out.print("Digite el primer numero: ");
        num2 = feli.nextInt();

        System.out.print("\nDigite la operación a realizar\n" +
                "\nSuma: S, s" +
                "\nResta: R, r" +
                "\nMultiplicación: M, m , P, p" +
                "\nDivisión: D, d\n" +
                "\nOpción: ");
        op = feli.next().charAt(0);

        switch (op)
        {
            case 's':
            case 'S':
                suma = num1 + num2;
                System.out.println("\nLa suma es: " + suma);
                break;

            case 'r':
            case 'R':
                resta = num1 - num2;
                System.out.println("\nLa resta es: " + resta);
                break;

            case 'p':
            case 'P':
            case 'm':
            case 'M':
                multip = num1 * num2;
                System.out.println("\nLa multiplicación es: " + multip);
                break;

            case 'd':
            case 'D':
                division = num1 / num2;
                System.out.println("\nLa división es: " + division);
                break;
        }

        feli.close();
        System.out.println();
    }

}
