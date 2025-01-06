Funcion fac <- factorial ( n )
	Definir fac Como Real
	Definir i Como Entero
	
	fac <- 1
	Para i<-1 Hasta n Con Paso 1 Hacer
		fac <- fac * i
	Fin Para
Fin Funcion

Funcion pot <- potencia ( base, exponente )
	Definir pot Como Real
	Definir i Como Entero
	
	pot <- 1
	
	Para i<-1 Hasta exponente Con Paso 1 Hacer
		pot <- pot * base
	Fin Para
Fin Funcion

Algoritmo Seno
	Definir p, signo, i Como Entero
	Definir suma, angulo, x, termino Como Real
	
	Escribir "Angulo en grados"
	Leer angulo
	
	x <- angulo * PI / 180
	p <- 1
	signo <- 1
	suma <- 0
	
	Para i<-1 Hasta 15 Con Paso 1 Hacer
		termino <- potencia(x, p) / factorial(p)
		suma <- suma + termino * signo
		
		p <- p + 2
		signo <- signo * (-1)
	Fin Para
	
	Escribir "Seno ", angulo, "° = ", suma
FinAlgoritmo
