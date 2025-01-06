Algoritmo LetraANumero
	Definir letra Como Caracter
	Definir num Como Entero
	
	Escribir "Calificación en letra (A-B-C-D-E)"
	Leer letra
	
	Segun letra Hacer
		'A':
			num <- 100
		'B':
			num <- 90
		'C':
			num <- 80
		'D':
			num <- 70
		'E':
			num <- 60
		'a':
			num <- 100
		'b':
			num <- 90
		'c':
			num <- 80
		'd':
			num <- 70
		'e':
			num <- 60
		De Otro Modo:
			num <- 0
	Fin Segun
	
	Escribir "Calificación numérica: ", num
	
FinAlgoritmo
