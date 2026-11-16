import java.util.Scanner;
Scanner sc = new Scanner(System.in);

System.out.println("Digite seu nome: ");
String nome = sc.nextLine();

System.out.println("Digite sua idade: ");
int idade = sc.nextInt();
sc.nextLine();


System.out.println("Digite sua cidade: ");
String cidade = sc.nextLine();

System.out.println("Digite sua profissão: ");
String profissão = sc.nextLine();


System.out.println("Olá! meu nome é " + nome);
System.out.println("Tenho " + idade + " anos");
System.out.println("moro em " + cidade);
System.out.println("Minha profissão é " + profissão);


}
