//Comienza el algoritmo
Algoritmo FD_22130803_Algoritmo_02
	
	//Declaración de variables
	Definir NumDia, NumMes, NumAnio, DiasMes Como Entero
	Definir Formato Como Caracter
	Definir MesCorto, MesLargo Como Cadena
	
	//Presentación
	Escribir "PROYECTO 2 - Puentes Vargas Alfredo - 22130803"
	Escribir "Programa que verifica si una fecha es válida para posteriormente mostrarla en el formato solicitado"
	
	//Salto de línea
	Escribir ""
	
	//Entrada de datos
	Escribir "Ingrese los datos que se solicitan"
	Escribir "Día en número"
	Leer NumDia
	Escribir "Mes en número"
	Leer NumMes
	Escribir "Año a cuatro dígitos"
	Leer NumAnio
	Escribir "Formato de fecha (Ingrese L para largo y C para corto)"
	Leer Formato
	
	//Comprobamos que los datos sean correctos
	Si (NumDia <= 31 Y NumDia >= 1 Y NumMes <= 12 Y NumMes >= 1 Y NumAnio <= 9999 Y NumAnio >= 0001 Y Formato = 'L' O Formato = 'C')Entonces
		
		//Averiguamos cuantos días tiene el mes ingresado por el usuario
		//Preguntamos si el mes tiene 31 días
		Si (NumMes = 1 O NumMes = 3 O NumMes = 5 O NumMes = 7 O NumMes = 8 O NumMes = 10 O NumMes = 12) Entonces
			DiasMes <- 31
		SiNo
			//Preguntamos si el mes es Febrero
			Si (NumMes = 2) Entonces
				//Preguntamos si el año es bisiesto
				Si (NumAnio MOD 4 = 0) Entonces
					DiasMes <- 29
				SiNo
					DiasMes <- 28
				FinSi
			SiNo
				DiasMes <- 30
			FinSi
		FinSi
		
		//Averiguamos si la fecha es válida
		Si (NumDia <= 31 Y DiasMes = 31 O NumDia <= 30 Y DiasMes = 30 O NumDia <= 29 Y DiasMes = 29 O NumDia <= 28 Y DiasMes = 28) Entonces
			Escribir "La fecha ingresada es válida"
			//Preguntamos si el formato es largo (L) o corto (C)
			Si (Formato = 'C') Entonces
				//Le asignamos el nombre del mes correspondiente
				Segun NumMes Hacer
					1:
						MesCorto <- "Ene"
					2:
						MesCorto <- "Feb"
					3:
						MesCorto <- "Mar"
					4:
						MesCorto <- "Abr"
					5:
						MesCorto <- "May"
					6:
						MesCorto <- "Jun"
					7:
						MesCorto <- "Jul"
					8:
						MesCorto <- "Ago"
					9:
						MesCorto <- "Sep"
					10:
						MesCorto <- "Oct"
					11:
						MesCorto <- "Nov"
					12:
						MesCorto <- "Dic"
				FinSegun
				//Salida de datos
				Escribir "Fecha en formato corto: ", NumDia, "/", MesCorto, "/", NumAnio
			SiNo
				//Le asignamos el nombre del mes correspondiente
				Segun NumMes Hacer
					1:
						MesLargo <- "Enero"
					2:
						MesLargo <- "Febrero"
					3:
						MesLargo <- "Marzo"
					4:
						MesLargo <- "Abril"
					5:
						MesLargo <- "Mayo"
					6:
						MesLargo <- "Junio"
					7:
						MesLargo <- "Julio"
					8:
						MesLargo <- "Agosto"
					9:
						MesLargo <- "Septiembre"
					10:
						MesLargo <- "Octubre"
					11:
						MesLargo <- "Noviembre"
					12:
						MesLargo <- "Diciembre"
				FinSegun
				//Salida de datos
				Escribir "Fecha en formato largo: ", NumDia, " de ", MesLargo, " de ", NumAnio
			FinSi
		SiNo
			Escribir "La fecha ingresada no es válida"
		FinSi
	SiNo
		Escribir "Los datos ingresados son incorrectos o están escritos en un formato erróneo, por favor inténtelo de nuevo"
	FinSi
	
FinAlgoritmo
