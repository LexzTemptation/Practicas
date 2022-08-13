package bucles;

import javax.swing.JOptionPane;

public class Pract22Nota
{
    public static void main(String[] args)
    { 
        System.out.println();

        int edad, sumaEdad = 0, contMayores18 = 0, contAltMay175 = 0;
        float altura, sumaAltura = 0, medieaEdad, mediaAltura;

        for(int i = 1; i <= 5; i++)
        {
            edad = Integer.parseInt(JOptionPane.showInputDialog("Alumno " + i + " \nIngrese su edad: "));
            altura = Float.parseFloat(JOptionPane.showInputDialog("Alumno " + i + " \nIngrese su altura: "));

            sumaEdad += edad;
            sumaAltura += altura;

            if( edad >= 18)
            {
                contMayores18++;
            }

            if( altura >= 1.75)
            {
                contAltMay175++;
            }
        }

        medieaEdad = (float) sumaEdad / 5;
        mediaAltura = (float) sumaAltura / 5;

        JOptionPane.showMessageDialog(null,"La edad promedio es de: " + medieaEdad + 
                                        "\n La estatura promedio es de: " + mediaAltura +
                                        "\n La cantidad de alumnos mayores a 18 años es: " + contMayores18 +
                                        "\n La cantidad de alumnos que miden más de 1.75 de altura es: " + contAltMay175);
        
        System.out.println("La edad promedio es de: " + medieaEdad + 
                        "\n La estatura promedio es de: " + mediaAltura +
                        "\n La cantidad de alumnos mayores a 18 años es: " + contMayores18 +
                        "\n La cantidad de alumnos que miden más de 1.75 de altura es: " + contAltMay175);

        System.out.println();
    }
}
