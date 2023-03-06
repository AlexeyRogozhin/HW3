import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int [] xArray = {90, 115, 902, -17, 4, 506, 20, -8, 802, 1, -57, 22, 81, 14, 0, 76};
        boolean sorted = false;
        int value;
        System.out.println("Исходный массив: " + Arrays.toString(xArray));
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < xArray.length - 1; i++) {
                if (xArray[i] > xArray[i + 1]) {
                    sorted = false;
                    value = xArray[i];
                    xArray[i] = xArray[i + 1];
                    xArray[i + 1] = value;


                }

            }
        }
        System.out.println("Сортированный массив: " + Arrays.toString(xArray));
    }
}