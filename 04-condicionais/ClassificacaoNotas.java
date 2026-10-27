import java.util.Scanner;
public class ClassificacaoNotas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("=== CLASSIFICAÇÃO DE NOTAS ===");
        System.out.print("Digite sua nota de 0 a 10: ");
        double nota = entrada.nextDouble();

        if (nota < 0 || nota > 10) {
            System.out.println("Nota inválida! Digite um valor entre 0 e 10.");
        } else if (nota >= 9) {
            System.out.println("Excelente! Você teve um ótimo desempenho.");
        } else if (nota >= 7) {
            System.out.println("Bom trabalho! Você alcançou uma boa nota.");
        } else if (nota >= 5) {
            System.out.println("Você ficou de recuperação. Continue estudando!");
        } else {
            System.out.println("Você foi reprovado. Não desista de melhorar!");
        }

        entrada.close();
    }
}
