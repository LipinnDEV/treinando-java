import java.util.Scanner;
public class ControleGastos {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo;
        double gasto;
        double totalGastos = 0;

        System.out.println("================================");
        System.out.println("       CONTROLE DE GASTOS");
        System.out.println("================================");

        do {
            System.out.print("Digite seu saldo inicial: R$ ");
            saldo = scanner.nextDouble();

            if (saldo < 0) {
                System.out.println("O saldo não pode ser negativo!");
            }

        } while (saldo < 0);

        int quantidadeGastos;

        do {
            System.out.print("\nQuantos gastos deseja registrar? ");
            quantidadeGastos = scanner.nextInt();

            if (quantidadeGastos <= 0) {
                System.out.println("Digite uma quantidade maior que zero!");
            }

        } while (quantidadeGastos <= 0);

        System.out.println("\n===== REGISTRO DE GASTOS =====");

        for (int i = 1; i <= quantidadeGastos; i++) {

            do {
                System.out.print("Digite o valor do gasto " + i + ": R$ ");
                gasto = scanner.nextDouble();

                if (gasto < 0) {
                    System.out.println("O gasto não pode ser negativo!");
                }

            } while (gasto < 0);

            totalGastos += gasto;

            System.out.println("Gasto registrado com sucesso!");
        }

        double saldoFinal = saldo - totalGastos;

        System.out.println("\n================================");
        System.out.println("          RESULTADO");
        System.out.println("================================");

        System.out.printf("Saldo inicial: R$ %.2f%n", saldo);
        System.out.printf("Total de gastos: R$ %.2f%n", totalGastos);
        System.out.printf("Saldo restante: R$ %.2f%n", saldoFinal);

        System.out.println("\n===== SITUAÇÃO FINANCEIRA =====");

        if (saldoFinal > 0) {
            System.out.println("Você está dentro do orçamento!");
        } else if (saldoFinal == 0) {
            System.out.println("Atenção! Você utilizou todo o seu saldo.");
        } else {
            System.out.printf(
                "Você ultrapassou seu orçamento em R$ %.2f%n",
                Math.abs(saldoFinal)
            );
        }

        System.out.println("\nObrigado por utilizar o Controle de Gastos!");

        scanner.close();
    }
}
