package by.learn.matrix;

import java.util.Random;

public class SixMatrix {
    public static void main(String[] args){
        System.out.println("Сформировать квадратную матрицу порядка n по заданному образцу (n-четное)");
        Random random = new Random();
        int n= 6;
        System.out.println("N= "+n);
        int arr[][]=new int[n][n];
        for(int i=0, x=0; i<n;i++)
            for (int j=x;j<n-x;j++)
                if((i<=j && j+i<n)||(i>=j&& j+i>=n-1))
                    arr[i][j]= 1;


        for(int i=0; i<n;i++) {
            for (int j=0;j<n;j++)
                System.out.print(arr[i][j]+" ");
            System.out.println();
        }
    }
}
