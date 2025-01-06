/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fd_2022_11_08_calculadorabasica;

/**
 *
 * @author aa514
 */
public class Mate {
    public static double potencia(double base, int exponente)
    {
        double pot;
        
        pot = 1;
        for(int i = 1; i <= exponente; i++)
            pot = pot * base;
        
        return pot;
    }
    
    public static int factorial(int n)
    {
        int fac = 1;
        
        for(int i = 1; i <= n; i++)
        {
            fac = fac * i;
        }
        
        return fac;  
    }
    
    public static int div(int dividendo, int divisor)
    {
        if(divisor <= 0)
            return 0;
        
        int cociente = 0;
        int residuo = dividendo;
            
        while(residuo >= divisor)
        {
            residuo = residuo - divisor;
            cociente++;
        }
        
        return cociente;
    }
    
    public static int mod(int dividendo, int divisor)
    {
        if(divisor <= 0)
            return 0;
        
        
        int residuo = dividendo;
            
        while(residuo >= divisor)
            residuo = residuo - divisor;
        
        return residuo;
    }
    
    public static double absoluto(double n)
    {
        if (n >= 0)
            return n;
        else
            return n*-1;
    }
    
    public static double raiz(double n)
    {
        if(n < 0)
            return 0;
        
        double a, b, prom;
        
        a = n;
        b = 1;
        
        //precision de ocho decimales
        while(absoluto(a-b) > 0.000000001)
        {
            prom = (a + b) / 2;
            a = prom;
            b = n / a;
        }
            
        return a;
    }
   
    public static double permutaciones(int n, int r)
    {
        return factorial(n) / factorial(n-r);
    }
    
    public static double combinaciones(int n, int r)
    {
        return factorial(n) / (factorial(n-r) * factorial(r));
    }
    
    public static double sen(double angulo)
    {
        int p, signo, i;
        double suma, x, termino;
        
        x = angulo * Math.PI / 180;
        
        p = 1;
        signo = 1;
        suma = 0;
        
        for(i=1; i <= 15; i++)
        {
            termino = potencia(x,p) / factorial(p);
            suma = suma + termino * signo;
            
            p = p + 2;
            signo = signo * (-1);
        }
        return suma;
    }
    
    public static double cos(double angulo)
    {
        return raiz(1- potencia(sen(angulo), 2));
    }
    
    public static double tan(double angulo)
    {
        return sen(angulo) / cos(angulo);
    }
}


  
