package practice;

public class FactorsOfAnElement {

    public static void main(String[] args) {
        int n = 21;
        int count = 0;
        for(int i=1 ; i<=21 ; i++){
            if(n%i == 0){
                count++;
            }
        }
        System.out.println(count);
    }

}
