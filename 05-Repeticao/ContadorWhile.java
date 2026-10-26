import java.util.Scanner;
public class ContadorWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("=== Contador Regressivo ===");
        System.out.print("Digite um número positivo: ");
        int numero = entrada.nextInt();

        if (numero <= 0) {
            System.out.println("Por favor, digite um número maior que zero.");
        } else {
            System.out.println("Iniciando contagem regressiva:");

            while (numero > 0) {
                System.out.println("Número: " + numero);
                numero--;
            }

            System.out.println("Contagem finalizada!");
        }

        entrada.close();
    }
}
