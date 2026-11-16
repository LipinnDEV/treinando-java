import java.util.Scanner;
Scanner sc = new Scanner(System.in);


int numero1 = sc.nextInt();
int numero2 = sc.nextInt();
sc.nextLine();



System.out.println("A soma do " + numero1 + "mais o " + numero2 + "sera de: " + (numero1 + numero2));
System.out.println("A subtraçao do " + numero1 + "mais o " + numero2 + "sera de: " + (numero1 - numero2));
System.out.println("A multiplicacao do " + numero1 + "mais o " + numero2 + "sera de: " + (numero1 * numero2));
System.out.println("A divisao do " + numero1 + "mais o " + numero2 + "sera de: " + (numero1 / numero2));
double resultado = (double) numero1 / numero2;

}
//  OBS: em relacao a divisao, se eu dividir numero inteiro por numero inteiro vai me retornar um numero inteiro ou seja eu teria que criar outro double ???
por exemplo: em baixo da divisao eu colocaria 
double resultado = sc.nextDouble();
