package Searching;

public class Search {
    public static void main(String[] args) {

        linearSearch(new int[]{1, 2, 3, 4}, 5); /** Array can be unsorted ,
                                                                                best case O(1) -> if key is found at the first index
                                                                                and worst case O(n) -> if key is found at the last index
                                                                                or not present in the array */

        binarySearch(new int[]{1,2,3,4,5,6,7,8} , 9); /** Array must be sorted ,
                                                                                best case O(1) -> if key is found at the mid index
                                                                                and worst case O(logn) -> if key is found at the last iteration
                                                                                or not present in the array */

    }

    public static void linearSearch(int[] arr , int key){

        int temp = 0;
        for(int i=0 ; i< arr.length ; i++){
            if(arr[i] == key){
                System.out.println(key + " is present at the index of : " + i);
                temp++;
            }
        }
        if(temp == 0){
            System.out.println("Element not Found");
        }
    }

    public static void binarySearch(int[] arr , int key){

        int low = 0 , high = arr.length-1 , temp = 0;

        while (low <= high){

            int mid = (low + high)/2;

            if(arr[mid] == key){
                System.out.println(key + " is present at the index of " + mid);
                temp++;
                break;
            }
            else if (key > arr[mid]){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }

        if(temp == 0){
            System.out.println("Element not found");
        }
    }
}
