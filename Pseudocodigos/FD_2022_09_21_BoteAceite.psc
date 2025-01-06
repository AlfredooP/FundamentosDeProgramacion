Funcion volumen <- volumenCilindro ( radio, altura )
	volumen <- PI * radio ^ 2 * altura
Fin Funcion

Algoritmo FD_2022_09_21_BoteAceite
	Definir radioBote, alturaBote, radioCil1, radioCil2, radioCil3 Como Real
	Definir altCil1, altCil2, altCil3, volCil1, volCil2, volCil3 Como Real
	Definir  volAceite, volBote Como Real
	
	Escribir "Radio del Bote"
	Leer radioBote
	Escribir "Altura del Bote"
	Leer alturaBote
	
	Escribir "Radio del primer cilindro"
	Leer radioCil1
	Escribir "Altura del primer cilindro"
	Leer altCil1
	Escribir "Radio del segundo cilindro"
	Leer radioCil2
	Escribir "Altura del segundo cilindro"
	Leer altCil2
	Escribir "Radio del tercer cilindro"
	Leer radioCil3
	Escribir "Altura del tercer cilindro"
	Leer altCil3
	
	//Mandamos llamar cuatro veces la función
	volBote <- volumenCilindro (radioBote, alturaBote)
	volCil1 <- volumenCilindro (radioCil1, altCil1)
	volCil2 <- volumenCilindro (radioCil2, altCil2)
	volCil3 <- volumenCilindro (radioCil3, altCil3)
	
	volAceite <- volBote - (volCil1 + volCil2 + volCil3)
	Escribir "Volumen de aceite que quedó: ", volAceite
	
FinAlgoritmo
