import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Calculadora simples ===");

        System.out.print("Digite o primeiro número: ");
        int numero1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = sc.nextInt();

        int soma = numero1 + numero2;
        int subtracao = numero1 - numero2;
        int multiplicacao = numero1 * numero2;

        System.out.println("\n=== Resultados ===");
        System.out.println("A soma de " + numero1 + " + " + numero2 + " = " + soma);
        System.out.println("A subtração de " + numero1 + " - " + numero2 + " = " + subtracao);
        System.out.println("A multiplicação de " + numero1 + " x " + numero2 + " = " + multiplicacao);

        if (numero2 != 0) {
            double divisao = (double) numero1 / numero2;
            System.out.println("A divisão de " + numero1 + " / " + numero2 + " = " + divisao);
        } else {
            System.out.println("Não é possível dividir um número por zero.");
        }

        sc.close();
    }
}
