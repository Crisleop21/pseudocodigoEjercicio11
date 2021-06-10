import java.util.*;
import java.math.*;

public class Ejercicio11{

	public static void main(String[] args) {
		//declaramos variables y las inicializamos
		double contadorImpar;
		double contadorPar;
		double sumaPar;
		double contador;
		double numMayor;
		double i;
		double numRandom;
		//inicializando
		contador = 0;
		contadorImpar = 0;
		contadorPar = 0;
		sumaPar = 0;
		numMayor = 0;
		for (i=1;i<=10 ;i++) {
			numRandom = 0+Math.floor(Math.random()*36);
			System.out.println("Los numeros ingresados fueron: "+numRandom);
			if (numRandom%2==0 && numRandom != 0) {
				contadorPar = contadorPar+1;
				sumaPar = sumaPar+numRandom;				
			} else{
				if (numRandom != 0) {
					contadorImpar = contadorImpar+1;					
				}
			}
			if (numRandom >= 13 && numRandom <= 24 ) {
				contador = contador+1;				
			}
			if (numRandom > numMayor) {
				numMayor = numRandom;				
			}
		}
		System.out.println("");
		System.out.println("El total de numeros impares es: "+contadorImpar);
		System.out.println("El promedio de los numeros pares es: "+(sumaPar/contadorPar));
		System.out.println("Cantidad de numeros de la segunda docena: "+contador);
		System.out.println("El numero mas grande es: "+numMayor);
	}
}