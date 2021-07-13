package by.learn.matrix;

import java.util.Random;
import java.util.Scanner;

public class EightMatrix {
    public static void main(String[] args){
        System.out.println("В числовой матрице поменять местами два столбца любых столбца," +
                "т.е. все элементы одного столбца поставить на соответствующие им позиции другого," +
                "а его элементы второго переместить в первый. Номера столбцов вводит пользователь с клавиатуры");
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

        System.out.println("Введите первый столбец: ");
        int a=in.nextInt();
        System.out.println("Введите второй столбец: ");
        int b=in.nextInt();
        System.out.println();
        int x=0;
        for (int i=0; i<m;i++){
            x=arr[i][a-1];
            arr[i][a-1]=arr[i][b-1];
            arr[i][b-1]=x;
        }

        for(int i=0; i<m;i++) {
            for (int j=0;j<n;j++)
                System.out.print(arr[i][j]+" ");
            System.out.println();
        }
    }
}
