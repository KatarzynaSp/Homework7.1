import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int i = 0;
        int[] numbers = new int[5];
        do {
            System.out.println("Wprowadź liczbę");
            numbers[i] = input.nextInt();
            input.nextLine();
            i++;
        } while (i < 5);
        input.close();

        int sum = (numbers[0] + numbers[2] + numbers[4]);
        System.out.println("Suma pierwszej, trzeciej i piątej liczby wynosi: " + sum);
    }
}