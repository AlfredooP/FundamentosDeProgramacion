/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fd_2022_10_27_ciclopara;

import java.util.Scanner;

/**
 *
 * @author aa514
 */
public class FD_2022_10_27_CicloPara {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i, n;
        String letrero;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Letrero a mostrar: ");
        letrero = teclado.nextLine();
        
        System.out.print("¿Cuantas veces?: ");
        n = teclado.nextInt();
        
        for(i=1; i<=n; i=i+1)
            System.out.println("i = " + i + " " + letrero);
        
        System.out.println("i = " + i + " " + letrero + " (Fuera del ciclo)");
    }
    
}
