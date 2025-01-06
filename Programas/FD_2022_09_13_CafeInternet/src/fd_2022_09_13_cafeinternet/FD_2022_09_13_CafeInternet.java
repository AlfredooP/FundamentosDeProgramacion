/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fd_2022_09_13_cafeinternet;

import java.util.Scanner;

/**
 *
 * @author aa510
 */
public class FD_2022_09_13_CafeInternet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int horEnt, minEnt, segEnt, horSal, minSal, segSal, horUti, minUti, segUti,
                totSegundosEnt, totSegundosSal, restoSegundos, segundosUti;
        
        double tarifaHora, pago, tarifaSeg;
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.print("Hora entrada: ");
        horEnt = teclado.nextInt();
        System.out.print("Minutos entrada: ");
        minEnt = teclado.nextInt();
        System.out.print("Segundos entrada: ");
        segEnt = teclado.nextInt();
        
        System.out.print("Hora salida: ");
        horSal = teclado.nextInt();
        System.out.print("Minutos salida: ");
        minSal = teclado.nextInt();
        System.out.print("Segundos salida: ");
        segSal = teclado.nextInt();
        
        System.out.print("Tarifa por hora: ");
        tarifaHora = teclado.nextDouble();
        
        totSegundosEnt = horEnt * 3600 + minEnt * 60 + segEnt;
        totSegundosSal = horSal * 3600 + minSal * 60 + segSal;
        
        segundosUti = totSegundosSal - totSegundosEnt;
        
        //dividimos double / int    = double
        //             int / double = double
        //          double / double = double
        tarifaSeg = tarifaHora / 3600;
        pago = segundosUti * tarifaSeg;
        
        //cuando dividimos int / int el resultado es un int
        horUti = segundosUti / 3600; //DIV
        restoSegundos = segundosUti & 3600; //MOD
        minUti = restoSegundos / 60; //DIV
        segUti = restoSegundos % 60; //MOD
        
        System.out.println(); //linea en blanco
        System.out.println("Tiempo utilizado= " + horUti + "h:"
                                                 + minUti + "m:"
                                                 + segUti + "s   Pago=" + pago);
        
    }
    
}
