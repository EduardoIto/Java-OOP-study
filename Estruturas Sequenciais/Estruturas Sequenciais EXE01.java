/*
Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos.

Exemplos:
Entrada:          Saída:
10                SOMA = 40
30

Entrada:          Saída:
-30               SOMA = -20
10

Entrada:          Saída:
0                 SOMA = 0
0

-------------------------------------------------------------------------------------------------------
*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int V1, V2, SOMA;
		
		V1 = sc.nextInt();
		V2 = sc.nextInt();
		SOMA = V1 + V2;
		System.out.println("A soma dos dois numeros digitados = " + SOMA);
				
		sc.close();
	}
}
