import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        atividade4();

    }
    public static void atividade4() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a nota 1: ");
        double nota1 = sc.nextDouble();
        System.out.println("Insira a nota 2: ");
        double nota2 = sc.nextDouble();
        System.out.println("Insira a nota 3: ");
        double nota3 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;
        System.out.println("Sua média é de: " + media);

        if (media >= 7) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }
    }
}
