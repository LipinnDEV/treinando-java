import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String palavra = "OVO";
        String invertida = "";

        for (int i = palavra.length() - 1; i >= 0; i--) {
            invertida += palavra.charAt(i);
        }

        if (palavra.equals(invertida)) {
            System.out.println("É palindromo");
        } else {
            System.out.println("Não é");
        }
    }
}
