Funcion  centimetros <- PiesPulgACms(pies, pulgadas)
	Definir centimetros Como Real
	centimetros <- pies * 30.48 + pulgadas * 2.54
FinFuncion
Algoritmo FD_2022_09_22_PromedioEstatura
	Definir pies1,pulg1, pies2, pulg2, pies3, pulg3 Como Entero
	Definir promedioCm, estaturaCm1, estaturaCm2,estaturaCm3 Como Real
	
	Escribir "Estatura de la primera persona"
	Escribir "Pies: "
	Leer pies1
	Escribir "Pulgadas: "
	Leer pulg1
	
	Escribir "Estatura de la segunda persona"
	Escribir "Pies: "
	Leer pies2
	Escribir "Pulgadas: "
	Leer pulg2
	
	Escribir "Estatura de la tercera persona"
	Escribir "Pies: "
	Leer pies3
	Escribir "Pulgadas: "
	Leer pulg3
	
	estaturaCm1 <- PiesPulgACms(pies1, pulg1)
	estaturaCm2 <- PiesPulgACms(pies2, pulg2)
	estaturaCm3 <- PiesPulgACms(pies3, pulg3)
	
	promedioCm <- (estaturaCm1 + estaturaCm2 + estaturaCm3) / 3
	
	Escribir "El promedio de estatura es: ", promedioCm, "centimetros"
FinAlgoritmo
