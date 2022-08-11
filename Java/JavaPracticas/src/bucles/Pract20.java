/*
    Ingresar un número y calcular su factorial
*/

package bucles;

import javax.swing.JOptionPane;

public class Pract20
{
    public static void main(String[] args)
    { 
        System.out.println();
        
        int factorial = 1, num;

        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero a calcular su factorial: "));

        for(int i = 1; i <= num; i++)
        {

            factorial = factorial * i;
            
            //1x1 factorial = 1
            //1x2 factorial = 2
            //2x3 factorial = 6
            //6x4 factorial = 24
            //24x5 factorial = 120

        }

        System.out.println(factorial);

        System.out.println();
    }

}
