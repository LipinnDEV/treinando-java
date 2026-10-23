import java.util.Scanner;
public class ContadorWhile {
public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número positivo: ");
        int numero = entrada.nextInt();

        while (numero > 0) {
            System.out.println(numero);
            numero--;
        }

        entrada.close();
    }
}
