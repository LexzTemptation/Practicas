package bucles;

import java.util.Scanner;

public class CicloFor 
{
    public static void main(String[] args)
    { 
        System.out.println();
        Scanner feli = new Scanner(System.in);

        /*for
        
        -inicialización: Siempre se inicializa la variable dentro de el ciclo
        a esta inicialización se le llama "iterador" (Los iteradores son un 
        tipo de punteros a ciertas estructuras de datos (contenedores). 
        Ciertos contenedores ofrecen la capacidad de crecer a medida que se 
        van insertando nuevos elementos.)

        -condición: La condición es como en los operadores condicionales.
        Por decir : "Este bucle se va a ejecutar hasta que i sea menor que 20 (i < 20)

        aumento o decremento: Le decimos al iterador que primero se muesta y luego se
        aumenta o decrementa (i++)

        for (inicialización ; condición ; aumento o decremento)
        {
            instrucciones;
        }
        */

        for (int i = 1; i <= 10; i++)
        {
            System.out.println(i);
        }

        System.out.println();

        for (int i2 = 10; i2 >= 1; i2--)
        {
            System.out.println(i2);
        }

        System.out.println();

        int contador;

        System.out.print("Digite la cantidad de terminos: ");
        contador = feli.nextInt();

        System.out.println();

        for (int i3 = 1; i3 <= contador ; i3++)
        {
            System.out.println(i3);
        }

        feli.close();
        System.out.println();
    }
}
