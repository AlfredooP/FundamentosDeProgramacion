/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fd_2022_11_28_operacionesarreglo;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author aa514
 */
public class FD_2022_11_28_OperacionesArreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner (System.in);
        Random azar = new Random();
        
        int n, i, opcion, posicion;
        double suma, promedio, mayor, menor, valorBuscado;
        boolean encontro;
        
        System.out.print("¿Cuántos elementos?: ");
        n = teclado.nextInt();
        
        //Creamos el arreglo
        double [] datos = new double[n];
        
        //Generamos de manera aleatoria los valores de los elementos
        //Length es una propiedad que indica el número de elementos de un arreglo
        //for(i=0; i<n; i++)
          //  datos[i] = azar.nextInt(1000) / 10.0;
        
        do
        {
            System.out.println("0- Salida");
            System.out.println("1- Suma y promedio");
            System.out.println("2- Mayor y su posición");
            System.out.println("3- Menor y su posición");
            System.out.println("4- Buscar elemento y su posición");
            System.out.println("5- Mostrar elementos");
            System.out.println("6- Mostrar en orden inverso");
            System.out.println("7- Ordenar elementos");
            System.out.println("8- Generar datos");
            
            System.out.print("");
            System.out.print("Seleccione opción: ");
            opcion = teclado.nextInt();
            
            switch(opcion)
            {
                case 1: //suma y promedio
                    suma = 0;
                    for(i=0; i<datos.length; i++)
                        suma += datos[i];
                    
                    promedio = suma / datos.length;
                    
                    System.out.println("Suma = " + suma);
                    System.out.println("Promedio = " + promedio);
                    break;
                    
                case 2: //mayor
                    mayor = datos[0];
                    posicion = 0;
                    
                    for(i=1; i<datos.length; i++)
                        if (datos[i] > mayor)
                        {
                            mayor = datos[i];
                            posicion = i;
                        }
                    
                    System.out.println("El mayor es el " + mayor);
                    System.out.println("Y está en la posición " + posicion);
                    break;
                    
                case 3: //menor
                    menor = datos[0];
                    posicion = 0;
                    
                    for(i=1; i<datos.length; i++)
                        if (datos[i] < menor)
                        {
                            menor = datos[i];
                            posicion = i;
                        }
                    
                    System.out.println("El menor es el " + menor);
                    System.out.println("Y está en la posición " + posicion);
                    break;
                    
                case 4: //buscar elemento
                    System.out.print("Valor a buscar: ");
                    valorBuscado = teclado.nextDouble();
                    
                    encontro = false;
                    i = 0;
                    
                    while(!encontro && i < datos.length)
                        if(datos [i] == valorBuscado)
                            encontro = true;
                        else
                            i++;
                    
                    if(encontro)
                        System.out.println("Está en la posición " + i);
                    else
                        System.out.println("Ese valor no está en el arreglo");
                    
                    break;
                    
                case 5: //mostrar elementos
                    for(i=0; i<datos.length; i++)
                        System.out.println("Datos[" + i + "] = " + datos[i]);
                    break;
                    
                case 6: //mostrar en orden inverso
                    for(i=datos.length-1; i>=0; i--)
                        System.out.println("Datos[" + i + "] = " + datos[i]);
                    break;
                    
                case 7: //ordenar
                    Arrays.sort(datos);
                        System.out.println("Arreglo ordenado de forma ascendente");
                    break;
                    
                case 8: //Generar otros datos
                    for(i=0; i<n; i++)
                        datos[i] = azar.nextInt(1000) / 10.0;
                    
                    System.out.println("Datos generados ...");
                    break;
            }
            
            System.out.print("ENTER para continuar");
            System.in.read();
        }
        while(opcion != 0);
    }
    
}
