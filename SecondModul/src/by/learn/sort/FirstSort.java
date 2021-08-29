package by.learn.sort;

import java.util.Scanner;

public class FirstSort {
    public static void main(String[] args) {
        System.out.println("Заданы два одномерных массива с различным количеством элементов и натуральное число k." +
                "Объединить их в один массив, включи второй массив между k-м и (k+1)-м элементами первого," +
                "при этом не используя дополнительные массив");
        Scanner in = new Scanner(System.in);
        int arr1[]=new int[]{1,2,3,4,5,6,7,8,9};
        int arr2[]=new int[]{4,1,2,7,3,8,1,9,5};
        int comb[]=new int[arr1.length+arr2.length];
        System.out.print("введите k: ");
        int k= in.nextInt();

        boolean leg=false;
        for (int i=0; i<arr1.length;i++){//Проверка что у нас есть данное число
            if (k==arr1[i]){
                leg=true;
                break;
            }
        }

        if (leg){
            for (int i=0, add=0;i<arr1.length;i++){
                if (k!=arr1[i]){
                    comb[add]=arr1[i];
                    add++;
                }else {
                    comb[add]=arr1[i];
                    add++;
                    for (int j=0; j<arr2.length;j++){
                        comb[add]=arr2[j];
                        add++;
                    }
                }
            }
            for (int i=0; i<comb.length;i++){
                System.out.print(comb[i]+" ");
            }
        }else System.out.println("Такого числа нету");
    }
}
