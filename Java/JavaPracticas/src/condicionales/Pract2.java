//
package condicionales;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Pract2
{

    public static void main(String[] args)
    {
        Scanner feli = new Scanner(System.in);

        float num1, num2;
/* 
        System.out.print("Ingrese el primer número: ");
        num1 = feli.nextFloat();

        System.out.print("Ingrese el segundo número: ");
        num2 = feli.nextFloat();

        if (num1 > num2)
        {
            System.out.println("El primer número es mayor: " + num1);
        }
        else if (num1 == num2)
        {
            System.out.println("El primer numero " + num1 + " y el segundo numero " + num2 +" son iguales");
        }
        else
        {
            System.out.println("El segundo número es mayor: " + num2);
        }
*/
        num1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese el primer número: "));
        num2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese el segundo número: "));

        if (num1 > num2)
        {
            JOptionPane.showMessageDialog(null, "El primer número es mayor: " + num1);
        }
        else if (num1 == num2)
        {
            JOptionPane.showMessageDialog(null, "El primer numero " + num1 + " y el segundo numero " + num2 +" son iguales");
        }
        else
        {
           JOptionPane.showMessageDialog(null, "El segundo número es mayor: " + num2);
        }

        feli.close();
        System.out.println();
    }
}
