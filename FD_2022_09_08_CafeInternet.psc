Algoritmo CafeInternet
	Definir horEnt, minEnt, segEnt, horSal, minSal, segSal, horUti, minUti, SegUti Como Entero
	Definir totSegundosEnt, totSegundosSal, restoSegundos, segundosUti Como Entero
	Definir tarifaHora, pago, tarifaSeg Como Real
	
	Escribir "Hora de entrada"
	Leer horEnt
	Escribir "Minutos de entrada"
	Leer minEnt
	Escribir "Segundos de entrada"
	Leer segEnt
	
	Escribir "Hora de salida"
	Leer horSal
	Escribir "Minutos de salida"
	Leer minSal
	Escribir "Segundos de salida"
	Leer segSal
	
	Escribir "Tarifa por hora"
	Leer tarifaHora
	
	totSegundosEnt <- horEnt * 3600 + minEnt * 60 + segEnt
	totSegundosSal <- horSal * 3600 + minSal * 60 + segSal
	
	segundosUti <- totSegundosSal - totSegundosEnt
	
	tarifaSeg <- tarifaHora / 3600
	pago <- segundosUti * tarifaSeg
	
	horUti <- trunc(SegundosUti / 3600) //DIV
	restoSegundos <- SegundosUti MOD 3600 //MOD
	minUti <- trunc(restoSegundos / 60) //DIV
	SegUti <- restoSegundos MOD 60 //MOD
	
	Escribir "Tiempo utilizado: ", horUti, ":", minUti, ":", SegUti
	Escribir "Pago: ", pago
FinAlgoritmo
