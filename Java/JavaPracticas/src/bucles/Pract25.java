/*
    Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (=4) y suspensos.
*/

package bucles;

import javax.swing.JOptionPane;

public class Pract25
{
    public static void main(String[] args)
    { 
        System.out.println();
        
        int numSueldos, sueldoMax = 0;
        float sueldos;

        numSueldos = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número de sueldos: "));

        for(int i = 1; i <= numSueldos; i++) 
        {
            sueldos = Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese el sueldo " + i +" :"));

            if (sueldos > sueldoMax)
            {
                sueldoMax = (int) sueldos;
            }
            // La variable "sueldoMax" es inicializada en cero, por consecuente,
            // no tiene un valor que sea mayor a sueldo.
            // Entonces, cada vuelta del bucle le va a asignar el valor de la variable
            // "sueldos", cada condicional va a comprobar cual es el sueldo de mayor 
            // valor, y le va a asignar el valor ingresado en la variable "sueldos".
        }

        JOptionPane.showMessageDialog(null,"El sueldo maximo es: " + sueldoMax);
        // Para mostrar el sueldo con mayor valor hacemos que imprima el valor de la variable "sueldoMax".

        System.out.println();
    }
}
