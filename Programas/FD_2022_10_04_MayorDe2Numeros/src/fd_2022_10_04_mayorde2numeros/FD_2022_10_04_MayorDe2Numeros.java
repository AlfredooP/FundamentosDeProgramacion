/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fd_2022_10_04_mayorde2numeros;

import java.util.Scanner;

/**
 *
 * @author aa511
 */
public class FD_2022_10_04_MayorDe2Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double numero1, numero2;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Primer número: ");
        numero1 = teclado.nextDouble();
        
        System.out.print("Segundo número: ");
        numero2 = teclado.nextDouble();
        
        if(numero1 > numero2)
        {
            //Parte verdadera
            System.out.println("El mayor es el número: " + numero1);
        }
        else
        {
            //Parte falsa
            System.out.println("El mayor es el número: " + numero2);
        }
    }
    
}
