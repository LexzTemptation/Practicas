/* 
    Pedir un número N, y mostrar todos los números del 1 al N.
*/

package bucles;

import javax.swing.JOptionPane;

public class Pract18 
{
    public static void main(String[] args)
    { 
        System.out.println();
        
        int num, contador = 1;

        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número"));

        System.out.println();

        while (contador <= num)
        {
            System.out.println((contador++));
        }

        System.out.println();
    }
}
