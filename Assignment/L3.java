package Assignment;

public class L3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 500; i++) {
            int temp = i;
            int sum = 0;

            while (temp != 0) {
                int rem = temp % 10;
                sum += Math.pow(rem, 3);
                temp /= 10;
            }

            if (sum == i) {
                System.out.println(i);
            }
        }
    }
}
