package bucles;

import javax.swing.JOptionPane;

public class Pract14 
{
    public static void main(String[] args)
    { 
        System.out.println();

        int num;

        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número"));

        System.out.println();

        while (num >= 0)
        {
            JOptionPane.showMessageDialog(null,"El número es: " + num);

            num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número"));
        }

        JOptionPane.showMessageDialog(null,"El número digitado fue menor a cero" +
                                                            "\nFIN DEL PROGRAMA");

        System.out.println();
    }
}
