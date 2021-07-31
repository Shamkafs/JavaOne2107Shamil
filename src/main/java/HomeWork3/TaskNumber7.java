package HomeWork3;

public class TaskNumber7 {

    public static void main(String[] args) {
        int[] sum = {2, 3, 1, 5, 1};
        System.out.println(sumLeftRight(sum));
    }

    public static boolean sumLeftRight(int[] sum) {

        int sumL = 0;
        int sumR = 0;
        boolean checkBalance = false;
        for (int i = 0; i < sum.length; i++) {
            for (int j = sum.length - 1; j >= 0; j--) {
                if (sumR < sumL) {
                    sumR = sum[sum.length - 1] + sumR;
                } else {
                    sumL = sum[i] + sumL;
                }
            }
            if (sumL == sumR) {
                checkBalance = true;
            }
        }
        return checkBalance;
    }
}