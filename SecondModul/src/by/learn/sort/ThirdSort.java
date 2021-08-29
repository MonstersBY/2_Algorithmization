package by.learn.sort;

public class ThirdSort {
    public static void main(String[] args) {
        System.out.println("Сортировка выбором. Дана последовательность чисел a1<=a2<=...<=an. Требуется переставить " +
                "элементы так, чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, " +
                "выбирается наибольший элемент и ставится на первое место, а первый - на место наибольшего. " +
                "Затем, начиная со второго, эта процедура повторяется. Написать алгорит сортировки выбором.");
        int arr[]=new int[]{1,3,6,7,9,12,17,19,22};
        int max, num;
        for (int i=0; i<arr.length-1;i++){
            max=i;
            for (int j=i+1; j<arr.length;j++){
                if(arr[j]>arr[max]){
                    max=j;
                }
            }
            num=arr[i];
            arr[i]=arr[max];
            arr[max]=num;
        }


        for (int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
