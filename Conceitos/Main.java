import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Digite seu Nome: ");
        String nome = scanner.nextLine();
        
        System.out.println("Digite sua Idade: ");
        int idade = scanner.nextInt();
       
        System.out.println("Digite Sua Altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Seu Nome: " + nome);
        System.out.println("Sua Idade: " + idade);
        System.out.println("Sua Altura: " + altura);
        scanner.close();
    }
}