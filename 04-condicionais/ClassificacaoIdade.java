import java.util.Scanner;
public class ClassificacaoIdade {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("=== CLASSIFICAÇÃO POR IDADE ===");

        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt();

        if (idade < 0) {
            System.out.println("Idade inválida! Digite uma idade igual ou maior que zero.");
        } else if (idade <= 12) {
            System.out.println("Você é uma criança.");
        } else if (idade <= 17) {
            System.out.println("Você é um adolescente.");
        } else if (idade <= 59) {
            System.out.println("Você é um adulto.");
        } else {
            System.out.println("Você é um idoso.");
        }

        entrada.close();
    }
}
