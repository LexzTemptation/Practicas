//Ejercicio 12
package condicionales;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Pract3
{
    public static void main(String[] args)
    {
        System.out.println();
        Scanner feli = new Scanner(System.in);
        
        float total, totalCompra, descuento;

        System.out.println("");
        System.out.print("¿De cuanto fue su compra?: $");
        total = feli.nextFloat();
        
        if (total >= 300)
        {
            descuento = (float) (total * 0.20);
            
            totalCompra = total - descuento;
            
            System.out.println("Su descuento es de: $" + descuento);
            System.out.println("El total con descuento es de: $" + totalCompra);
        }
        else
        {
            System.out.println("El total a pagar es de: $" + total);
        }
        
        total = Float.parseFloat(JOptionPane.showInputDialog(null, "¿De cuanto fue su compra?"));
        
        if (total >= 300)
        {
            descuento = (float) (total * 0.20);
            
            totalCompra = total - descuento;
            
            JOptionPane.showMessageDialog(null, "El total es: $" + total 
                                               + "\nSu descuento es de: $" + descuento
                                               +" \nEl total con descuento es de: $" + totalCompra);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "El total a pagar es de: $" + total);
        }
        
        feli.close();
        System.out.println();
    }
}
