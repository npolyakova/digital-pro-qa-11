import java.util.InputMismatchException;
import java.util.Scanner;

public class FullResult {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите трехзначное число:");
        int number;

        try {
            number = sc.nextInt();

            int count = 1;
            int operationNumber = number;
            while (operationNumber/10 > 0) {
                count++;
                operationNumber /= 10;
            }

            if(count != 3) {
                System.out.println("Нужно ввести трехзначное число. Попробуйте ещё раз");
                System.out.println("Количество цифр в числе: " + count);
            } else {
                System.out.println("Введенное число: " + number);
            }
        }
        catch (InputMismatchException e){
            System.out.println("Введено не число. Попробуйте ещё раз.");
        }
        finally {
            System.out.println("Конец выполнения программы");
        }

    }
}
