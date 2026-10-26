import java.util.Arrays;

public class Anagrama {
    public static void main(String[] args) {
        String palavra1 = "PEDRA";
        String palavra2 = "PERDA";

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
    }
}
