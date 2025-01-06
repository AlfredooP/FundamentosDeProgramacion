Algoritmo FD_2022_10_31_TablasFunciones
	Definir AnguloI, AnguloF, angulo Como Entero
	Definir x Como Real
	
	Escribir "Angulo Inicial (En grados)"
	Leer AnguloI
	Escribir "Angulo Final (En grados)"
	Leer AnguloF
	
	Escribir "Ángulo      sen       cos          tan            csc           sec          ctan"
	Escribir "=================================================================================="
	Para angulo<-AnguloI Hasta AnguloF Con Paso 1 Hacer
		x <- angulo * PI / 180
		Escribir angulo, "  " sen(x), "  ", cos(x), "  ", tan(x), "  ", 1/sen(x), "  ", 1/cos(x), "  ", 1/tan(x)
	Fin Para
FinAlgoritmo
