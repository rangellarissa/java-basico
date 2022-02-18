package com.loiane.cursojava.exercicios02;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite F para sexo feminino ou M para sexo masculino");
		
		String sexo = scan.next();

		if (sexo.equalsIgnoreCase("F")) {
			System.out.println("Feminino");
		}else if (sexo.equalsIgnoreCase("M")){
			System.out.println("Masculino");
		}else {
			System.out.println("Agênero ou Intersexo");
		}
		

	}

}
