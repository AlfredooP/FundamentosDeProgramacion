/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fd_2022_10_31_sumannumeros;

import java.util.Scanner;

/**
 *
 * @author aa512
 */
public class FD_2022_10_31_SumaNNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        double valor, suma, promedio;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("¿Cuántos números?");
        n = teclado.nextInt();
        
        suma = 0;
        
        for(int i=1; i<= n; i++)
        {
            System.out.print("Valor " + i + ": ");
            valor = teclado.nextDouble();
            suma = suma + valor;
        }
        
        if(n==0)
            promedio = 0;
        else
            promedio = suma / n;
        
        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + promedio);
    }
    
}
