/*
Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
Exemplos:

Entrada: 		Saída:
25.01 			Intervalo (25,50]

Entrada: 		Saída:
25.00 			Intervalo [0,25]

Entrada: 		Saída:
100.00 			Intervalo (75,100]

Entrada: 		Saída:
-25.02 			Fora de intervalo

---------------------------------------------------------------------------------------------------------------
*/

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float number;
		
		System.out.println("Digite um numero entre 0 a 100: ");
		number = sc.nextFloat();
		
		if ((number >= 0) && (number <= 25)) {
			System.out.println("INTERVALO [0,25]");
		}
		else if ((number > 25) && (number <= 50)) {
			System.out.println("INTERVALO [25,50]");
		}
		else if ((number > 50) && (number <= 75)) {
			System.out.println("INTERVALO [50,75]");
		}
		else if ((number > 75) && (number <= 100)) {
			System.out.println("INTERVALO [75,100]");
		}
		else {
			System.out.println("FORA DE INTERVALO");
		}
		sc.close();
		
	}

}
