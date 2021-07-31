package HomeWork3;

import java.util.Arrays;

public class HomeWork3 {

    public static void main(String[] args) {

        System.out.println("Задание 1:");
        int[] FromOneToZeroFromZeroToOne = new int[]{1, 0, 0, 1, 1, 0, 1};
        System.out.println(Arrays.toString(FromOneToZeroFromZeroToOne));
        for (int i = 0; i < FromOneToZeroFromZeroToOne.length; i++) {
            switch (FromOneToZeroFromZeroToOne[i]) {
                case 0: {
                    FromOneToZeroFromZeroToOne[i] = 1;
                    break;
                }
                case 1: {
                    FromOneToZeroFromZeroToOne[i] = 0;
                    break;
                }
            }

        }
        System.out.println(Arrays.toString(FromOneToZeroFromZeroToOne));


        System.out.println("Задание 2:");
        int[] arraysHundred = new int[100];
        for (int i = 0; i < arraysHundred.length; i++)
            arraysHundred[i] = i + 1;
        System.out.println(Arrays.toString(arraysHundred));


        System.out.println("Задание 3:");
        int[] cycleMultiplications = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < cycleMultiplications.length; i++) {
            if (cycleMultiplications[i] < 6) {
                cycleMultiplications[i] = cycleMultiplications[i] * 2;
            }
        }
        System.out.println(Arrays.toString(cycleMultiplications));


        System.out.println("Задание 4:");
        int[][] arraySquare = new int[10][10];
        for (int i = 0; i < arraySquare.length; i++) {
          for (int j = 0; j < arraySquare[i].length; j++) {
              if ((i - j == 0) || (i + j == arraySquare[i].length - 1)) {
                  arraySquare[i][j] = 1;
              }
              System.out.print(arraySquare[i][j] +" ");
          }
          System.out.println();
        }


        System.out.println("Задание 6:");
        int[] maxAndMin = {5,4,3,6,1,5,1,14,7,2};
        System.out.println(Arrays.toString(maxAndMin));
        int max = maxAndMin[0];
        for (int i = 0; i < maxAndMin.length; i++) {
            if (maxAndMin[i] > max) {
                max = maxAndMin[i];
            }
        }
        int min = maxAndMin[0];
        for (int i = 0; i < maxAndMin.length; i++) {
            if (maxAndMin[i] < min) {
                min = maxAndMin[i];
            }
        }
        System.out.println("Максимальное значение:" + max);
        System.out.println("Минимальное значение:" + min);



        System.out.println("Задание 5:");
        System.out.println(Arrays.toString(arrayReturn(7, 10)));
    }
    public static int[] arrayReturn(int len, int initialValue) {
        int arrRet[] = new int [len];
        Arrays.fill(arrRet, initialValue);
        return arrRet;
    }
}
