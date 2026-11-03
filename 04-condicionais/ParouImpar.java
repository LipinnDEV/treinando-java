import java.util.Scanner;
public class VerificadorNumero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("=== VERIFICADOR DE NÚMEROS ===");
        System.out.print("Digite um número inteiro: ");
        int numero = entrada.nextInt();

        if (numero == 0) {
            System.out.println("O número é zero.");
        } else if (numero % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }

        if (numero > 0) {
            System.out.println("O número é positivo.");
        } else if (numero < 0) {
            System.out.println("O número é negativo.");
        }

        entrada.close();
    }
}
