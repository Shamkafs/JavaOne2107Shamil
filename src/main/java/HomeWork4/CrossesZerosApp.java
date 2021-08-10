package HomeWork4;

import java.util.Random;
import java.util.Scanner;

public class CrossesZerosApp {

    public static char[][] map;
    public static final int SIZE = 3;
    public static final char EMPTY_DOT = '*';
    public static final char DOT_X = 'X';
    public static final char DOT_0 = '0';
    public static final Scanner SCANNER = new Scanner(System.in);
    public static final Random RANDOM = new Random();
    public static final char DOTS_TO_WIN = 3;


    public static void main(String[] args) {
        initializationMap();
        printMap();
        while (true) {
            humanStep();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Вы одержали победу");
                break;
            }
            if (mapFull()) {
                System.out.println("Ничья");
                break;
            }

            computerStep();
            printMap();
            if (checkWin(DOT_0)) {
                System.out.println("Компьютер одержал победу");
                break;
            }
            if (mapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
    }

    public static void initializationMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++){
            for (int j = 0; j < SIZE; j++){
                map[i][j] = EMPTY_DOT;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i <= SIZE; i++){
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < SIZE; i++ ){
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++){
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void humanStep() {
        int x;
        int y;
        do {
            System.out.println("Ваш ход");
            System.out.println("Введите координаты в формате X Y");
            x = SCANNER.nextInt() - 1;
            y = SCANNER.nextInt() - 1;
        } while (!cellValid(x, y));
        map[x][y] = DOT_X;
    }

    public static boolean cellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            return false;
        }
        return map[x][y] == EMPTY_DOT;
    }

    public static void computerStep() {
        int x;
        int y;
        do {
            x = RANDOM.nextInt(SIZE);
            y = RANDOM.nextInt(SIZE);
        } while (!cellValid(x, y));
        System.out.printf("Компьютер ходит в точку %d %d", x + 1, y + 1);
        System.out.println();
        map[x][y] = DOT_0;
    }

    public static boolean mapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == EMPTY_DOT) {
                    return false;
                }
            }
        }
        return true;
    }

    /*public static boolean checkWin(char sym) {
        if (map[0][0] == sym && map[0][1] == sym && map[0][2] == sym) {
            return true;
        }
        if (map[1][0] == sym && map[1][1] == sym && map[1][2] == sym) {
            return true;
        }
        if (map[2][0] == sym && map[2][1] == sym && map[2][2] == sym) {
            return true;
        }
        if (map[0][0] == sym && map[1][0] == sym && map[2][0] == sym) {
            return true;
        }
        if (map[0][1] == sym && map[1][1] == sym && map[2][1] == sym) {
            return true;
        }
        if (map[0][2] == sym && map[1][2] == sym && map[2][2] == sym) {
            return true;
        }
        if (map[0][0] == sym && map[1][1] == sym && map[2][2] == sym) {
            return true;
        }
        if (map[0][2] == sym && map[1][1] == sym && map[2][0] == sym) {
            return true;
        }
        return false;
    }*/

    public static boolean checkLine(int startX, int startY, int dx, int dy, char symbol) {
        for (int i = 0; i < SIZE; i++) {
            if (map[startX + i * dx][startY + i * dy] != symbol) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkWin(char symbol) {
        for (int i = 0; i < SIZE; i++) {
            //Проверяем строки
            if (checkLine(i, 0, 0, 1, symbol)) {
                return true;
            }
            //Проверяем столбцы
            if (checkLine(0, i, 1, 0, symbol)) {
                return true;
            }
        }
        //Проверяем диагонали
        if (checkLine(0, 0, 1, 1, symbol)) {
            return true;
        }
        if (checkLine(0, SIZE - 1, 1, -1, symbol)) {
            return true;
        }
        return false;
    }
}
