Algoritmo AreaTrianguloEquilatero
	//declaracion de variables
	Definir lado, area, perimetro, altura Como Real
	
	//datos de entrada
	Escribir "Lado del triángulo"
	Leer lado
	
	//proceso
	perimetro <- lado * 3
	altura <- raiz(3) / 2 * lado
	area <- lado * altura / 2
	
	//datos de salida (resultados)
	Escribir "Área= ", area
	Escribir "Perímetro= ", perimetro
	
FinAlgoritmo
