import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите трехзначное число:");
        int number;

        try {
            number = sc.nextInt();
            System.out.println(number);
        }
        catch (InputMismatchException e){
            System.out.println("Введено не число. Попробуйте ещё раз.");
        }
        finally {
            System.out.println("Конец выполнения программы");
        }
    }
}
