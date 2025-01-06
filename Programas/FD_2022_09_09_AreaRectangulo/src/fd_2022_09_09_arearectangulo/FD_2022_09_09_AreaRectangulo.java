/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fd_2022_09_09_arearectangulo;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author aa507
 */
public class FD_2022_09_09_AreaRectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        //declaracion de variables 
        double base, altura, area, perimetro;
        
        //datos de entrada
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Base del rectángulo: ");
        base = teclado.nextDouble();
        System.out.print("Altura: ");
        altura = teclado.nextDouble();
        
        //proceso
        area = base * altura;
        perimetro = 2 * (base + altura);
        
        //salida de datos
        System.out.println("Área = " + area);
        System.out.println("Perímetro = " + perimetro);
    }
    
}
