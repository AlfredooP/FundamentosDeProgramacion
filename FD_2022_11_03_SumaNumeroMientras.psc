Algoritmo FD_2022_11_03_SumaNumerosMientras
	Definir n Como Entero
	Definir val, suma, promedio Como Real
	
	suma <- 0
	n <- 0
	
	Escribir "Primer Valor (0 para terminar)"
	Leer val
	
	Mientras val > 0 Hacer
		n <- n + 1
		suma <- suma + val
		
		Escribir "Valor ", n + 1, " (0 para terminar)"
		Leer val
	Fin Mientras
	
	Si n = 0 Entonces
		promedio <- 0
	SiNo
		promedio <- suma / n
	Fin Si
	
	Escribir "Suma = ", suma
	Escribir "Promedio = ", promedio
	
FinAlgoritmo
