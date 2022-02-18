package com.loiane.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Conversor Farenheit x Celsius. Digite a temperatura em graus Farenheit:");
		double farenheit = scan.nextDouble();
		double celsius = (5 * (farenheit - 32))/9;
		
		System.out.println(farenheit + " equivale a " + celsius + " graus Celsius");
		


	}

}
