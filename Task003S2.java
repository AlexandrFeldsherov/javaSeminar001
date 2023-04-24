// 3) Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
import java.util.Arrays;

public class Task003S2 {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 6, -7, 23, 55, 123};
        System.out.println(Arrays.toString(arr));
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] / 10 != 0 && arr[i] / 100 == 0) {
                sum += i;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = sum;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
