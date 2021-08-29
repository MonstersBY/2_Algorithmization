package by.learn.sort;

import java.util.Random;

public class FiveSort {
    public static void main(String[] args) {
        System.out.println("Сортировка вставками. Дана последовательность чисел a1,a2,...,an. Требуется переставить " +
                "числа в порядке возрастания. Пусть a1,a2,...,ai - упорядоченная последовательность. Берется следующее " +
                "число ai+1 и вставляется в последовательность так, чтобы новая последовательность была тоже возрастающей." +
                "Процесс производится до тех пор, пока все элементы от i+1 до n не будут перебраны. Примечание. " +
                "Место помещения очередного элемента в отсортированную часть производить с помощью двоичного поиска." +
                "Двоичный поиск офорчить в виде отдельной функции.");
        Random random=new Random();
        int N=30;
        int arr[]=new int[N];
        for(int i=0; i<N;i++) {
            arr[i]= random.nextInt(100);
            System.out.print(arr[i]+" ");
        }
        int x, mid, min, max;

        for(int i=1; i<N;i++){
            x=arr[i];
            min=0;
            max=i-1;
            while (min<=max){
                mid=min+(max-min)/2;
                if (x<arr[mid]){
                    max=mid-1;
                }else min=mid+1;
            }
            for (int j=i-1;j>=min; j--){
                arr[j+1]=arr[j];
            }
            arr[min]=x;
        }

        System.out.println();
        for(int i=0; i<N;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();


    }
}
