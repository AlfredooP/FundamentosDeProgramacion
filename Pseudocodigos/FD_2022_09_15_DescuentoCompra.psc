Algoritmo FD_2022_09_15_DescuentoCompra
	Definir folio, digito1, digito2, digito3, digito4 Como Entero
	Definir cociente1, cociente2 Como Entero
	Definir compra, pago, importeDesc, porcentajeDesc Como Real
	
	Escribir "Importe de la compra: "
	Leer compra
	Escribir "Folio de la compra (4 dígitos)"
	Leer folio
	
	cociente1 <- trunc(folio / 10)
	digito1 <- folio MOD 10
	cociente2 <- trunc(cociente1 / 10)
	digito2 <- cociente1 MOD 10
	digito4 <- trunc(cociente2 / 10)
	digito3 <- cociente2 MOD 10
	
	porcentajeDesc <- (digito1 + digito2 + digito3 + digito4) / 4
	importeDesc <- compra * porcentajeDesc / 100
	pago <- compra - importeDesc
	
	Escribir "Su compra fue de $", compra " pero tuvo un ", porcentajeDesc " por ciento de descuento que equivale a $", importeDesc, " por lo que sólo pagará $", pago
FinAlgoritmo
