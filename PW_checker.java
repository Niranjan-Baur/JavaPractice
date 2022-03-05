package practice;

import java.util.Scanner;

public class PW_checker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        int dig = 0 , upC = 0 , loC = 0;

        for(int j=1 ; j<=T ; j++){

            String str = sc.nextLine();
            sc.nextLine();

            for(int i=0 ; i<str.length() ; i++){

                if(Character.isDigit(str.charAt(i)) ){
                    dig++;
                }
                else if(Character.isUpperCase(str.charAt(i))){
                    upC++;
                }
                else if(Character.isLowerCase(str.charAt(i))){
                    loC++;
                }

            }

            if(dig >= 1 && upC >= 1 && loC >= 1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

        }
    }
}
