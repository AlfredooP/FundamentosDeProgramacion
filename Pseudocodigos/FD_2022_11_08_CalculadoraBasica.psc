Algoritmo CalculadoraBasica
	Definir valor1, valor2, resultado Como Real
	Definir operacion Como Entero
	
	Repetir
		Escribir "0- Salida"
		Escribir "1- Suma"
		Escribir "2- Resta"
		Escribir "3- Multiplicaci�n"
		Escribir "4- Divisi�n"
		
		Escribir "Seleccione opci�n"
		Leer operacion
		
		Segun operacion Hacer
			0://salida
				Escribir "Gracias por usar nuestra super calculadora"
			1://suma
				Escribir  "Primer sumando"
				Leer valor1
				Escribir "Segundo sumando"
				Leer valor2
				
				resultado <- valor1 + valor2
				Escribir valor1, " + ", valor2, " = ", resultado
				
			2://resta
				Escribir  "Minuendo"
				Leer valor1
				Escribir "Sustraendo"
				Leer valor2
				
				resultado <- valor1 - valor2
				Escribir valor1, " - ", valor2, " = ", resultado
			3://multiplicaci�n
				Escribir  "Primer factor"
				Leer valor1
				Escribir "Segundo factor"
				Leer valor2
				
				resultado <- valor1 * valor2
				Escribir valor1, " x ", valor2, " = ", resultado
			4://divisi�n
				Escribir  "Dividendo"
				Leer valor1
				
				Repetir
					Escribir "Divisor"
					Leer valor2
				Mientras Que valor2 = 0
				
				resultado <- valor1 / valor2
				Escribir valor1, " / ", valor2, " = ", resultado
			De Otro Modo:
				Escribir "Opci�n no v�lida"
		Fin Segun
	Mientras Que operacion <> 0

FinAlgoritmo
