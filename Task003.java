// Дана последовательность целых чисел, оканчивающаяся нулем. Найти сумму положительных чисел, после которых следует отрицательное число.
// Пример ввода:
// 1 2 1 2 -1 1 3 1 3 -1 0
// Логика расчета:
// 2 -1 переход -> 2 в сумму
// 3 -1 переход -> 3 в сумму
// Пример вывода: 5


import java.util.Scanner;

public class Task003 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int in= 1;
        int value=0;
        int sumAll=0;
        while (in!=0){
            in= scanner.nextInt();
            if (in>0){
                value=in;
            }if (in<0) {
                sumAll+=value;
            }
        }
        System.out.println(sumAll);
    }
}
