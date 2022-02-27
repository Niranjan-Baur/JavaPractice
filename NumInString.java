package practice;

public class NumInString {
    public static void main(String[] args) {

        int temp = 123;
        sumOfDigits(temp);
    }

    static void sumOfDigits(int n){
        int res , sum=0;
        while (n>0){
            res = n % 10;
            sum = sum + res;
            n = n/10 ;
        }
        System.out.println(sum);
    }
}
