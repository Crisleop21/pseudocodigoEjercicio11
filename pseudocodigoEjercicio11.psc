Algoritmo pseudocodigoEjercicio11
	contadorImpar = 0
	contadorPar = 0
	sumaPar = 0
	contador = 0
	numMayor = 0
	Para i<-1 Hasta 10 Con Paso 1 Hacer
		numRandom<-0+azar(36)
		Escribir "Los numeros ingresados fueron: ",numRandom
		si numRandom mod 2 == 0 Y numRandom <> 0 Entonces
			contadorPar = contadorPar+1
			sumaPar=sumaPar+numRandom
			
		SiNo
			si numRandom <> 0 Entonces
				contadorImpar = contadorImpar+1
			FinSi
			
		FinSi
		
		Si numRandom>=13 Y numRandom<=24 Entonces
			contador=contador+1
		FinSi
		
		Si numRandom>numMayor Entonces
			numMayor=numRandom
		Fin Si
		
	Fin Para
	Escribir ""
	Escribir "El total de numeros impares es: ",contadorImpar
	Escribir "El promedio de los numeros pares es: ",(sumaPar/contadorPar)
	Escribir "Cantidad de numeros de la segunda docena: ",contador
	Escribir "El numero mas grande es: ",numMayor
	
FinAlgoritmo
