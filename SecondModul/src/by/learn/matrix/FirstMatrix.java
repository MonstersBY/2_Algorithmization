package by.learn.matrix;

import java.util.Random;

public class FirstMatrix {
    public static void main(String[] args){
        System.out.println("Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего");
        Random random = new Random();
        int m= 5;
        int n= 10;
        System.out.println("M= " + m+"; N= "+n);
        int arr[][]=new int[m][n];
        for(int i=0; i<m;i++) {
            for (int j=0;j<n;j++){
                arr[i][j]= random.nextInt(10);
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Столбцы");
        for(int i=0; i<m;i++) {
            for (int j=0; j<n; j+=2){
                if (arr[0][j]>arr[m-1][j]){
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }

    }
}
