package by.learn.sort;


public class SecondSort {
    public static void main(String[] args) {
        System.out.println("Данны две последовательности a1<=a2<=...<=an и b1<=b2<=...<=bm. " +
                "Образовать из них новую последовательность числе так, чтобы она тоже была неубывающей. Примечание. " +
                "Дополнительный массив не использовать");
        int arr1[]=new int[]{1,3,6,7,9,12,17,19,22};
        int arr2[]=new int[]{2,4,5,7,10,13,16,19,20};
        int comb[]=new int[arr1.length+arr2.length];

        for (int i=0, add1=0, add2=0; i<comb.length;i++){
            if (add1!=arr1.length && add2!=arr2.length){
                if (arr1[add1]<=arr2[add2]){
                    comb[i]=arr1[add1];
                    add1++;
                }else {
                    comb[i]=arr2[add2];
                    add2++;
                }
            }else if(add1==arr1.length){
                comb[i]=arr2[add2];
                add2++;
            }else {
                comb[i]=arr1[add1];
                add1++;
            }

        }
        for (int i=0; i<comb.length;i++){
            System.out.print(comb[i]+" ");
        }

    }
}
