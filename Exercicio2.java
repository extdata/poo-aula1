package aula1;

import java.util.Scanner;

public class Exercicio2 {
	public static void main( String[] args ) {
		Scanner scanner = new Scanner( System.in );
		System.out.println( "Quantos anos voc� tem?" );
		int numero = scanner.nextInt();
			if ( numero > 30 ) {
				System.out.println( "T� velho" );
			} else if ( numero < 15 ) {
					System.out.println("");
			}
		
		//verifica a idade, se for maior que 30 imprime "Voc� � velho!"
		System.out.println();
	}
}