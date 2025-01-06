Algoritmo PotenciaEntera
	Definir exponente, i Como Entero
	Definir base, pot Como Real
	
	Escribir "Base"
	Leer base
	Escribir "Exponente"
	Leer exponente
	
	pot <- 1
	Para i<-1 Hasta exponente Con Paso 1 Hacer
		pot <- pot * base
	Fin Para
	
	Escribir base, " a la potencia ", exponente, " = ", pot
FinAlgoritmo
