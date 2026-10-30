import java.util.Scanner;
public class ControleGastos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double saldo;
        double gasto;
        double totalGastos = 0;

        System.out.println("===== CONTROLE DE GASTOS =====");

        System.out.print("Digite seu saldo inicial: R$ ");
        saldo = scanner.nextDouble();

        for (int i = 1; i <= 3; i++) {

            System.out.print("Digite o valor do gasto " + i + ": R$ ");
            gasto = scanner.nextDouble();

            totalGastos += gasto;
        }

        double saldoFinal = saldo - totalGastos;

        System.out.println("\n===== RESULTADO =====");
        System.out.println("Saldo inicial: R$ " + saldo);
        System.out.println("Total de gastos: R$ " + totalGastos);
        System.out.println("Saldo restante: R$ " + saldoFinal);

        if (saldoFinal >= 0) {
            System.out.println("Você está dentro do orçamento!");
        } else {
            System.out.println("Atenção! Você gastou mais do que tinha.");
        }

        scanner.close();
    }
}
