package by.learn.matrix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class FourteenMatrix {
    public static void main(String[] args){
        System.out.println("Сформировать случайную матрицу mxn, состоящую из нулей и единиц," +
                "причем в каждом столбце число единиц равно номеру столбца");
        Random random = new Random();
        int m= random.nextInt(21);
        int n= random.nextInt(21);
        System.out.println("M= " + m+"; N= "+n);
        int arr[][]=new int[m][n];
        if (m>=n){
            for(int i=0; i<m;i++) {
                for (int j=0;j<n;j++){
                    if (j>=i) arr[i][j] = 1;
                    else arr[i][j] = 0;
                }
            }

            ArrayList<Integer> arrList = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arrList.add(arr[j][i]);
                }
                Collections.shuffle(arrList);
                for (int j = 0; j < m; j++) {
                    arr[j][i] = arrList.get(j);
                }
                arrList.clear();
            }

            for(int i=0; i<m;i++) {
                for (int j=0;j<n;j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }

        }else System.out.print("Матрица не соответствует задаче");


    }

}
