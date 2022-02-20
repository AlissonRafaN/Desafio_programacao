package questao3;
import java.util.Scanner;

public class Questao3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Teste alguma palavra para ver quantos anagramas tem: ");
        String input = scanner.nextLine(); 
        scanner.close();
        int count = 0;

        for (int i = 1; i < input.length(); i++) {
            for (int j = 0; j < (input.length() - i); j++) {
                for (int k = (j + 1); k <= (input.length() - i); k++) {
                    if (j != k) {
                        if (compareStrings(input.substring(j, j + i),
                            input.substring(k, k + i))) {
                            count++;
                        }
                    }
                }
            }
        }

        System.out.println(count);
    }

    public static boolean compareStrings(String string1, String string2) {
        if (string1.length() != string2.length()) {
            return false;
        }
        int i = 0, j = 0;
        while (true) {

            if (string1.charAt(i) == string2.charAt(j)) {
                string1 = string1.substring(0, i) + string1.substring(i + 1); 
                string2 = string2.substring(0, j) + string2.substring(j + 1);
                if (i > string1.length() - 1) { 
                    break;
                } else if (j > string2.length() - 1) {
                    j = 0; 
                }
            } else if (j < string2.length() - 1) {
                j++;
            } else if (i < string1.length() - 1) {
                i++;
                j = 0;
            } else
                break;

        }

        
		if (string1.length() == string2.length() && string1.length() == 0) {
            return true;
        }
        return false; 
    }
}