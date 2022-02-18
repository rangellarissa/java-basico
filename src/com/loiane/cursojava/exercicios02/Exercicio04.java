package com.loiane.cursojava.exercicios02;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma letra");
		
		String letra = scan.next();
		
		if (letra.length()>1) {
			System.out.println("Não é uma letra válida");
		}else {
			switch(letra) {
				case "a":
				case "e":
				case "i":
				case "o":
				case "u":
				case "A":
				case "E":
				case "I":
				case "O":
				case "U": System.out.println("A letra " + letra + " é uma vogal"); break;
				default: System.out.println("A letra " + letra + " é uma consoante");
			}

		}
		
	}
}
