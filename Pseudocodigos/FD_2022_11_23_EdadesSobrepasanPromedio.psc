Algoritmo EdadesSobrepasanPromedio
	Definir n, i, suma Como Entero
	Definir promedio Como Real
	
	Escribir "¿Cuántas edades?"
	Leer n
	
	//Declaración del arreglo
	Definir edad Como Entero
	Dimension edad[n]
	
	suma <- 0
	
	Para i<-0 Hasta n-1 Con Paso 1 Hacer
		Escribir "Edad ", i+1
		Leer edad[i]
		
		suma <- suma + edad[i]
	Fin Para
	
	Si n=0 Entonces
		Escribir "Promedio = 0"
	SiNo
		promedio <- suma / n
		
		Escribir "Edades que sobrepasan al promedio"
		
		Para i<-0 Hasta n-1 Con Paso 1 Hacer
			Si edad[i] > promedio Entonces
				Escribir edad[i]
			FinSi
		Fin Para
	Fin Si
FinAlgoritmo
