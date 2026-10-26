import java.util.Arrays;
import java.util.Scanner;

public class Anagrama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira uma palavra: ");
        String palavra1 = sc.nextLine();
        System.out.println("Insira uma palavra: ");
        String palavra2 = sc.nextLine();

        char[] letras1 = palavra1.toLowerCase().toCharArray();
        char[] letras2 = palavra2.toLowerCase().toCharArray();

        if (letras1.length != letras2.length) {
            System.out.println("Não é anagrama");
        } else {
            Arrays.sort(letras1);
            Arrays.sort(letras2);

            if (Arrays.equals(letras1, letras2)) {
                System.out.println("É anagrama");
            } else {
                System.out.println("Não é anagrama");
            }
        }
        sc.close();
    }
}
