/*
    Realizar un juego para adivinar un número. Para ello generar un número aleatorio
    entre 0-100, y luego ir pidiendo números indicando "es mayor" o "es menor" según sea mayor o 
    menor con respecto a N. El proceso termina cuando el usuario acierta y mostrar el número de 
    intentos.
*/

package bucles;

import javax.swing.JOptionPane;

public class Pract16Nota
{
    public static void main(String[] args)
    {
        System.out.println();

        int num, aleatorio, contador = 0;

        aleatorio = (int) (Math.random() * 100);
        // Se castea "aleatorio", ya que "Math.random" no acepta números enteros
        // Y se hace x100 ya que es el intervalo de numeros aleatorios que queremos ver

        do
        {
            num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un número: "));

            if (aleatorio > num)
            {
                JOptionPane.showMessageDialog(null, num + " Digite un número mayor");
                System.out.println(num + " Digite un número mayor");
            }
            else
            {
                JOptionPane.showMessageDialog(null, num + " Digite un número menor");
                System.out.println(num + " Digite un número menor");
            }

            contador++; //Aumenta en uno el contador
        }
        while (num != aleatorio); //Cuando el número sea igual a aleatorio se termina el bucle

        JOptionPane.showMessageDialog(null, "Adivinaste el número en : " + contador + " intentos!!");
        System.out.println("\n¡¡Adivinaste el número en " + contador + " intentos!!");

        System.out.println();
    }
}
