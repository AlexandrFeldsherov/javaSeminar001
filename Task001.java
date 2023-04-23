// Cтроки:
// Дана строка. Поменять местами ее половины.
// https://leetcode.com/problems/add-binary/

import java.util.Scanner;

public class Task001 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(reversString(str));
        in.close();
    }

    /**
     * Разворот слов в строке
     *
     * @param str Вводимая строка слов
     * @return строка с словами в обратном порядке
     */
    private static String reversString(String str) {
        str = str.trim();
        str = str.replaceAll("\\s+", " ");
        String[] arrStr = str.split(" ");
        String[] revArrStr = reversArray(arrStr);
        str = String.join(" ", revArrStr);
        return str;

    }

    /**
     * Реверс массива
     *
     * @param arrStr массив строк
     * @return массив строк
     */
    private static String[] reversArray(String[] arrStr) {
        String[] arr = new String[arrStr.length];
        for (int i = 0; i < arrStr.length; i++) {
            arr[i] = arrStr[arr.length - 1 - i];
        }
        return arr;
    }
}
