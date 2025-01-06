Funcion num <- LetraANum ( letra )
	Definir num Como Entero
	
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
	
Fin Funcion

Algoritmo PromedioLetra
	Definir examen1N, examen2N, examen3N, examen4N Como Entero
	Definir examen2L, examen3L, examen4L Como Caracter
	Definir promedio Como Real
	Definir nivel Como Cadena
	
	Escribir "Primer exámen (Escala 1-100): "
	Leer examen1N
	Escribir "Segundo exámen (A-B-C-D-E): "
	Leer examen2L
	Escribir "Tercer exámen (A-B-C-D-E): "
	Leer examen3L
	Escribir "Cuarto exámen (A-B-C-D-E): "
	Leer examen4L
	
	examen2N <- LetraANum(examen2L)
	examen3N <- LetraANum(examen3L)
	examen4N <- LetraANum(examen4L)
	
	promedio <- (examen1N + examen2N + examen3N + examen4N) / 4
	
	Escribir "Promedio obtenido: ", promedio
	
	Si promedio < 60 Entonces
		nivel <- "Insuficiente"
	SiNo
		Si promedio < 70 Entonces
			nivel <- "Suficiente"
		SiNo
			Si promedio < 80 Entonces
				nivel <- "Regular"
			SiNo
				Si promedio < 90 Entonces
					nivel <- "Bueno"
				SiNo
					nivel <- "¡Excelente!"
				Fin Si
			Fin Si
		Fin Si
	Fin Si
	
	Escribir "Nivel de desempeño: ", nivel
FinAlgoritmo
