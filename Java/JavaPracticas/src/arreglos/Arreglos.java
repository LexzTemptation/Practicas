/* 
   ¿Qué es un arreglo? 

    Un array (arreglo) en Java es una estructura de datos que nos 
    permite almacenar un conjunto de datos de un mismo tipo. 
    El tamaño de los arrays se declara en un primer momento y no 
    puede cambiar luego durante la ejecución del programa.

   Arrays Unidimensionales

    La sintaxis para declarar e inicializar un array será:
    Tipo_de_variable[] Nombre_del_array = new Tipo_de_variable[dimensión];

   Ejemplos:

   - int[ ] edad = new int[4]; 
   - long[] edad = new long[4]; 
   - float[ ] estatura = new float[3]; 
   - double[ ] estatura = new double[3]; 
   - boolean[] estado = new boolean[5]; 
   - char[ ] sexo = new char[2]; 
   - String[ ] nombre = new String[2];
*/

package arreglos;

public class Arreglos
{
   public static void main(String[] args) 
   {
      System.out.println();
      // forma 1 de llenado de arreglos
      /* 
      int[ ] numeros = new int[3];

      numeros[0] = 7;
      numeros[1] = 8;
      numeros[2] = 9;

      for(int i = 0; i < 3; i++)
      {
         System.out.println(numeros[i]);
      }
      */

      // forma 2 de llenado de arreglos

      int[] numeros = {5, 7, 9};

      for(int i = 0; i < 3; i++)
      {
         System.out.print(numeros[i] + " ");
      }

      System.out.println("\n");
   }
}
