package by.learn.matrix;

import java.util.Random;

public class SixteenMatrix {
    public static void main(String[] args){
        System.out.println("Магическим квадратом порядка n называется квадратная матрица размера nxn, " +
                "составленная из чисел 1,2,3,...,n^2 так, что суммы по каждому столбцу," +
                "каждой строке и каждой из двух больших диагоналей равны между собой.Построить такой квадрат.");
        Random random = new Random();
        int n= 6;
        System.out.println("N= "+n);
        if ((n < 1) || (n == 2)) {
            System.out.println("Такой квадрат невозможно построить.");
            System.exit(1);
        }
        int arr[][]=new int[n][n];

        if(n%4==0){// построение четной-четности
            int c1=1,c2=n*n;
            for (int row = 0; row < n; row++) {
                for (int col = 0; col < n; col++) {
                    if (row%4==col%4||(row+col)%4==3){
                        arr[row][col] = c2;
                    }else{
                        arr[row][col] = c1;
                    }
                    c2--;
                    c1++;
                }
            }
        }
        else if (n%2==0){// построение четной-нечетности

        } else{//построение не четного
            int num=1;
            int row = 0;
            int col = n / 2;
            while(num<=n*n){
                arr[row][col]=num;
                if (num%n==0){
                    row++;
                }else{
                    row--;
                    col++;
                    if(row==-1) row = n - 1;
                    if(col==n) col = 0;
                }
                num++;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] < 10) {
                    System.out.print(" " + arr[i][j] + " ");
                } else System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

}
