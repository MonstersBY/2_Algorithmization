package by.learn.matrix;

import java.util.Random;

public class SevenMatrix {
    public static void main(String[] args){
        System.out.println("Сформировать квадратную матрицу порядка N по правилу A[I,J]=sin((I^2-J^2)/N) " +
                "и подсчитать количество положительных элементов в ней");
        Random random = new Random();
        int n= 6;
        int sum=0;
        System.out.println("N= "+n);
        double arr[][]=new double[n][n];
        for(int i=0; i<n;i++){
            for (int j=0;j<n;j++) {
                arr[i][j]= Math.sin((i*i - j*j)/n);
                if(arr[i][j]>0)
                    sum++;
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("количество положительных элементов: "+sum);
    }
}
