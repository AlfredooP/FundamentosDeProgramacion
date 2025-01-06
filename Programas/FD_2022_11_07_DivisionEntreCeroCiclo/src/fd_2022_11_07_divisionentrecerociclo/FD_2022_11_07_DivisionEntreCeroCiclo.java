/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fd_2022_11_07_divisionentrecerociclo;

import java.util.Scanner;

/**
 *
 * @author aa519
 */
public class FD_2022_11_07_DivisionEntreCeroCiclo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        double dividendo, divisor, cociente;
        int veces;
        String mensaje;
        
        System.out.print("Dividendo: ");
        dividendo = teclado.nextDouble();
        
        veces = 0;
        do
        {
            veces ++;
            
            switch(veces)
            {
                case 1: mensaje = "Divisor"; break;
                case 2: mensaje = "No debe ser cero"; break;
                case 3: mensaje = "Fíjate bien"; break;
                case 4: mensaje = "¿Sabes leer?"; break;
                case 5: mensaje = "¿Es en serio?"; break;
                case 6: mensaje = "¿De que se trata?"; break;
                default: mensaje = "A ver quien se cansa primero";
            }
            
            System.out.print(mensaje + ": ");
            divisor = teclado.nextDouble();
        }
        while(divisor == 0);
        
        cociente = dividendo / divisor;
        
        System.out.print(dividendo + " / " + divisor + " = " + cociente);
    }
    
}
