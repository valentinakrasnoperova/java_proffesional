package homework1.task3;

import java.util.Arrays;
import java.util.Collections;

public class Kata {
    public static Double[] sortItOut(Double[] array) {
        int evenNumber = 0;
        int oddNumber = 0;
        int countEven = 0;
        int countOdd = 0;

        for (Double aDouble : array) {
            if (Math.floor(aDouble) % 2 == 0) {
                evenNumber++;
            } else {
                oddNumber++;
            }
        }
        Double[] even = new Double[evenNumber];
        Double[] odd = new Double[oddNumber];

        for (Double aDouble : array) {

            Math.floor(aDouble);

            if (Math.floor(aDouble) % 2 == 0) {
                even[countEven++] = aDouble;
            } else {
                odd[countOdd++] = aDouble;
            }
        }
        Arrays.sort(even, Collections.reverseOrder());
        Arrays.sort(odd);

        System.arraycopy(odd, 0, array, 0, oddNumber);
        System.arraycopy(even, 0, array, oddNumber, evenNumber);
        return array;
    }
}
