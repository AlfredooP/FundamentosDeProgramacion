/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fd_2022_11_29_calificacionjueces;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author aa514
 */
public class FD_2022_11_29_CalificacionJueces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        double [] jueces = new double[9];
        int i;
        
        for(i=0; i<jueces.length; i++)
        {
            System.out.print("Calificación del juez " + (i+1) + " : ");
            jueces[i] = teclado.nextDouble();
        }
        
        Arrays.sort(jueces);
        
        double suma = 0;
        for (i=2; i<=6; i++)
        {
            suma += jueces[i];
        }
            
        double promedio = suma / 5;
        
        System.out.print("Calificación final: " + promedio);
        
    }
    
}
