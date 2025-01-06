//Funci�n que calcula la constante el�stica (k)
Funcion k <- ConstanteK ( EM, m, v, h, x )
	Definir k, g Como Real
	g <- 9.8
	k <- (EM - (m*v^2/2) - m*g*h) * 2 / x^2
FinFuncion

//Funci�n que calcula la Energ�a Cin�tica (EC)
Funcion EC <- EnergiaC ( m, v ) 
	Definir EC Como Real
	EC <- (m * v^2) / 2
FinFuncion

//Funci�n que calcula la Energ�a Potencial Gravitacional (EPG)
Funcion  EPG <- EnergiaPG ( m, h )
	Definir EPG, g Como Real
	g <- 9.8
	EPG <- m * g * h
FinFuncion

//Funci�n que calcula la Energ�a Potencial El�stica (EPE)
Funcion EPE <- EnergiaPE ( EM, EC, EPG )
	Definir EPE Como Real
	EPE <- EM - EC - EPG 
FinFuncion

//Comienza el Algoritmo
Algoritmo FD_22130803_Algoritmo_01
	
	//Declaraci�n de Variables
	Definir m1, v1, h1, x1, k1, EC1, EPG1, EPE1, EM1 Como Real
	Definir m2, v2, h2, x2, k2, EC2, EPG2, EPE2, EM2 Como Real
	Definir m3, v3, h3, x3, k3, EC3, EPG3, EPE3, EM3 Como Real
	Definir g, Promedio Como Real
	
	//Presentaci�n
	Escribir "PROYECTO 1 - Puentes Vargas Alfredo - 22130803"
	Escribir "Programa para calcular un dato a partir de otros 5 dados por el usuario"
	
	//Entrada de Datos
	Escribir "INGRESE LOS DATOS QUE SE SOLICITAN"
	Escribir "CUERPO 1:"
	Escribir "Masa (m)"
	Leer m1
	Escribir "Velocidad (v)"
	Leer v1
	Escribir "Altura (h)"
	Leer h1
	Escribir "Longitud de estiramiento (x)"
	Leer x1
	Escribir "Energ�a mec�nica (EM)"
	Leer EM1
	Escribir "CUERPO 2:"
	Escribir "Masa (m)"
	Leer m2
	Escribir "Velocidad (v)"
	Leer v2
	Escribir "Altura (h)"
	Leer h2
	Escribir "Longitud de estiramiento (x)"
	Leer x2
	Escribir "Energ�a mec�nica (EM)"
	Leer EM2
	Escribir "CUERPO 3:"
	Escribir "Masa (m)"
	Leer m3
	Escribir "Velocidad (v)"
	Leer v3
	Escribir "Altura (h)"
	Leer h3
	Escribir "Longitud de estiramiento (x)"
	Leer x3
	Escribir "Energ�a mec�nica (EM)"
	Leer EM3
	
	//Calculamos la constante el�stica (k) con la funci�n ConstanteK
	k1 <- ConstanteK ( EM1, m1, v1, h1, x1 )
	k2 <- ConstanteK ( EM2, m2, v2, h2, x2 )
	k3 <- ConstanteK ( EM3, m3, v3, h3, x3 )
	
	//Calculamos la Energ�a Cin�tica (EC) con la funci�n Energ�aC
	EC1 <- EnergiaC ( m1, v1 )
	EC2 <- EnergiaC ( m2, v2 )
	EC3 <- EnergiaC ( m3, v3 )
	
	//Calculamos la Energ�a Potencial Gravitacional (EPG) con la funci�n EnergiaPG
	EPG1 <- EnergiaPG ( m1, h1 )
	EPG2 <- EnergiaPG ( m2, h2 )
	EPG3 <- EnergiaPG ( m3, h3 )
	
	//Calculamos la Energ�a Potencial El�stica (EPE) con la funci�n EnergiaPE
	EPE1 <- EnergiaPE ( EM1, EC1, EPG1 )
	EPE2 <- EnergiaPE ( EM2, EC2, EPG2 )
	EPE3 <- EnergiaPE ( EM3, EC3, EPG3 )
	
	//Calculamos el promedio de nuestro dato (k)
	Promedio <- ( k1 + k2 + k3 ) / 3
	
	//Salida de datos
	Escribir "CUERPO 1:"
	Escribir "Constante el�stica (k) = ", k1
	Escribir "Energ�a Cin�tica (EC) = ", EC1
	Escribir "Energ�a Potencial Gravitatoria (EPG) = ", EPG1
	Escribir "Energ�a Potencial El�stica (EPE) = ", EPE1
	Escribir "CUERPO 2:"
	Escribir "Constante el�stica (k) = ", k2
	Escribir "Energ�a Cin�tica (EC) = ", EC2
	Escribir "Energ�a Potencial Gravitatoria (EPG) = ", EPG2
	Escribir "Energ�a Potencial El�stica (EPE) = ", EPE2
	Escribir "CUERPO 3:"
	Escribir "Constante el�stica (k) = ", k3
	Escribir "Energ�a Cin�tica (EC) = ", EC3
	Escribir "Energ�a Potencial Gravitatoria (EPG) = ", EPG3
	Escribir "Energ�a Potencial El�stica (EPE) = ", EPE3
	Escribir "PROMEDIO DE LOS 3 DATOS (k) = ", Promedio 
FinAlgoritmo
