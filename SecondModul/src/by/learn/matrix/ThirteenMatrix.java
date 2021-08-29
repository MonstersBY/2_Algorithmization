package by.learn.matrix;

import java.util.Random;

public class ThirteenMatrix {
    public static void main(String[] args) {
        System.out.println("Отсортировать столбцы матрицы по возрастанию и убыванию значенией элементов ");
        Random random = new Random();
        int m = 10;
        int n = 20;
        System.out.println("M= " + m + "; N= " + n);
        int arr[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = random.nextInt(16);
                if (arr[i][j] < 10) {
                    System.out.print(" " + arr[i][j] + " ");
                } else System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int num;
        for (int p = 0; p < n; p++) {
            for (int i = 0; i < m - 1; i++) {
                for (int j = 0; j < m - i - 1; j++) {
                    if (arr[j][p] > arr[j + 1][p]) {
                        num = arr[j][p];
                        arr[j][p] = arr[j + 1][p];
                        arr[j + 1][p] = num;
                    }
                }
            }
        }

        System.out.println("Отсортированная по возрастанию");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] < 10) {
                    System.out.print(" " + arr[i][j] + " ");
                } else System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        for (int p = 0; p < n; p++) {
            for (int i = 0; i < m - 1; i++) {
                for (int j = 0; j < m - i - 1; j++) {
                    if (arr[j][p] < arr[j + 1][p]) {
                        num = arr[j][p];
                        arr[j][p] = arr[j + 1][p];
                        arr[j + 1][p] = num;
                    }
                }
            }
        }

        System.out.println("Отсортированная по убыванию");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] < 10) {
                    System.out.print(" " + arr[i][j] + " ");
                } else System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
