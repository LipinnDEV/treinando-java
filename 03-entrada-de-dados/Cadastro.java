import java.util.Scanner;
public class Cadastro {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("=== CADASTRO DE USUÁRIO ===");

        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt();
        entrada.nextLine();

        System.out.print("Digite sua cidade: ");
        String cidade = entrada.nextLine();

        System.out.print("Digite seu salário: R$ ");
        double salario = entrada.nextDouble();

        System.out.println("\n=== SEUS DADOS ===");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Cidade: " + cidade);
        System.out.printf("Salário: R$ %.2f%n", salario);

        System.out.println("\n=== CÁLCULO DE DESCONTO ===");

        double valor = 200.00;
        double desconto = 0.10;
        double valorDesconto = valor * desconto;
        double valorFinal = valor - valorDesconto;

        System.out.printf("Valor original: R$ %.2f%n", valor);
        System.out.printf("Desconto (10%%): R$ %.2f%n", valorDesconto);
        System.out.printf("Preço final: R$ %.2f%n", valorFinal);

        entrada.close();
    }
}
