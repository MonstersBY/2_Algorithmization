package by.learn.matrix;

import java.util.Random;

public class FifteenMatrix {
    public static void main(String[] args){
        System.out.println("Найти наибольший элемент матрицы и заменить все нечетные элементы на него");
        Random random = new Random();
        int m= 10;
        int n= 10;
        System.out.println("M= " + m+"; N= "+n);
        int arr[][]=new int[m][n];
        for(int i=0; i<m;i++) {
            for (int j=0;j<n;j++){
                arr[i][j] = random.nextInt(100);
            }
        }

        int max=Integer.MIN_VALUE;
        for(int i=0; i<m;i++) {
            for (int j=0;j<n;j++){
                if (max<arr[i][j]){
                    max=arr[i][j];
                }
            }
        }

        for(int i=0; i<m;i++) {
            for (int j=0;j<n;j++){
                if (arr[i][j]%2!=0){
                    arr[i][j]=max;
                }
            }
        }

        for(int i=0; i<m;i++) {
            for (int j=0;j<n;j++){
                if (arr[i][j] < 10) {
                    System.out.print(" " + arr[i][j] + " ");
                } else System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
