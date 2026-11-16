import java.util.Scanner;
public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Conversor de temperatura ===");

        System.out.print("Digite a temperatura em Celsius: ");
        double temperaturaC = sc.nextDouble();

        double temperaturaF = (temperaturaC * 1.8) + 32;

        System.out.println("\n=== Resultado ===");
        System.out.println(temperaturaC + "°C equivale a " + temperaturaF + "°F.");

        sc.close();
    }
}
