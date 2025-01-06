/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fd_2022_09_22_promedioestatura;

import java.util.Scanner;

/**
 *
 * @author aa517
 */
public class FD_2022_09_22_PromedioEstatura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int pies1,pulg1, pies2, pulg2, pies3, pulg3;
        double promedioCm, estaturaCm1, estaturaCm2,estaturaCm3;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Estatura de la primera persona");
        System.out.print("Pies: ");
        pies1= teclado.nextInt();
        System.out.print("Pulgadas: ");
        pulg1= teclado.nextInt();
        
        System.out.print("Estatura de la segunda persona");
        System.out.print("Pies: ");
        pies2= teclado.nextInt();
        System.out.print("Pulgadas: ");
        pulg2= teclado.nextInt();
        
        System.out.print("Estatura de la tercera persona");
        System.out.print("Pies: ");
        pies3= teclado.nextInt();
        System.out.print("Pulgadas: ");
        pulg3= teclado.nextInt();
        
        estaturaCm1 = PiesPulgACms(pies1, pulg1);
        estaturaCm2 = PiesPulgACms(pies2, pulg2);
        estaturaCm3 = PiesPulgACms(pies3, pulg3);
        
        promedioCm = (estaturaCm1 + estaturaCm2 + estaturaCm3) / 3;
        
        System.out.print("El promedio de estatura es: " + promedioCm);
    }
    
    //Definimos la funcion
    public static double PiesPulgACms(int pies, int pulgadas){
        
        double centimetros;
        centimetros = pies*30.48 + pulgadas*2.54;
        return centimetros;
    }
    
}
