// 2) Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.
public class Task002S2 {
    public static void main(String[] args) {
        String number = "2,6,3,7,11";
        sequenceIncreasing(number);
    }


    private static void sequenceIncreasing(String number) {
        String[] arrNumberString = number.split(",");
        int arrNumber[] = new int[arrNumberString.length];
        for (int i = 0; i < arrNumberString.length; i++) {
            arrNumber[i] = Integer.parseInt(arrNumberString[i]);
        }
        for (int i = 1; i < arrNumber.length; i++) {
            if (arrNumber[i] < arrNumber[i - 1]) {
                System.out.println("Последовательность не возрастающая");
                return;
            }
        }
        System.out.println("Последовательность возрастающая");

    }
}
