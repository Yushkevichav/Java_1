//задание 5
package yushkevich.lesson_1.homework;

import java.util.Scanner;

public class Part4_var1 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        checkOne();
    }

    private static void checkOne() {
        Scanner check = new Scanner(System.in);
        int number = check.nextInt();
        if (number >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
        check.close();
    }
}
