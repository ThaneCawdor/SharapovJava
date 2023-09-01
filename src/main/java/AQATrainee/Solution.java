package AQATrainee;

import java.util.Scanner;

public class Solution {

    public void input(int n) {
        if (n > 7) {
            System.out.println("Привет");
        }
    }

    public void input(String s) {
        if (s.equals("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }

    public void input(int[] arr) {
        for (int i : arr) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }


    public String checkString(Scanner sc) {
        String x;
        while (!sc.hasNext("[а-яА-Я]+")) {
            System.out.println("Неверный тип данных, введите имя");
            sc.nextLine();
        }
        x = sc.next();
        return x;
    }

    public int checkInt(Scanner sc) {
        int x;
        while (!sc.hasNextInt()) {
            System.out.println("Неверный тип данных, введите число");
            sc.nextLine();
        }
        x = sc.nextInt();
        return x;
    }

    public int[] checkArr(Scanner sc) {
        String str = sc.next();
        String[] st = str.split(",");
        int[] array = new int[st.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(st[i]);
        }

        return array;
    }
}
