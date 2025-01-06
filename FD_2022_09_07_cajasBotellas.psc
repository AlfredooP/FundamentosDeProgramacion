Algoritmo cajasBotellas
	Definir numeroBotellas, botellasPorCaja, cajasCompletas, botellasSueltas Como Entero
	
	Escribir "Numero de botellas a acomodar en cajas"
	Leer numeroBotellas
	Escribir "Botellas por caja"
	Leer botellasPorCaja
	
	cajasCompletas <- trunc(numeroBotellas / botellasPorCaja) //aplicamos DIV
	botellasSueltas <- numeroBotellas MOD botellasPorCaja //aplicamos MOD
	
	Escribir "Se completaron ", cajasCompletas, " cajas y sobraron ", botellasSueltas, " botellas sueltas"
FinAlgoritmo
