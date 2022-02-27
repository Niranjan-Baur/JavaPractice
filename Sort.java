package Sorting;

public class Sort {
    public static void main(String[] args) {
        bubbleSort(new int[]{43,13,2,62,7,16,-8});
        System.out.println();
        insertionSort(new int[]{43,13,2,62,7,16,-8});
    }
    static void swap(int[] a, int m , int n){
        int temp;
        temp = a[m];
        a[m] = a[n];
        a[n] = temp;
    }
    static void bubbleSort(int[] arr){
        int flag = 0;
        for(int i = 0 ; i < arr.length ; i++){
            for (int j = 0 ; j < arr.length-1 ; j++){
               if(arr[j] > arr[j+1]){
                   swap(arr , j+1 , j);
                   flag = 1 ;
               }
            }
            if(flag == 0){
                break;
            }
        }
        for (int j : arr) {  // for each
            System.out.print(j + " ");
        }
    }
    public static void insertionSort(int[] arr){
        for (int i=1 ; i < arr.length ; i++){
            int temp = arr[i];
            int j = i-1;
            while (j>=0 && arr[j] > temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
        for (int i=0 ; i<arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}


