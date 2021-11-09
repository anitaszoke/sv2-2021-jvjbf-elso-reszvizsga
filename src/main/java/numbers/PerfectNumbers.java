package numbers;

public class PerfectNumbers {

    public boolean isPerfectNumber(int number) {
        int sumNumber = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sumNumber = sumNumber + i;
            }
        }
        if (sumNumber == number) {
            return true;
        } else {
            return false;
        }
    }
}
