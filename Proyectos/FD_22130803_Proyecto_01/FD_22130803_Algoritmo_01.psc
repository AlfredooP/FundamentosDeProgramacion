//Función que calcula la constante elástica (k)
Funcion k <- ConstanteK ( EM, m, v, h, x )
	Definir k, g Como Real
	g <- 9.8
	k <- (EM - (m*v^2/2) - m*g*h) * 2 / x^2
FinFuncion

//Función que calcula la Energía Cinética (EC)
Funcion EC <- EnergiaC ( m, v ) 
	Definir EC Como Real
	EC <- (m * v^2) / 2
FinFuncion

//Función que calcula la Energía Potencial Gravitacional (EPG)
Funcion  EPG <- EnergiaPG ( m, h )
	Definir EPG, g Como Real
	g <- 9.8
	EPG <- m * g * h
FinFuncion

//Función que calcula la Energía Potencial Elástica (EPE)
Funcion EPE <- EnergiaPE ( EM, EC, EPG )
	Definir EPE Como Real
	EPE <- EM - EC - EPG 
FinFuncion

//Comienza el Algoritmo
Algoritmo FD_22130803_Algoritmo_01
	
	//Declaración de Variables
	Definir m1, v1, h1, x1, k1, EC1, EPG1, EPE1, EM1 Como Real
	Definir m2, v2, h2, x2, k2, EC2, EPG2, EPE2, EM2 Como Real
	Definir m3, v3, h3, x3, k3, EC3, EPG3, EPE3, EM3 Como Real
	Definir g, Promedio Como Real
	
	//Presentación
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
	Escribir "Energía mecánica (EM)"
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
	Escribir "Energía mecánica (EM)"
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
	Escribir "Energía mecánica (EM)"
	Leer EM3
	
	//Calculamos la constante elástica (k) con la función ConstanteK
	k1 <- ConstanteK ( EM1, m1, v1, h1, x1 )
	k2 <- ConstanteK ( EM2, m2, v2, h2, x2 )
	k3 <- ConstanteK ( EM3, m3, v3, h3, x3 )
	
	//Calculamos la Energía Cinética (EC) con la función EnergíaC
	EC1 <- EnergiaC ( m1, v1 )
	EC2 <- EnergiaC ( m2, v2 )
	EC3 <- EnergiaC ( m3, v3 )
	
	//Calculamos la Energía Potencial Gravitacional (EPG) con la función EnergiaPG
	EPG1 <- EnergiaPG ( m1, h1 )
	EPG2 <- EnergiaPG ( m2, h2 )
	EPG3 <- EnergiaPG ( m3, h3 )
	
	//Calculamos la Energía Potencial Elástica (EPE) con la función EnergiaPE
	EPE1 <- EnergiaPE ( EM1, EC1, EPG1 )
	EPE2 <- EnergiaPE ( EM2, EC2, EPG2 )
	EPE3 <- EnergiaPE ( EM3, EC3, EPG3 )
	
	//Calculamos el promedio de nuestro dato (k)
	Promedio <- ( k1 + k2 + k3 ) / 3
	
	//Salida de datos
	Escribir "CUERPO 1:"
	Escribir "Constante elástica (k) = ", k1
	Escribir "Energía Cinética (EC) = ", EC1
	Escribir "Energía Potencial Gravitatoria (EPG) = ", EPG1
	Escribir "Energía Potencial Elástica (EPE) = ", EPE1
	Escribir "CUERPO 2:"
	Escribir "Constante elástica (k) = ", k2
	Escribir "Energía Cinética (EC) = ", EC2
	Escribir "Energía Potencial Gravitatoria (EPG) = ", EPG2
	Escribir "Energía Potencial Elástica (EPE) = ", EPE2
	Escribir "CUERPO 3:"
	Escribir "Constante elástica (k) = ", k3
	Escribir "Energía Cinética (EC) = ", EC3
	Escribir "Energía Potencial Gravitatoria (EPG) = ", EPG3
	Escribir "Energía Potencial Elástica (EPE) = ", EPE3
	Escribir "PROMEDIO DE LOS 3 DATOS (k) = ", Promedio 
FinAlgoritmo
