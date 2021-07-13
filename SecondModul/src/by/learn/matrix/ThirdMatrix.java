package by.learn.matrix;

import java.util.Random;
import java.util.Scanner;

public class ThirdMatrix {
    public static void main(String[] args){
        System.out.println("Дана матрица. Вывести k-ю строку и p-й столбец матрицы");
        Random random = new Random();
        Scanner in = new Scanner(System.in);
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

        System.out.println("Введите k-ю строку: ");
        int k=in.nextInt();
        if (k<=m){
            System.out.print("k-ю строка: ");
            for(int i=0; i<n;i++) System.out.print(arr[k-1][i]+" ");
        }else System.out.print("Такого строки нету");

        System.out.println();
        System.out.println("Введите p-й столбец: ");
        int p=in.nextInt();
        if (k<=m){
            System.out.println("p-й столбец: ");
            for(int i=0; i<m;i++) System.out.println(arr[i][p-1]+" ");
        }else System.out.print("Такого столбца нету");


        }


    }
