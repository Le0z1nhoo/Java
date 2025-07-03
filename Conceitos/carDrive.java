import java.util.Scanner;


public class carDrive{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Voce Tem quantos Anos? ");
        int age = scanner.nextInt();
        System.out.println("Voce é Emancipado? ");
        boolean isEmancipated = scanner.nextBoolean();
        var iscarDrive = age >=18 || isEmancipated && age >= 16;
        System.out.printf("Voce pode Dirigir? (%s)\n", iscarDrive);
    }
}