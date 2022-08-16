/*
    Una empresa que se dedica a la venta de desinfectantes
    necesita un programa para gestionar las facturas. 
    En cada factura figura: el código del artículo, la cantidad vendida 
    en litros y el precio por litro. 
    Se pide de 5 facturas introducidas: Facturación total, cantidad 
    en litros vendidos del artículo 1 y cuantas facturas se emitieron de más de $600. 
 */

package bucles;

import javax.swing.JOptionPane;

public class Pract24
{
    public static void main(String[] args)
    { 
        System.out.println();
        
        int codigo, litros, litrosArticulo1 = 0, conteoMas600 = 0, op;
        float /*precioLitro,*/ facturacionTotal = 0;
        double importeFactura;

        for (int i = 1; i < 5; i++)
        {
            codigo = Integer.parseInt(JOptionPane.showInputDialog(null, "Articulo N°" + i + "\nDigite el codigo"));
            litros = Integer.parseInt(JOptionPane.showInputDialog(null, "Articulo N°" + i + "\nDigite la cantidad en litros"));
            //precioLitro = Integer.parseInt(JOptionPane.showInputDialog(null, "Articulo N°" + i + "\nDigite el precio por litros"));
            op = Integer.parseInt(JOptionPane.showInputDialog(null, "Articulo N°"+i+"\nDigite la opción del precio del litro "+
                                                                "\n1.- $0,6"+
                                                                "\n2.- $3"+
                                                                "\n3.- €1.25"));

            /*
            importeFactura = (float) litros * precioLitro;
            facturacionTotal +=importeFactura;

            if(codigo == 1)
            {
                litrosArticulo1 += litros;
            }

            if(importeFactura > 600)
            {
                conteoMas600++;
            }
            */

            switch (op) 
            {
                case 1:
                {
                    importeFactura = (float)((float)litros * 0.6);
                    facturacionTotal +=importeFactura;

                    if(codigo == 1)
                    {
                        litrosArticulo1 += litros;
                    }

                    if(importeFactura > 600)
                    {
                        conteoMas600++;
                    }
                }
                break;

                case 2:
                {
                    importeFactura = (float)((float)litros * 3);
                    facturacionTotal +=importeFactura;

                    if(codigo == 1)
                    {
                        litrosArticulo1 += litros;
                    }

                    if(importeFactura > 600)
                    {
                        conteoMas600++;
                    }
                }
                break;

                case 3:
                {
                    importeFactura = (float)((float)litros * 1.27);
                    facturacionTotal +=importeFactura;

                    if(codigo == 1)
                    {
                        litrosArticulo1 += litros;
                    }

                    if(importeFactura > 600)
                    {
                        conteoMas600++;
                    }
                }
                break;

                default:
                {
                    JOptionPane.showMessageDialog(null, "No existe ese producto" + op);
                }
                break;
            }
        }

        System.out.println("Resumen de ventas"+
                           "\nFacturación total: " + facturacionTotal +
                           "\nCantidad en litros vendidos del artículo 1: " + litrosArticulo1 +
                           "\nCantidad de facturas mayores a $600: " + conteoMas600);

        System.out.println();
    }
}

