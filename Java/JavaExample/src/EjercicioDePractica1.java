import java.util.Scanner;

public class EjercicioDePractica1
{
    public static void main(String[] args)
    {
        System.out.println();
        Scanner feli = new Scanner(System.in);

        int suma, resta, multi, div, op = 0, num1, num2;

        System.out.println("Ingrese el número 1");
        num1 = feli.nextInt();
        System.out.println("Ingrese el número 2");
        num2 = feli.nextInt();

        for (int i = 0; i == op; i++) 
        {
            
        System.out.println("Ingrese la opción a elegir");
        op = feli.nextInt();
        switch (op)
        {
            case 1:
                suma = num1 += num2;
                System.out.println("El resultado es: " + suma);
                break;

            case 2:
                resta = num1 -= num2;
                System.out.println("El resultado es: " + resta);
                break;

            case 3:
                multi = num1 -= num2;
                System.out.println("El resultado es: " + multi);
                break;

            case 4:
                div = num1 -= num2;
                System.out.println("El resultado es: " + div);
            break;

            default:
                System.out.println("Esa opción es invalida");

        }
    }

        feli.close();
        System.out.println();
    }
}
