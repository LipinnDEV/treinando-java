import java.util.Scanner;
public class Cadastro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Cadastro pessoal ===");

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite sua cidade: ");
        String cidade = sc.nextLine();

        System.out.print("Digite sua profissão: ");
        String profissao = sc.nextLine();

        System.out.println("\n=== Suas informações ===");
        System.out.println("Olá! Meu nome é " + nome + ".");
        System.out.println("Tenho " + idade + " anos.");
        System.out.println("Moro em " + cidade + ".");
        System.out.println("Minha profissão é " + profissao + ".");

        sc.close();
    }
}
