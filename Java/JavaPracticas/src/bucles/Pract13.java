package bucles;

import javax.swing.JOptionPane;

public class Pract13 
{
    public static void main(String[] args)
    { 
        System.out.println();

        int num, cuad;

        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un número: "));

        while (num >= 0) //Mientras el número sea 0 o positivo
        {
            cuad = (int)Math.pow(num, 2);

            JOptionPane.showMessageDialog(null,"El número " + num + " elevado al cuadrado es: " + cuad);

            num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite otro número: "));
        }

        JOptionPane.showMessageDialog(null,"El número digitado fue menor a cero" +
                                                            "\nFIN DEL PROGRAMA");

        System.out.println();
    }
}
