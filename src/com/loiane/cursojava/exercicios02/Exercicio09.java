package com.loiane.cursojava.exercicios02;
import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número");		
		double num1 = scan.nextDouble();
		
		System.out.println("Digite mais um número");		
		double num2 = scan.nextDouble();
		
		System.out.println("Digite o último número");		
		double num3 = scan.nextDouble();
		
		if (num1 <= num2 && num1 <= num3 && num2 <= num3) {
			System.out.printf(num3 + " - " + num2 + " - " + num1);
		}else if (num1 <= num2 && num1 <= num3 && num3 <= num2) {
			System.out.printf(num2 + " - " + num3 + " - " + num1);
		}else if (num2 <= num1 && num2 <= num3 && num1 <= num3) {
			System.out.printf(num3 + " - " + num1 + " - " + num2);
		}else if (num2 <= num1 && num2 <= num3 && num3 <= num1) {
			System.out.printf(num1 + " - " + num3 + " - " + num2);
		}else if (num3 <= num1 && num3 <= num2 && num2 <= num1) {
			System.out.printf(num1 + " - " + num2 + " - " + num3);
		}else {
			System.out.printf(num2 + " - " + num1 + " - " + num3);
		}
	}

}
