Algoritmo FD_2022_10_04_MayorDe2Numeros
	Definir numero1, numero2 Como Real
	
	Escribir "Primer N�mero"
	Leer numero1
	
	Escribir "Segundo N�mero"
	Leer numero2
	
	Si numero1 = numero2 Entonces
		Escribir "Los n�meros son iguales"
	SiNo
		Si numero1 > numero2 Entonces
			Escribir "El mayor es el n�mero: ", numero1
		SiNo
			Escribir "El mayor es el n�mero: ", numero2
		Fin Si
	Fin Si
	
	
	
FinAlgoritmo
