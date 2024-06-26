package ru.moisei;

public class App
{        public static void main(String[] args) {
    checkSumSign(7,14);
    printNumberSign(0);
    printNumberSign1(0);
    printNumber(5);
    System.out.println(year(2000));
}
    public static void checkSumSign(int a, int b) {  //написать метод проверяющий сумму 2 ух чисел, лежат ли они в пределах от 10 до 20
        int sum = a + b;                             // если лежат в пределах то "true" если нет то "false"
        if (sum >= 10 && sum <= 20) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
    public static void printNumberSign(int number) { //Написать метод проверяющий является число положительным или отрицательным
        if (number >= 0) {
            System.out.println("positive");
        } else {
            System.out.println("negative");
        }
    }
    public static void printNumberSign1(int number) { //Написать метод проверяющий является число положительным "false" или отрицательным "true"
        if (number <= -1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
    public static void printNumber(int a) { //Написать метод, которому строка и число, метод должен
                                               // отпечатать в консоль указанную строку, указанное количество раз;
        for (int i = 0; i < a; i++) {
            System.out.print("Russia ");
        }
        System.out.println();
    }
    public static boolean year(int a) { //Написать метод, который определяет, является ли год високосным
        int b = 4;
        int c = 100;
        int d = 400;
        if (a % b == 0 && a % c != 0 || a % d == 0) {
            return true;
        } else {
            return false;
        }
    }
}