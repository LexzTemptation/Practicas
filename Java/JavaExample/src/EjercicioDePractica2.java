
import java.util.Scanner;

public class EjercicioDePractica2
{
    public static void main(String[] args)
    {
        System.out.println();
        Scanner feli = new Scanner(System.in);

        double volumen, lado;

        System.out.print("Ingrese la medida de uno de los lados del cubo: ");
        lado = feli.nextFloat();

        volumen = Math.pow(lado, 3);

        System.out.print("El volumen es: " + volumen);

        feli.close();
        System.out.println();
    }
}
