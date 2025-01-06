/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fd_2022_09_14_ecuacioncuadratica;

import java.util.Scanner;

/**
 *
 * @author aa508
 */
public class FD_2022_09_14_EcuacionCuadratica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a, b, c, x1, x2;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Coeficiente del término cuadrático (a): ");
        a = teclado.nextDouble();
        
        System.out.print("Coeficiente del término de primer grado (b): ");
        b = teclado.nextDouble();
        
        System.out.print("Término independiente (c): ");
        c = teclado.nextDouble();
        
        x1 = (-b + Math.sqrt(Math.pow(b,2) - 4*a*c)) / (2*a);
        x2 = (-b - Math.sqrt(Math.pow(b,2) - 4*a*c)) / (2*a);
        
        System.out.println("\nX1 = " + x1);
        System.out.println("X2 = " + x2);
    }
    
}
