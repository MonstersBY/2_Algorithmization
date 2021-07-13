package by.learn.matrix;

import java.util.Random;

public class FourMatrix {
    public static void main(String[] args){
        System.out.println("Сформировать квадратную матрицу порядка n по заданному образцу (n-четное)");
        Random random = new Random();
        int n= 6;
        System.out.println("N= "+n);
        int arr[][]=new int[n][n];
        for(int i=0; i<n;i++) {
            for (int j=0;j<n;j++){
                if (i%2==0){
                    arr[i][j]= j+1;
                }else arr[i][j]= n-j;
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
