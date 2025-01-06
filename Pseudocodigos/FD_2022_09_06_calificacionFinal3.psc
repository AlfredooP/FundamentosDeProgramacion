Algoritmo calificacionFinal3
	Definir tareas, proyectos, examen Como Entero
	Definir pondTareas, pondProyectos, pondExamen Como Entero
	Definir calificacionFinal, calificacionTareas, calificacionProyectos, calificacionExamen Como Real
	
	Escribir "Calificacion de Tareas"
	Leer tareas
	Escribir "Calificacion de Proyectos"
	Leer proyectos
	Escribir "Calificacion del examen"
	Leer examen
	
	Escribir "% Pondercaion Tareas"
	Leer pondTareas
	Escribir "% Pondercaion Proyectos"
	Leer pondProyectos
	
	pondExamen <- 100 - (pondTareas + pondProyectos)
	
	calificacionTareas <- tareas * pondTareas / 100
	calificacionProyectos <- proyectos * pondProyectos / 100
	calificacionExamen <- examen * pondExamen / 100
	
	calificacionFinal <- calificacionTareas + calificacionProyectos + calificacionExamen
	
	Escribir "Tareas = ", calificacionTareas
	Escribir "Proyectos = ", calificacionProyectos
	Escribir "Examen = ", calificacionExamen
	Escribir "Calificacion final: ", calificacionFinal
FinAlgoritmo
