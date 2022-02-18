package com.loiane.cursojava.exercicios02;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Salário atual:");
		
		double salario = scan.nextDouble();
		
		int percentual = 0;
		
		if (salario <= 280) {
			percentual = 20;
		}else if (280 <= salario && salario < 700){
			percentual = 15;
		}else if (700 <= salario && salario < 1500){
			percentual = 10;
		}else{
			percentual = 5;
		}
		
		double aumento = (salario / 100) * percentual;
		double salarioAjustado = salario + aumento;
		
		System.out.println("Salário atual = " + salario);
		System.out.println("Aumento = " + percentual + "%");
		System.out.println("Valor do aumento = " + aumento);
		System.out.println("Novo salário = " + salarioAjustado);

	}

}
