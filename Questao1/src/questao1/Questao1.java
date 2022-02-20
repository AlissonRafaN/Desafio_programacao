package questao1;
import java.util.Scanner;

/* 
 * Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando
 * o caractere * e espaços. A base e altura da escada devem ser iguais ao valor de n.
 * A última linha não deve conter nenhum espaço.
 */

public class Questao1{
	
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Quantos degraus terá sua escadinha? ");
		
		int n = input.nextInt();
		
		imprimir(n);
	}
	
	public static void imprimir(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = n; j > 0; j--) {
				if (j == 1) {
					System.out.println("*");
				}else if (i >= j) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
		}
	}
}