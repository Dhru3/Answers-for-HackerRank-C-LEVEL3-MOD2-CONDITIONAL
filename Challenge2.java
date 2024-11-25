//Write the program so that all numbers from start value that are less than 16 are printed continuously.

import java.util.*;

public class Challenge2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        if(num>0 && num<16){
            for(int i =num; i<16; i++ ){
                System.out.print(i + " ");
            }
        }
    }
}