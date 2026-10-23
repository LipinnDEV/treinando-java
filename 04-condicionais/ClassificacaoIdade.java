import java.util.Scanner;

public class ClassificacaoIdade {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt();

        if (idade <= 12) {
            System.out.println("Crianca");
        } else if (idade <= 17) {
            System.out.println("Adolescente");
        } else if (idade <= 59) {
            System.out.println("Adulto");
        } else {
            System.out.println("Idoso");
        }

        entrada.close();
    }
}
