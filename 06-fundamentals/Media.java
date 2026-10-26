import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        atividade4();
    }

    public static void atividade4() {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Média Escolar ===");

        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = sc.nextDouble();

        if (nota1 < 0 || nota1 > 10 ||
            nota2 < 0 || nota2 > 10 ||
            nota3 < 0 || nota3 > 10) {

            System.out.println("Erro: as notas devem estar entre 0 e 10.");

        } else {
            double media = (nota1 + nota2 + nota3) / 3;

            System.out.printf("Sua média é: %.2f%n", media);

            if (media >= 7) {
                System.out.println("Parabéns! Você foi aprovado.");
            } else {
                System.out.println("Você foi reprovado. Continue estudando!");
            }
        }

        sc.close();
    }
}
