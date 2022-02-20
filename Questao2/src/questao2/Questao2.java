package questao2;
import java.util.Scanner;

public class Questao2{
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Qual a senha que quer testar? ");
		String senha = input.nextLine();
		int tamanho = senha.length();
		int count_digito = 0;
		int count_maiuscula = 0;
		int count_minuscula = 0;
		int count_tamanho = 0;
		int count_simbolo = 0;
		char [] c = senha.toCharArray();
			for (int i = 0; i <= tamanho; i++){
				for (int j = i; j != tamanho; j++) {
					if (tamanho < 6) {
						//System.out.println("Senha muito pequena. ");
						count_tamanho =  6 - tamanho;
						break;
					}else if (c[i] >= '0' && c[i] <= '9') {
						//System.out.println("Tem dígito [0-9]. ");
						count_digito++;
						break;
					} else if (c[i] >= 'A' && c[i] <= 'Z') {
						//System.out.println("Tem letras maiusculas [A-Z]. ");
						count_maiuscula++;
						break;
					} else if (c[i] >= 'a' && c[i] <= 'z') {
						//System.out.println("Tem letras minusculas [a-z]. ");
						count_minuscula++;
						break;
					
					} else {
						//System.out.println("Tem letras simbolos [!@#$%¨&*())_+]. ");
						count_simbolo++;
						break;
					}
				}
			}
			System.out.println("\n Numeros: "+count_digito+"\n Maiusculas: "+count_maiuscula+"\n Minusculas: "+count_minuscula+"\n Faltando: "+count_tamanho+"\n Simbolos: "+count_simbolo);
	}
}