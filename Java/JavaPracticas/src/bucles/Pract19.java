package bucles;

import javax.swing.JOptionPane;

public class Pract19
{
    public static void main(String[] args)
    { 
        System.out.println();
        
        int num = 0, suma = 0;

        for(int i = 1; i <= 10; i++)
        {
            num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número: "));

            suma += num;
        }

        JOptionPane.showMessageDialog(null,"La suma de los números ingresados es: " + suma);

        System.out.println();
    }
}
