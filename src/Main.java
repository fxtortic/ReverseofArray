import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть кількість елементів масиву:");
        int N = scan.nextInt();
        if (N > 0) {
            int[] numbersArray = new int[N];

            System.out.println("Введіть елементи масиву:");

            for (int i = 0; i < N; i++) {
                numbersArray[i] = scan.nextInt();
            }

            if (N % 2 == 0) {
                System.out.println("Зворотній масивив: ");
                for (int i = N - 1; i >= 0; i--) {
                    System.out.println(numbersArray[i] + " ");
                }
            } else {
                System.out.println("Звичайний масив: ");
                for (int i = 0; i < N; i++) {
                    System.out.println(numbersArray[i] + " ");
                }
            }
        }
        else {
            System.out.println("Ви задили малий розмір масиву.");
        }
    }
}