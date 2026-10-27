import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        apresentacaoPessoal();
        operacoesMatematicas();
        cadastroUsuario(sc);

        sc.close();
    }

    public static void apresentacaoPessoal() {
        String nome = "Felipe";
        int idade = 18;
        String linguagem = "Java";

        System.out.println("=== APRESENTAÇÃO PESSOAL ===");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Estou aprendendo " + linguagem + "!");
    }

    public static void operacoesMatematicas() {
        int a = 10;
        int b = 5;

        System.out.println("\n=== OPERAÇÕES MATEMÁTICAS ===");
        System.out.println("Soma: " + (a + b));
        System.out.println("Subtração: " + (a - b));
        System.out.println("Multiplicação: " + (a * b));
        System.out.println("Divisão: " + (a / b));
    }

    public static void cadastroUsuario(Scanner sc) {
        System.out.println("\n=== CADASTRO DO USUÁRIO ===");

        System.out.print("Digite seu nome: ");
        String nomeUsuario = sc.nextLine();

        System.out.print("Digite sua idade: ");
        int idadeUsuario = sc.nextInt();

        System.out.println("\n=== DADOS INFORMADOS ===");
        System.out.println("Nome: " + nomeUsuario);
        System.out.println("Idade: " + idadeUsuario + " anos");

        System.out.println("\nCadastro realizado com sucesso!");
    }
}
