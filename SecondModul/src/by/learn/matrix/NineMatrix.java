package by.learn.matrix;

import java.util.Random;

public class NineMatrix {
    public static void main(String[] args){
        System.out.println("Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце" +
                "Определить, какой столбец содержит максимальную сумму");
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


        int max=Integer.MIN_VALUE;
        int max_i=0;
        for (int i=0, sum=0; i<n;i++){
            for (int j=0;j<m;j++){
                sum+=arr[j][i];
            }
            System.out.println("сумму элементов в столбце "+(i+1)+" := "+ sum);
            if (max<sum){
                max_i=i+1;
                max=sum;
            }
            sum=0;
        }
        System.out.println("максимальная сумму в столбце "+max_i+" := "+ max);
    }
}
