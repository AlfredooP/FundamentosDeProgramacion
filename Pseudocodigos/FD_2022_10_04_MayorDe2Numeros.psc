Algoritmo FD_2022_10_04_MayorDe2Numeros
	Definir numero1, numero2 Como Real
	
	Escribir "Primer Número"
	Leer numero1
	
	Escribir "Segundo Número"
	Leer numero2
	
	Si numero1 = numero2 Entonces
		Escribir "Los números son iguales"
	SiNo
		Si numero1 > numero2 Entonces
			Escribir "El mayor es el número: ", numero1
		SiNo
			Escribir "El mayor es el número: ", numero2
		Fin Si
	Fin Si
	
	
	
FinAlgoritmo
