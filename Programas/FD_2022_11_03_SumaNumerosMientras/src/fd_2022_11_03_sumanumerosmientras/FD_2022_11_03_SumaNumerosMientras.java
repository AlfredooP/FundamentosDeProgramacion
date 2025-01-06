/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fd_2022_11_03_sumanumerosmientras;

import java.util.Scanner;

/**
 *
 * @author aa512
 */
public class FD_2022_11_03_SumaNumerosMientras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        double valor, suma, promedio;
        
        Scanner teclado = new Scanner(System.in);
        
        suma = 0;
        n = 0;
        
        System.out.print("Primer valor (0 para terminar): ");
        valor = teclado.nextDouble();
        
        while(valor > 0)
        {
            n++;
            suma = suma + valor;
            
            System.out.print("Valor " + (n+1) + " (0 para terminar): ");
            valor = teclado.nextDouble();
        }//while
        
        if(n == 0)
            promedio = 0;
        else
            promedio = suma / n;
        
        System.out.println("Suma = " + suma);
        System.out.println("Promedio = " + promedio);
    }
    
}
