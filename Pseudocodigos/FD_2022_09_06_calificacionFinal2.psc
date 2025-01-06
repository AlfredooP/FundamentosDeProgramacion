Algoritmo calificacionFinal2
	Definir tareas, proyectos, examen Como Entero
	Definir calificacionFinal Como Real
	
	Escribir "Calificacion de Tareas"
	Leer tareas
	Escribir "Calificacion de Proyectos"
	Leer proyectos
	Escribir "Calificacion del examen"
	Leer examen
	
	calificacionFinal <- tareas * 0.25 + proyectos * 0.30 + examen * 0.45
	
	Escribir "Calificacion final: ", calificacionFinal
FinAlgoritmo
