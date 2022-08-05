package javapracticas;

import java.util.Scanner;

public class Anotas_de_java
{
    public static void main(String[] args)
    {
        System.out.println();
        /*
          // Constantes
          las constantes se declaran de esta forma:
          final int numero = 10;
         */

          //Operadores aritmeticos
        /*
          Scanner feli = new Scanner(System.in);
          float num1, num2, suma, resta, multi, div, resto;
          System.out.println("Teclee dos números: ");
          num1 = feli.nextFloat();
          num2 = feli.nextFloat();
          suma = num1 + num2;
          resta = num1 - num2;
          multi = num1  num2;
          div = num1 / num2;
          resto = num1 % num2; // El mod o simbolo de porcentaje nos da el residuo de
          una división
          System.out.println("La suma es: " + suma);
          System.out.println("La resta es: " + resta);
          System.out.println("La multiplicación es: " + multi);
          System.out.println("La division es: " + div);
          System.out.println("La resto es: " + resto);
         */

        // Operadores aritmeticos combinados con asignación
        /*
          float numero = 10;
          // Esto hace una adición a la variable "numero" y nos da el resultado a 15, y
          // todo esto es para cualquier operador aritmetico
          numero += 5; // numero = numero + 5;
          System.out.println("" + numero);
         */

        /*
          // Operadores de incremento y decremento
          int x = 5, y;
          // Cuando se usan dos signos de incremento se va a aumentar un numero a la
          variable
          // x++;
          // pero solo si tiene asignado un valor.
          // Lo mismo sucederá si tiene signos de decremento "x--;"
          //En "y" le está asignado el valor original de "x", pero cuando
          //pasa a operar con "x", le está haciendo el aumento que le pedimos con "x++"
          //y = x++;
          //Si se quiere que la operación de incremento salga en en "y" se tiene que
          hacer lo siguiente:
          y = ++x;
          //A este tipo de acomodo se le conoce como prefijo "y = ++x" y subfijo
          "y = x++"
          System.out.println(y);
          System.out.println(x);
         */

        /*
            //Clase Math
            //Raíz cuadrada
            //Si queremos usar "sqrt" indica que el valor que le debemos de dar debe ser
            //del tipo double, a pesar de que se esta ingresando un valor entero la
            //sintaxis lo está tomando como double
            double raiz = Math.sqrt(9);
            //Si se le quiere obligar a la variable a ser entero se castea la variable
            //int raiz = (int)Math.sqrt(9);
            //System.out.println(raiz);
            //*Elevación de un número a una cierta potencia
            double base = 5, exponente = 2;
            //Con "pow" hacemos la elevación de una potencia (exponente)
            double resultado = Math.pow(base, exponente);
            System.out.println(resultado);
         
            //Redondeo de un número
            //Para usar round, el lenguaje pide que que la operación se declare
            //de tipo "long" si la variable es de tipo "double"
            double num = 4.56;
            //long resultado = Math.round(num);
            //Pero si es float
            //float num = 4.56f;
            //pide que la operación sea de tipo int
            //int resultado = Math.round(num)
            System.out.println(resultado);
            
            // Número aleatorio
            //double num = Math.random();
            System.out.println(num);
            
        */

        Scanner feli = new Scanner(System.in);

        int salario = 1000, comision, numAutosVen;
        double totalVenta, total;

        System.out.println("Ingrese el numero de autos vendidos en el mes por el vendedor");
        numAutosVen = feli.nextInt();

        System.out.println("Ingrese el total de las ventas por el vendedor");
        totalVenta = feli.nextFloat();

        comision = numAutosVen*150;
        totalVenta = (numAutosVen * 0.5);
        total = salario + comision + totalVenta;

        System.out.println("El total del salario del vendedor es de: " + total);


        feli.close();
        System.out.println();
    }

}
