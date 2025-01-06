/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fd_2022_10_17_promocionesfera;

import java.util.Scanner;

/**
 *
 * @author aa510
 */
public class FD_2022_10_17_PromocionEsfera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int NumeroCuenta, PorcDescuento;
        double ImporteCompra, ImporteDescuento, Pago;
        String ColorEsfera;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Importe de la compra: ");
        ImporteCompra = teclado.nextDouble();
        System.out.print("Número de Cuenta: ");
        NumeroCuenta = teclado.nextInt();
        
        System.out.print("Color de esfera (B = Blanco, N = Negro):  ");
        ColorEsfera = teclado.next();//Pide una cadena de una sola palabra
        
        //Dos cadenas NO pueden compararse con los operadores >, <, >=, <=
        //Con las cadenas, los operadores == y != NO COMPRARAN DATOS, sino direcciones
        //Para comparar si dos cadenas son iguales o diferentes, se usa la función equals()
        if(ColorEsfera.equals("B") && NumeroCuenta % 2 == 0 ||
           ColorEsfera.equals("N") && NumeroCuenta % 2 == 1)
        {
            System.out.print("Porcentaje de Descuento: ");
            PorcDescuento = teclado.nextInt();
            ImporteDescuento = ImporteCompra * PorcDescuento / 100;
            Pago = ImporteCompra - ImporteDescuento;
            System.out.println("Felicidades! Usted sólo pagará $" + Pago);
        }
        else
            System.out.println("Siga participando! Su pago es de $" + ImporteCompra);
    }
    
}
