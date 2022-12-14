/*
Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

Exemplos:

Entrada: 		Saída:
12 1 5.30		VALOR A PAGAR: R$ 15.50
16 2 5.10

Entrada:		Saída:
13 2 15.30		VALOR A PAGAR: R$ 51.40
161 4 5.20

Entrada: 		Saída:
1 1 15.10		VALOR A PAGAR: R$ 30.20
2 1 15.10

-----------------------------------------------------------------------------------------------------------------
*/

import java.util.Locale;
import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N1, N2, N3, N4;
		double VALOR1, VALOR2, TOTAL1, TOTAL2, TOTGER;
		
		N1 = sc.nextInt();
		N2 = sc.nextInt();
		VALOR1 = sc.nextDouble();
		TOTAL1 = N2 * VALOR1;
		N3 = sc.nextInt();
		N4 = sc.nextInt();
		VALOR2 = sc.nextDouble();
		TOTAL2 = N4 * VALOR2;
		TOTGER = TOTAL1 + TOTAL2;
		
		
		System.out.printf("PECAS COD. %d E %d SELECIONADOS, VALOR A PAGAR: R$ %.2f%n", N1, N3, TOTGER);
		
		
		sc.close();

	}
