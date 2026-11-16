import java.util.Scanner;

Scanner sc = new Scanner(System.in);


System.out.println("Digite a temperatura: ");
double temperaturaC = sc.nextDouble();

double temperaturaF = (temperaturaC * 1.8 + 32);


System.out.println("Resultado: " + temperaturaF);

}
