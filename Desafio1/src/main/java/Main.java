import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int number = scanner.nextInt();

        while(number >= 10) {
            int sum = 0;
            int n = number;

            while(n > 0) {
                sum += n % 10;
                n /= 10;
            }

            number = sum;
        }

        System.out.println("Resultado final: " + number);
    }
}
