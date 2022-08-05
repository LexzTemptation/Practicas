package condicionales;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Pract5
{
    public static void main(String[] args)
    {
        System.out.println();
        Scanner feli = new Scanner(System.in);

        // Ejercicio 10, Ingresar dos números y decir cual el es mayor o si son iguales
        /*
        int num1, nuw2;

        System.out.print("Ingrese el primer número: ");
        num1 = feli.nextInt();

        System.out.println();

        System.out.print("Ingrese el segundo número: ");
        nuw2 = feli.nextInt();

        System.out.println();

        if (num1 > nuw2)
        {
            System.out.println("El número " + num1 + " es mayor al número " + nuw2);
        }
        else if (num1 == nuw2)
        {
            System.out.println("El número " + num1 + " es igual al número " + nuw2);
        }
        else
        {
            System.out.println("El número " + nuw2 + " es mayor al número " + num1);
        }

        feli.close();
         */
        // Ejercicio 10

        // Ejercicio 11, Ingresar un caracter y compruebe si es una letra mayuscula

        char letra;

        letra = JOptionPane.showInputDialog("Ingrese una letra").charAt(0);

        if(Character.isUpperCase(letra)) //La clase "Character" tiene el metodo "isUpperCase" que comprueba 
                                         //si el caracter ingresado es mayuscula o minuscula, este regresa 
                                         //resultados boolean (true, false).
        {
            JOptionPane.showMessageDialog(null, "Es una letra mayuscula");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Es una letra minuscula");
        }

        // Ejercicio 11

        feli.close();
        System.out.println();
    }
}
