/*
Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

Exemplos:
Entrada: 		Saída:
5			DIFERENCA = -26
6
7
8

Entrada:		Saída:
5			DIFERENCA = 86
6
-7
8

-----------------------------------------------------------------------------------------------------------------
*/

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D, DIF;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		DIF = (A * B - C * D);
		
		System.out.println("DIFERENCA = " + DIF);
		
		sc.close();

	}

}
