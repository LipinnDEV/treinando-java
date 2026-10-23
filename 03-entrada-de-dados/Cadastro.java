import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("=== CADASTRO DE USUARIO ===");

        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt();
        entrada.nextLine();

        System.out.print("Digite sua cidade: ");
        String cidade = entrada.nextLine();

        System.out.print("Digite seu salario: ");
        double salario = entrada.nextDouble();

        System.out.println();
        System.out.println("=== SEUS DADOS ===");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Cidade: " + cidade);
        System.out.println("Salario: R$ " + salario);

        entrada.close();
    }
}
