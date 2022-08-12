package bucles;

import javax.swing.JOptionPane;

public class Pract21
{
        public static void main(String[] args)
    { 
        System.out.println();
        
        int sueldo = 0, suma = 0, sueldosMayoresAMil = 0;

        for(int i = 1; i <= 10; i++)
        {
            sueldo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el sueldo " + i));

            System.out.println(suma += sueldo);

            if (sueldo > 1000)
            {
                sueldosMayoresAMil++; /* Esto es necesario, ya que se necesita un 
                                        contador para saber lo que pide el programa con esa condición */
            }
        }



        JOptionPane.showMessageDialog(null,"Hay " + sueldosMayoresAMil + " sueldos mayores a mil."
                                                            +"\nLa suma total de los sueldos es: " + suma);

        System.out.println("Hay " + sueldosMayoresAMil + " sueldos mayores a mil."
        +"\nLa suma total de los sueldos es: " + suma);

        System.out.println();
    }
}
