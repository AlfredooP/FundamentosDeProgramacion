//Función que calcula la potencia de cualquier número
Funcion pot <- potencia ( base, exponente )
	//Definición de variables
	Definir pot Como Real
	Definir i Como Entero
	
	//Asignamos valores de inicio
	pot <- 1
	
	//Ciclo para el procedimiento
	Para i<-1 Hasta exponente Con Paso 1 Hacer
		
		//Realizamos el procedimiento
		pot <- pot * base
		
	FinPara
FinFuncion

//Comienza el algoritmo
Algoritmo FD_22130803_Proyecto_03
	
	//Definición de variables
	Definir opcion, signo, i, n Como Entero
	Definir x, lnx, suma, arcTanx, enter Como Real
	
	//Presentación
	Escribir "PROYECTO 3 - Puentes Vargas Alfredo - 22130803"
	Escribir "Programa que calcula el Logaritmo Natural (ln) o el Arco Tangente (ArcTan) de un número"
	
	//Salto de línea
	Escribir ""
	
	//Ciclo para que se repita el menú
	Repetir
		
		//Desplegamos el menú
		Escribir "MENÚ"
		Escribir "0 - Salir"
		Escribir "1 - Logaritmo Natural"
		Escribir "2 - Arco Tangente"
		
		//Salto de línea
		Escribir ""
		
		//Pedimos opción
		Escribir "Seleccione opción:"
		Leer opcion
		
		//Salto de línea
		Escribir ""
		
		//Realizamos la operación elegida
		Segun opcion Hacer
			0: //Salida
			1: //Logaritmo Natural
				Escribir "Ha seleccionado: Logaritmo Natural"
				
				Repetir
					//Entrada de datos
					Escribir "Ingrese un número entre 2 y 0"
					Leer x
					
					//Verificamos si el número es válido
					Si (2 >= x  Y x > 0) Entonces
						
						//Asignamos valores de inicio
						suma <- 0
						n <- 1
						signo <- 1
						
						//Ciclo para el procedimiento que se repetirá 25 veces
						Para i<-1 Hasta 25 Con Paso 1 Hacer
							
							//Realizamos el procedimiento
							lnx <- 1/n * potencia((x-1), n) * signo
							
							//Acumulamos en la variable suma
							suma <- lnx + suma
							
							//Cambiamos el signo y aumentamos n
							signo <- signo * (-1)
							n <- n + 1
							
						FinPara
						
						//Salida de datos
						Escribir "ln (", x, ") = ", suma
						Escribir "Presione ENTER para continuar..."
						Leer enter
						
					SiNo
						Escribir "El número no es válido, intente de nuevo"
					FinSi
					
				Mientras Que (x > 2 O x <= 0) //Si el número no es válido lo vuelve a pedir
				
			2: //Arco Tangente
				Escribir "Ha seleccionado: Arco Tangente"
				
				Repetir
					//Entrada de datos
					Escribir "Ingrese un número menor que 1"
					Leer x
					
					//Verificamos si el número es válido
					Si (x < 1 Y x > -1) Entonces
						
						//Asignamos valores de inicio
						suma <- 0
						n <- 1
						signo <- 1
						
						//Ciclo para el procedimiento que se repetirá 25 veces
						Para i <- 1 Hasta 25 Con Paso 1 Hacer
							//Realizamos el procedimiento
							arcTanx <- (potencia(x, n) / n) * signo
							
							//Acumulamos en la variable suma
							suma <- arcTanx + suma
							
							//Cambiamos el signo y aumentamos n
							signo <- signo * (-1)
							n <- n + 2
						FinPara
						
						//Salida de datos
						Escribir "arcTan ", x, "° = ", suma
						Escribir "Presione ENTER para continuar..."
						Leer enter
						
					SiNo
						Escribir "El número no es válido, intente de nuevo"
					FinSi
					
				Mientras Que (x >= 1 O x <= -1) //Si el número no es válido lo vuelve a pedir
				
			De Otro Modo: //Cualquier opción no válida
				Escribir "Opción no válida, intente de nuevo"
		FinSegun
		
		//Salto de línea
		Escribir ""
		
	Mientras Que opcion <> 0 //Si el usuario elige 0 se deja de desplegar el menú
	
	//Despedida
	Escribir "Gracias por usar nuestro programa :)"
	
FinAlgoritmo
