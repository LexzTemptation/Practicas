package bucles;

import javax.swing.JOptionPane;

public class Pract15 
{
    public static void main(String[] args)
    { 
        System.out.println();

        int num;

        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número: "));

        while (num >= 0)
        {
            if (num >= 0 )
            {
                JOptionPane.showMessageDialog(null,"El número es: " + num);
                System.out.println("El número es: " + num);
            }
            
            num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número: "));
        }

        JOptionPane.showMessageDialog(null,"El número digitado fue menor a cero" +
                                                            "\nFIN DEL PROGRAMA");

        System.out.println();
    }
}
