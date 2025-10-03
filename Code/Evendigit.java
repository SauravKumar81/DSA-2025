package BinarySearch;

public class Evendigit {
    public static void main(String[] args) {
        int[] nums = { 12, 33, 50, 62, 57, 88 };
        System.out.println(countEvenDigitNumbers(nums));

    }

    static int countEvenDigitNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {

            if (hasEvendigit(num)) {
                count++;
            }
        }
        return count;
    }

    static boolean hasEvendigit(int num) {
        int digit = 0;
        while (num > 0) {
            digit++;
            num /= 10;

        }
        return digit % 2 == 0;
    }
}
