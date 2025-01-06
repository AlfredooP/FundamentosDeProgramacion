/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fd_2022_11_30_aplicacionalumnosexamen;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author aa509
 */
public class FD_2022_11_30_AplicacionAlumnosExamen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner (System.in);
        Random azar = new Random();
        
        int examenes, alumnos, r, c;
        
        System.out.print("Número de exámenes: ");
        examenes = teclado.nextInt();
        
        System.out.print("Número de alumnos: ");
        alumnos = teclado.nextInt();
        
        //creamos el arreglo bidimensional (matriz)
        int [][] calificaciones = new int [examenes][alumnos];
        
        //pedimos al usuario todas las calificaciones
        for(r=0; r<examenes; r++) //este ciclo recorre cada renglón de la matriz
            for(c=0; c<alumnos; c++) //este ciclo recorre las columnas del renglon r
            {
                //System.out.print("Calificación exámen " + (r+1) + " Alumno " + (c+1) + ": ");
                //calificaciones[r][c] = teclado.nextInt();
                calificaciones[r][c] = 10 + azar.nextInt(90);
            }
        
        //mostramos los elementos de la matriz
        System.out.println();
        for(r=0; r<calificaciones.length; r++)
        {
            for(c=0; c<calificaciones[0].length; c++)
                System.out.print(calificaciones[r][c] + "  ");
            
            System.out.println();
        }
        
        //calculamos suma y promedio
        int suma = 0;
        
        for(r=0; r<calificaciones.length; r++)
            for(c=0; c<calificaciones[0].length; c++)
                suma += calificaciones[r][c];
        
        //double promedio = suma / (examenes * alumnos);
        double promedio = suma / (calificaciones.length * calificaciones[0].length);
        
        System.out.println();
        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + promedio);
        System.out.println("La primer calificacion es " + calificaciones[0][0]);
        //System.out.println("La ultima calificacion es " + calificaciones[examenes-1][alumnos-1]);
        System.out.println("La ultima calificacion es " + calificaciones[calificaciones.length-1][calificaciones[0].length-1]);
    }
    
}
