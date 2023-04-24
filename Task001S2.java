// 1) Дана последовательность N целых чисел. Найти сумму простых чисел.
public class Task001S2 {
    public static void main(String[] args) {
        String number = "2,6,7,11,1";
        System.out.println(sumPrimeNumber(number));
    }

    /**
     * Сумма примитивных чисел в строке
     * @param number строка чисел
     * @return сумма чисе
     */
    private static int sumPrimeNumber(String number) {
        String[] arrNumberString = number.split(",");
        int arrNumber;
        int sum = 0;
        for (int i = 0; i < arrNumberString.length; i++) {
            arrNumber = Integer.parseInt(arrNumberString[i]);
            if (primeNumber(arrNumber)) {
                sum += arrNumber;
            }
        }
        return sum;
    }

    /**
     * Определяет примитивное число или нет
     * @param s int
     * @return true or false
     */
    private static boolean primeNumber(int s) {
        boolean j = false;
        if (s == 1) {
            j = true;
        }
        for (int i = 2; i < s; i++) {
            j = (s % i != 0);
            if (!j) {
                break;
            }
        }
        return j;
    }
}
