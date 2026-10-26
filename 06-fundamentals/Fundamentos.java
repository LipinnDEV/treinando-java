import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
// atividade1
        String nome = "felipe";
        int idade = 18;
        String linguagem = "java";

        System.out.println("nome: " + nome);
        System.out.println("idade: " + idade);
        System.out.println("Estou aprendendo " + linguagem);

// atividade2
        int a = 10;
        int b = 5;

        System.out.println("Soma: " + (a + b));
        System.out.println("Subtracao: " + (a - b));
        System.out.println("Multiplicacao: " + (a * b));
        System.out.println("Divisao: " + (a / b));


// atividade3
                Scanner sc = new Scanner(System.in);

        System.out.println("Qual seu nome: ");
        String nomeusuario = sc.nextLine();

        System.out.println("Qual sua idade: ");
        int idadeusuario = sc.nextInt();

        sc.close();
    }
}
