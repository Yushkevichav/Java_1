//5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.

package yushkevich.lesson_1.homework;

public class Part4_var2 {
    public static void main(String[] args) {
        checkOne();
        if (checkOne() >= 0) {                             //задал условие: если number >= 0, то выводим "Число положительное"
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");     //задал условие: во всех остальных случаях выводим "Число отрицательное"
        }
    }

    private static int checkOne() {
        int a = 1;
        return (a);                                        //возвращаю значение переменной а в main
    }
}
