import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Verificador de Palíndromos ===");

        System.out.print("Digite uma palavra ou frase: ");
        String palavra = sc.nextLine()
                .toLowerCase()
                .replace(" ", "");

        String invertida = "";

        for (int i = palavra.length() - 1; i >= 0; i--) {
            invertida += palavra.charAt(i);
        }

        if (palavra.equals(invertida)) {
            System.out.println("A palavra ou frase é um palíndromo!");
        } else {
            System.out.println("A palavra ou frase não é um palíndromo.");
        }

        sc.close();
    }
}
