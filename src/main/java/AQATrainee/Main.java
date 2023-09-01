package AQATrainee;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Solution solution = new Solution();

        System.out.println("Task №1: Введите число");
        int n = solution.checkInt(sc);
        solution.input(n);

        System.out.println("Task №2: Введите имя");
        String s = solution.checkString(sc);
        solution.input(s);

        System.out.println("Task №3: Введите последовательность чисел через запятую");
        int[] arr = solution.checkArr(sc);
        solution.input(arr);

        sc.close();
    }

}
