//
package condicionales;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Pract4
{

    public static void main(String[] args)
    {
        System.out.println();
        Scanner feli = new Scanner(System.in);

        int num1, num2;
        
        System.out.print("Ingrese el primer número: ");
        num1 = feli.nextInt();

        System.out.print("Ingrese el segundo número: ");
        num2 = feli.nextInt();
        
        if(num1%2==0 || num2%2==0)
        {
            System.out.println("Los numeros ");
        }
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el primer número: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el segundo número: "));



        feli.close();
        System.out.println();
    }
}
