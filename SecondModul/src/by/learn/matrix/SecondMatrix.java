package by.learn.matrix;

import java.util.Random;

public class SecondMatrix {
    public static void main(String[] args){
        System.out.println("Дана квадратная матрица. Вывести на экран элементы стоящие на диагонали");
        Random random = new Random();
        int n= 5;
        System.out.println("N= "+n);
        int arr[][]=new int[n][n];
        for(int i=0; i<n;i++) {
            for (int j=0;j<n;j++){
                arr[i][j]= random.nextInt(10);
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.print("Главная диагональ:  ");
        for(int i=0; i<n;i++) {
            System.out.print(arr[i][i]+" ");
        }
        System.out.println();
        System.out.print("Побочная диагональ: ");
        for(int i=0; i<n;i++) {
            System.out.print(arr[n-i-1][i]+" ");
        }
            System.out.println();
        }

    }
