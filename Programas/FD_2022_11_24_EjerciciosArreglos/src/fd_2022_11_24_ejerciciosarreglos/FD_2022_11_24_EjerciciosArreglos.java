/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fd_2022_11_24_ejerciciosarreglos;

/**
 *
 * @author aa510
 */
public class FD_2022_11_24_EjerciciosArreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double [] precios = new double[15];
        double costos [] = new double [7];
        
        int [] diasMes = new int[12];
        
        diasMes[0] = 31; //ene
        diasMes[1] = 28; //feb
        diasMes[2] = 31; //mar
        diasMes[3] = 30; //abr
        diasMes[4] = 31; //may
        diasMes[5] = 30; //jun
        diasMes[6] = 31; //jul
        diasMes[7] = 31; //ago
        diasMes[8] = 30; //sep
        diasMes[9] = 31; //oct
        diasMes[10] = 30; //nov
        diasMes[11] = 31; //dic
        
        //              0  1   2  3  4  5  6  7  8  9  10 11
        int [] diasM = {31,28,31,30,31,30,31,31,30,31,30,31};
        
        String [] nomMes = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        
        String [] colores = new String[6];
        
        colores[0] = "Rojo";
        colores[1] = "Azul";
        colores[2] = "Verde";
        colores[3] = "Amarillo";
        colores[4] = "Rosa";
        colores[5] = "Naranja";
        
        int i;
        
        System.out.println();
        for(i=0; i<diasMes.length; i++)
            System.out.println(diasMes[i]);
        
        System.out.println();
        for(i=0; i<nomMes.length; i++)
            System.out.println(nomMes[i]);
        
        System.out.println();
        for(i=0; i<colores.length; i++)
            System.out.println(colores[i]);
        
    }
    
}
