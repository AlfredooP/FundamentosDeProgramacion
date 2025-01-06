/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fd_2022_11_11_divmod;

import java.util.Scanner;

/**
 *
 * @author aa514
 */
public class FD_2022_11_11_DivMod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dividendo, divisor, cociente, residuo;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Dividendo: ");
        dividendo = teclado.nextInt();
        System.out.print("Divisor: ");
        divisor = teclado.nextInt();
        
        if(divisor <= 0)
            System.out.println("No es posible calcular DIV y MOD");
        else
        {
            cociente = 0;
            residuo = dividendo;
            
            while(residuo >= divisor)
            {
                residuo = residuo - divisor;
                cociente++;
            }
            
            System.out.println(dividendo + " DIV " + divisor + " = " + cociente);
            System.out.println(dividendo + " MOD " + divisor + " = " + residuo);
        }
    }
    
}
