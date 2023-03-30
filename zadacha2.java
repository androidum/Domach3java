// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка.

package domash3;

import java.util.ArrayList;

public class zadacha2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(8);
        numbers.add(2);
        numbers.add(1);

        int min = numbers.get(0);
        int max = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            int num = numbers.get(i);
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        double average = (double) sum / numbers.size();

        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее арифметическое значение: " + average);
    }
}
