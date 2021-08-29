package by.learn.matrix;

import java.util.Random;

public class ElevenMatrix {
    public static void main(String[] args){
        System.out.println("Матрицу 10x20 заполнить случайными числами от 0 до 15. " +
                "Вывести на экран саму матрицу и номера строк, в которых число 5 встречается три и более раз");
        Random random = new Random();
        int m= 10;
        int n= 20;
        int count[]=new int[m];
        System.out.println("M= " + m+"; N= "+n);
        int arr[][]=new int[m][n];
        for(int i=0; i<m;i++) {
            for (int j=0;j<n;j++){
                arr[i][j]= random.nextInt(16);
                if (arr[i][j]<10){
                    System.out.print(" "+arr[i][j]+" ");
                }else System.out.print(arr[i][j]+" ");

                if (arr[i][j]==5){
                    count[i]++;
                }
            }
            System.out.println();
        }


        System.out.println("Строки");
        for(int i=0; i<m;i++) {
            if (count[i]>=3){
                System.out.print(i+1+". ");
                for (int j=0; j<n; j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }

        }

    }
}
