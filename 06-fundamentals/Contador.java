public class Main {
    public static void main(String[] args) {
        int contador = 0;
        int soma = 0;

        for (int i = 1; i <= 5; i++) {
            contador++;
            soma += i;
        }

        System.out.println("Quantidade: " + contador);
        System.out.println("Soma: " + soma);
    }
}
