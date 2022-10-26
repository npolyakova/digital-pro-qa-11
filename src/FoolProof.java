import java.util.Scanner;

public class FoolProof {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите трехзначное число:");
        int number = sc.nextInt();
        //123 / 10 = 12
        //12 / 10 = 1
        //1 / 10 = 0
        //0 / 10 = 0
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
}
