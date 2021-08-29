package by.learn.sort;

import java.util.Random;

public class SixSort {
    public static void main(String[] args) {
        System.out.println("Сортировка Шелла. Дан массив n действительных числе. Требуется упорядочить его по " +
                "возрастанию. Сравниваются два соседних элемента ai и ai+1. Если a1<=ai+1, то продвигаются на один " +
                "элемент вперед. Если ai>ai+1, то производится перестановка и сдвигаются на один элемент назад.");
        Random random=new Random();
        int N=10;
        int arr[]=new int[N];
        for(int i=0; i<N;i++) {
            arr[i]= random.nextInt(21);
            System.out.print(arr[i]+" ");
        }

        System.out.println();
        for(int i=0; i<N;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();


    }
}
