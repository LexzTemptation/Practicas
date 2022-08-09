/*
    Pedir números hasta que se teclee un 0, mostrar la suma de todos los números introducidos.
 */

package bucles;

import javax.swing.JOptionPane;

public class Pract17
{
    public static void main(String[] args)
    {
        System.out.println();

        int num, contador = 0;

        do
        {
            num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un número "));

            if (num > 1)
            {
                JOptionPane.showMessageDialog(null, "El numero digitado fue: " + num + 
                                                                    "\nDigite un número diferente de 0 ");
                System.out.println("\nEl numero digitado fue: " + num + 
                                   "\nDigite un número diferente de 0 ");
            }

            contador+=num;
        }
        while (num != 0); 

        JOptionPane.showMessageDialog(null, "Fin del programa, la suma es: " + contador);
        System.out.println("\nFin del programa, la suma es: " + contador);

        System.out.println();
    }
}
