package by.learn.sort;

import java.util.Random;

public class FourSort {
    public static void main(String[] args) {
        System.out.println("Сортировка обменами. Дана последовательность чисел a1<=a2<=...<=an. Требуется переставить " +
                "числа в порядке возрастания. Для этого сравниваются два соседних числа ai и ai+1. Если ai>ai+1, то " +
                "делается перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке " +
                "возрастания. Составить алгоритм сортировки, подсчитывая при этом количества перестановок.");
        Random random=new Random();
        int N=10;
        int arr[]=new int[N];
        for(int i=0; i<N;i++) {
            arr[i]= random.nextInt(21);
            System.out.print(arr[i]+" ");
        }
        int num;
        int count=0;
        for (int i=0; i<N-1; i++){
            for(int j=0; j<N-i-1;j++){
                if(arr[j]>arr[j+1]){
                    num=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=num;
                    count++;
                }
            }
        }
        System.out.println();
        for(int i=0; i<N;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Количество перестановок =" + count);

    }
}
