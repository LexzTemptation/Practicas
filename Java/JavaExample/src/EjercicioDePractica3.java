import java.util.Scanner;

public class EjercicioDePractica3
{
    public static void main(String[] args)
    {
        System.out.println();
        Scanner feli = new Scanner(System.in);

        float n1, n2, n3, n4, mult;
        double mg;

        System.out.println("");

        System.out.print("Ingrese la cantidad " + 1 + ": ");
        n1 = feli.nextFloat();

        System.out.print("Ingrese la cantidad " + 2 + ": ");
        n2 = feli.nextFloat();

        System.out.print("Ingrese la cantidad " + 3 + ": ");
        n3 = feli.nextFloat();

        System.out.print("Ingrese la cantidad " + 4 + ": ");
        n4 = feli.nextFloat();

        mult = (n1 * n2* n3 * n4);

        System.out.println(mult);

        mg = Math.pow(mult, 1/4);

        System.out.println("La media geometrica es: " + mg);

        feli.close();
    }
}
