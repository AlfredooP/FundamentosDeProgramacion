/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package foliocompra;

import java.util.Scanner;

/**
 *
 * @author aa514
 */
public class FolioCompra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int folio, digito1, digito2, digito3, digito4,
            cociente1, cociente2;
        double compra, pago, porcentajeDescuento, importeDescuento;
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.print("Importe de la compra: ");
        compra = teclado.nextDouble();
        
        System.out.print("Folio de compra de 4 dígitos (1000-9999): ");
        folio = teclado.nextInt();
        
        //separación de los dígitos del folio
        cociente1= folio / 10; //DIV
        digito1 = folio % 10; //DIV
        cociente2 = cociente1 / 10; //DIV
        digito2 = cociente1 % 10; //MOD
        digito4 = cociente2 / 10; //DIV
        digito3 = cociente2 % 10; //MOD
        
        porcentajeDescuento = (digito1 + digito2 + digito3 + digito4) / 4;
        importeDescuento = compra * porcentajeDescuento / 100;
        pago = compra - importeDescuento;
        
        System.out.print("Su compra fue de $" + compra + " pero obtuvo un "
                        + porcentajeDescuento + "% de descuento " +
                        "que representa $ " + importeDescuento +
                        " por lo que sólo pagarás $" + pago);
    }
    
}
