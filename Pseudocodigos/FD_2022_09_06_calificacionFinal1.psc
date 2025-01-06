Algoritmo calificacionFinal1
	Definir tareas, proyectos, examen Como Entero
	Definir calificacionFinal Como Real
	
	Escribir "Calificacion de Tareas"
	Leer tareas
	Escribir "Calificacion de Proyectos"
	Leer proyectos
	Escribir "Calificacion del examen"
	Leer examen
	
	calificacionFinal <- (tareas + proyectos + examen) / 3
	
	Escribir "Calificacion final: ", calificacionFinal
FinAlgoritmo
