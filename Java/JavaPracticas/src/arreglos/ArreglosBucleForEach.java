// Bucle for each

package arreglos;

public class ArreglosBucleForEach
{
    public static void main(String[] args)
    {
        System.out.println();

        String[] nombres ={ "Alejandro", "Maria", "Luisa", "Juan", "Narcisa", "Luis", "Robert", "Flor", "Jessica" };

        for (int i = 0; i < nombres.length; i++)  // length regresa los elementos del arreglo.
        {
            System.out.println(nombres[i]);
        }

        System.out.println();

        // For Each. Sintaxis:
        // TipoDeDatoDelArreglo: Se ingresa el tipo de dato, int, String, float, etc.
        // nombreDelElemento: Este puede ser cualquier nombre, pero por tradicion se sigue usando "i" de "iterador"

        /*
        for(TipoDeDatoDelArreglo nombreDelElemento:nombreDelArreglo)
        {
            System.out.println("Nombres: " + nombreDelElemento);
        }
        */
        
        for (String i : nombres)
        {
            System.out.println("Nombres: " + i);
        }

        System.out.println();
    }
}
