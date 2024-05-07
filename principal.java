package metodos;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		int num1;
		double numero1,numero2;
		
		/////////EJERCICIO1//////////
		System.out.println("Introduzca un entero para mostrar su tabla de multiplicar");
		num1=teclado.nextInt();
		operaciones.tabla(num1);
		
		/////////EJERCICIO2//////////
		System.out.println("Introduzca un entero para indicar si es primo");
		num1=teclado.nextInt();
		if(operaciones.primo(num1))
		{
			System.out.println("El número "+num1+" es primo");
		}
		else
		{
			System.out.println("El número "+num1+" no es primo");
		}
		
		/////////EJERCICIO3//////////
		System.out.println("Introduzca un entero positivo para mostrar la suma de los 100 números siguientes:");
		num1=teclado.nextInt();
		while(!operaciones.esPositivo(num1))
		{
			System.out.println("Introduzca un entero positivo para mostrar la suma de los 100 números siguientes:");
			num1=teclado.nextInt();
		}
		System.out.println("La suma es: "+ operaciones.suma100(num1));
			
		/////////EJERCICIO4//////////
		System.out.println("Introduzca un entero positivo para mostrarlo al revés");
		num1=teclado.nextInt();
		System.out.println(operaciones.invertir(num1));
		
		/////////EJERCICIO5//////////
		System.out.println("Introduzca primer número para realizar operaciones matemáticas: ");
		numero1=teclado.nextDouble();
		System.out.println("Introduzca segundo número para realizar operaciones matemáticas: ");
		numero2=teclado.nextDouble();
		
		System.out.println("La suma es: "+operaciones.suma(numero1, numero2));
		System.out.println("La resta es: "+operaciones.resta(numero1, numero2));
		System.out.println("La multiplicación es: "+operaciones.multiplicacion(numero1, numero2));
		System.out.println("La división es: "+operaciones.division(numero1, numero2));
	}

}
