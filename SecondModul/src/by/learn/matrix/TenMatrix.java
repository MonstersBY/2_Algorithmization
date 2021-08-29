package by.learn.matrix;

import java.util.Random;

public class TenMatrix {
    public static void main(String[] args){
        System.out.println("Найти положительные элементы главной диагонали квадратной матрицы");
        Random random = new Random();
        int n= 10;
        System.out.println("N= "+n);
        int arr[][]=new int[n][n];
        for(int i=0; i<n;i++) {
            for (int j=0;j<n;j++){
                arr[i][j]= (random.nextInt(19)-9);
                if (arr[i][j]>=0){
                    System.out.print(" "+arr[i][j]+" ");
                }else System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }
        int sum=0;

        for(int i=0; i<n;i++)
            if (arr[i][i]>0)
                sum+=arr[i][i];
        System.out.print("сумма главной диагонали:= "+sum);
    }
}
