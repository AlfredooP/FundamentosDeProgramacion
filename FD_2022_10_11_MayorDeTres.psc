Algoritmo FD_2022_10_11_MayorDeTres
	Definir a, b , c Como Real
	
	Escribir "Primer número"
	Leer a
	
	Escribir "Segundo número"
	Leer b
	
	Escribir "Tercer número"
	Leer c
	
	Si a > b Entonces
		//Descartamos b
		Si a > c Entonces
			Escribir "El mayor es ", a
		SiNo
			Escribir "El mayor es ", c
		Fin Si
	SiNo
		//Descartamos a
		Si b > c Entonces
			Escribir "El mayor es ", b
		SiNo
			Escribir "El mayor es ", c
		Fin Si
	Fin Si
	
FinAlgoritmo
