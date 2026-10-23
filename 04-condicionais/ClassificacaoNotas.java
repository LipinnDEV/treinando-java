import java.util.Scanner;

public class ClassificacaoNotas {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite sua nota: ");
        double nota = entrada.nextDouble();

        if (nota < 0 || nota > 10) {
            System.out.println("Nota invalida!");
        } else if (nota >= 9) {
            System.out.println("Excelente!");
        } else if (nota >= 7) {
            System.out.println("Bom!");
        } else if (nota >= 5) {
            System.out.println("Recuperacao.");
        } else {
            System.out.println("Reprovado.");
        }

        entrada.close();
    }
}
