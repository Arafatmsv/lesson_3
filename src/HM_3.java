import java.util.Arrays;

public class HM_3 {
    public static void main(String[] args) {
        /*1. Создать массив дробных (не целых) чисел размером 15 элементов
        и наполнить его положительными и отрицательными числами,
        первые 2 числа в массиве должны быть положительными;*/

        float[] list = {2.3f, 0.5f, 12.7f, -34.44f, -21.222f, 2.45f, 21.5f, 11.11f, -0.3f, 0.56f, -8.23f, 2.22222f};

        /*2. Затем через 1 цикл “for each” посчитать среднее арифметическое положительных чисел,
        расположенных после первого отрицательного числа и вывести его на экран
        (8, -2, -4, 2, 3, 6, -7) =  11/3*/

        float sum = 0;
        int counter = 0;
        int index = 0;

        for (int i = 0; i < list.length; i++) {
            if (list[i] < 0) {
                index = i;
                break;
            }
        }

        for (float nums : Arrays.copyOfRange(list, index, list.length)) {
            if (nums > 0) {
                System.out.println(nums);
                sum += nums;
                counter ++;
            }
        }

        System.out.println("Среднее-арифметическое: " + (sum / counter));
    }
}
