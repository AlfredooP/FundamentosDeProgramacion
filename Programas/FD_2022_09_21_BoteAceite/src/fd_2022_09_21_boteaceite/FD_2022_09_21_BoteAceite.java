/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fd_2022_09_21_boteaceite;

import java.util.Scanner;

/**
 *
 * @author aa514
 */
public class FD_2022_09_21_BoteAceite {

    /**
     * @param args the command line arguments
     */
    
    //Aqui podemos definir funciones
    public static void main(String[] args) {
        // TODO code application logic here
        double radioBote, alturaBote, radioCil1, radioCil2, radioCil3,
                altCil1, altCil2, altCil3, volCil1, volCil2, volCil3,
                volAceite, volBote;
     
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Radio del bote: ");
        radioBote = teclado.nextDouble();
        System.out.print("Altura del bote: ");
        alturaBote = teclado.nextDouble();
        
        System.out.print("Radio del primer cilindro: ");
        radioCil1= teclado.nextDouble();
        System.out.print("Altura del primer cilindro: ");
        altCil1= teclado.nextDouble();
        System.out.print("Radio del segundo cilindro: ");
        radioCil2= teclado.nextDouble();
        System.out.print("Altura del segundo cilindro: ");
        altCil2= teclado.nextDouble();
        System.out.print("Radio del tercer cilindro: ");
        radioCil3= teclado.nextDouble();
        System.out.print("Altura del tercer cilindro: ");
        altCil3= teclado.nextDouble();
        
        //Llamamos a la función 
        volBote = volumenCilindro(radioBote, alturaBote);
        volCil1 = volumenCilindro(radioCil1, altCil1);
        volCil2 = volumenCilindro(radioCil2, altCil2);
        volCil3 = volumenCilindro(radioCil3, altCil3);
        
        volAceite = volBote - (volCil1 + volCil2 + volCil3);
        System.out.print("Volumen de aceite que quedó: " + volAceite);
        
    }//Fin main
    
    //Definimos la función
    public static double volumenCilindro(double radio, double altura) {
        
        double volumen;
        volumen = Math.PI * Math.pow(radio, 2) * altura;
        return volumen;
    }
    
}//Fin proyecto
