package HomeWork2;

public class HomeWork2 {

    public static void main(String[] args) {
        System.out.println(sum(5,15));
        polOrOtr(-8);
        System.out.println(ret(-1));
        strInt("Привет Евгений!", 5);
        System.out.println(year(2021));
    }

    public static boolean sum(int a, int b) {
        return (a + b >= 10) && (a + b <= 20);
    }

    public static void polOrOtr (int c) {
        if (c < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число положительное");
        }
    }

    public static boolean ret (int d) {
        return (d < 0);
    }

    public static void strInt(String e, int k) {
        for (int j = 1; j <= k; j++){
            System.out.println(e);
        }
    }

    public static boolean year(int i) {
        return ((i % 4 == 0) && ((i % 100 != 0) || (i % 400 == 0)));
    }
}
