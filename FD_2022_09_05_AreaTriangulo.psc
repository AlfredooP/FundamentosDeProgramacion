Algoritmo AreaTriangulo
	Definir lado1, lado2, lado3, area, perimetro, s Como Real
	
	Escribir "Primer lado"
	Leer lado1
	Escribir "Segundo lado"
	Leer lado2
	Escribir "Tercer lado"
	Leer lado3
	
	perimetro <- lado1 + lado2 + lado3 
	s <- perimetro / 2
	
	//formula de Heron
	area <- raiz(s * (s-lado1) * (s-lado2) * (s-lado3))
	
	Escribir "Área= ", area, " Perímetro= ", perimetro
	
FinAlgoritmo
