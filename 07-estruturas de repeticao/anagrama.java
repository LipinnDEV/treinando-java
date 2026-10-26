import java.util.Arrays;
import java.util.Scanner;

public class Anagrama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Verificador de Anagramas ===");

        System.out.print("Digite a primeira palavra: ");
        String palavra1 = sc.nextLine()
                .toLowerCase()
                .replace(" ", "");

        System.out.print("Digite a segunda palavra: ");
        String palavra2 = sc.nextLine()
                .toLowerCase()
                .replace(" ", "");

        char[] letras1 = palavra1.toCharArray();
        char[] letras2 = palavra2.toCharArray();

        if (letras1.length != letras2.length) {
            System.out.println("As palavras não são anagramas.");
        } else {
            Arrays.sort(letras1);
            Arrays.sort(letras2);

            if (Arrays.equals(letras1, letras2)) {
                System.out.println("As palavras são anagramas!");
            } else {
                System.out.println("As palavras não são anagramas.");
            }
        }

        sc.close();
    }
}
