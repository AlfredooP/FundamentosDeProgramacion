/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fd_2022_11_08_calculadorabasica;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author aa511
 */
public class FD_2022_11_08_CalculadoraBasica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        double valor1, valor2, resultado;
        int entero1, entero2;
        int operacion;
        
        Scanner teclado = new Scanner(System.in);
        
        do
        {
            System.out.println("0- Salida");
            System.out.println("1- Suma");
            System.out.println("2- Resta");
            System.out.println("3- Multiplicación");
            System.out.println("4- División");
            System.out.println("5- Potencia entera");
            System.out.println("6- Factorial");
            System.out.println("7- DIV");
            System.out.println("8- MOD");
            System.out.println("9- Raíz Cuadrada");
            System.out.println("10- Valor Absoluto");
            System.out.println("11- Permutaciones");
            System.out.println("12- Combinaciones");
            System.out.println("13- Seno");
            System.out.println("14- Coseno");
            System.out.println("15- Tangente");
            
            System.out.println("");
            System.out.print("Seleccione opción: ");
            operacion = teclado.nextInt();
            
            switch(operacion)
            {
                case 0: //salida
                    System.out.println("Gracias por usar nuestra super calculadora");
                    break;
                    
                case 1: //suma
                    valor1 = leerReal("Primer sumando");
                    valor2 = leerReal("Segundo sumando");
                    
                    resultado = valor1 + valor2;
                    System.out.println(valor1 + " + " + valor2 + " = " + resultado);
                    break;
                    
                case 2: //resta
                    valor1 = leerReal("Minuendo");
                    valor2 = leerReal("Sustraendo");
                    
                    resultado = valor1 - valor2;
                    System.out.println(valor1 + " - " + valor2 + " = " + resultado);
                    break;
                    
                case 3: //multiplicación
                    valor1 = leerReal("Primer factor");
                    valor2 = leerReal("Segundo factor");
                    
                    resultado = valor1 * valor2;
                    System.out.println(valor1 + " x " + valor2 + " = " + resultado);
                    break;
                    
                case 4: //división
                    valor1 = leerReal("Dividendo");
                    
                    do
                    {
                        valor2 = leerReal("Divisor");
                    }
                    while (valor2 == 0);
                    
                    resultado = valor1 / valor2;
                    System.out.println(valor1 + " / " + valor2 + " = " + resultado);
                    break;
                    
                case 5: //potencia entera
                    valor1 = leerReal("Base");
                    
                    do
                    {
                    entero1 = leerEntero("Exponente");    
                    }
                    while(entero1 < 0);
                    
                    System.out.println(valor1 + " a la potencia " + entero1 + " = " + Mate.potencia(valor1, entero1));
                    break;
                    
                case 6: //factorial
                    entero1 = leerEntero("Factor");
                    
                    System.out.println(entero1 + "! = " + Mate.factorial(entero1));
                    break;
                    
                case 7: //div
                    entero1 = leerEntero("Dividendo");
                    entero2 = leerEntero("Divisor");
                    
                    System.out.println(entero1 + " DIV " + entero2 + " = " + Mate.div(entero1, entero2));
                    break;
                    
                case 8: //mod
                    entero1 = leerEntero("Dividendo");
                    entero2 = leerEntero("Divisor");
                    
                    System.out.println(entero1 + " MOD " + entero2 + " = " + Mate.mod(entero1, entero2));
                    break;
                    
                case 9: //raiz cuadrada
                    valor1 = leerReal("Número");
                    
                    System.out.println("Raiz cuadrada de " + valor1 + " = " + Mate.raiz(valor1));
                    break;
                    
                case 10: //valor absoluto
                    valor1 = leerReal("Número");
                    
                    System.out.println("|" + valor1 + "| = " + Mate.absoluto(valor1));
                    break;
                    
                case 11: //permutaciones
                    entero1 = leerEntero("Valor de n");
                    entero2 = leerEntero("Valor de r");
                    
                    System.out.println(entero1 + " P " + entero2 + " = " + Mate.permutaciones(entero1, entero2));
                    break;
                    
                case 12: //combinaciones
                    entero1 = leerEntero("Valor de n");
                    entero2 = leerEntero("Valor de r");
                    
                    System.out.println(entero1 + " C " + entero2 + " = " + Mate.combinaciones(entero1, entero2));
                    break;
                    
                case 13: //seno
                    valor1 = leerReal("Ángulo en grados");
                    
                    System.out.println("Seno " + valor1 + "° = " + Mate.sen(valor1));
                    break;
                    
                case 14: //coseno
                    valor1 = leerReal("Ángulo en grados");
                    
                    System.out.println("Coseno " + valor1 + "° = " + Mate.cos(valor1));
                    break;
                    
                case 15: //tangente
                    valor1 = leerReal("Ángulo en grados");
                    
                    System.out.println("Tangente " + valor1 + "° = " + Mate.tan(valor1));
                    break;
                    
                default:
                    System.out.println("Opción no válida");
            }//switch
            
            System.out.print("Presione ENTER para continuar ... ");
            System.in.read();
                    
            
        }
        while(operacion != 0);
    }//main
    
    //mis funciones
    public static double leerReal(String mensaje)
    {
        Scanner lectura = new Scanner(System.in);
        double dato;
        
        System.out.print(mensaje + ": ");
        dato = lectura.nextDouble();
        
        return dato;
      
    }
    
    public static int leerEntero(String mensaje)
    {
        Scanner lectura = new Scanner(System.in);
        
        int dato;
        
        System.out.print(mensaje + ": ");
        dato = lectura.nextInt();
        
        return dato;  
        
    }
    
}//clase
