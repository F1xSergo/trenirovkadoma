package edu.trenirovkadoma.Exception;
//        Написать код который у пользователя через консоль попросит ввести число от 1 до 10 и напечатать его в консоль.
//        В случае если пользователь введёт число не из этого диапазона вывести сообщение что нужно повторить попытку.
//        Всего у пользователя 3 попытки ввести верное число. Предусмотреть возможность того что пользователь введёт не
//        число а какой-то текст. В этом случае необходимо выдать сообщение что текст не допустим и предоставить новую попытку.
import java.util.Scanner;

public class ExceptionMain {
    public static void main(String[] args) {
        int count = 3;
        int x = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Пожауйста, введите число от 1 до 10. У вас " + count + " попытки");

        while (true) {
            if (count < 1) {
                System.out.println("Попыток больше нет");
            }
            try {
                x = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Вы ввели не число.У вас " + count + " попытки");
                count--;
                continue;
            }

            if (x < 1 || x > 10) {
                String a = " введите число от 1 до 10. У вас " + count +  " попытки";
                try {
                    throw new Exception(a);
                } catch (Exception e) {
                    System.out.println(a);
                    count--;
                    continue;
                }
            }
            System.out.println(" Вы ввели правильное число " + x);
            break;
        }
    }
}








