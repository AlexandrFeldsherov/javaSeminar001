// Массивы:
// Дан массив целых чисел. Верно ли, что массив является симметричным.

import java.util.Arrays;

public class Task002 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 2, 1};// todo реализовать пользовательский ввод
        int[] revArr = reversArrayInt(arr);
        if (Arrays.equals(revArr, arr)) {
            System.out.println("Массив симметричный");
        } else {
            System.out.println("Массив не симметричный");
        }

    }

    /**
     * Реверс массива чисел
     *
     * @param arr массив чисел
     * @return развернутый массив чисел
     */
    private static int[] reversArrayInt(int[] arr) {
        int[] revArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            revArr[i] = arr[arr.length - 1 - i];
        }
        return revArr;
    }
}

