
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Atividade 1 - Apresentação pessoal
        String nome = "Felipe";
        int idade = 18;
        String linguagem = "Java";

        System.out.println("=== Apresentação Pessoal ===");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Estou aprendendo " + linguagem + "!");

        // Atividade 2 - Operações matemáticas
        int a = 10;
        int b = 5;

        System.out.println("\n=== Operações Matemáticas ===");
        System.out.println("Soma: " + (a + b));
        System.out.println("Subtração: " + (a - b));
        System.out.println("Multiplicação: " + (a * b));
        System.out.println("Divisão: " + (a / b));

        // Atividade 3 - Entrada de dados
        System.out.println("\n=== Cadastro do Usuário ===");

        System.out.print("Digite seu nome: ");
        String nomeUsuario = sc.nextLine();

        System.out.print("Digite sua idade: ");
        int idadeUsuario = sc.nextInt();

        System.out.println("\n=== Dados Informados ===");
        System.out.println("Nome: " + nomeUsuario);
        System.out.println("Idade: " + idadeUsuario + " anos");

        System.out.println("\nCadastro realizado com sucesso!");

        sc.close();
    }
}
