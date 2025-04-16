//Write a program to skip even values and print odd values from 1 to n by using continue statement.

import java.util.*;

public class Challenge5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        for(int i=1; i<=num; i++){
            if(i%2==0){
                continue;
            }
            
            else{
                System.out.print(i+" ");
            }
        }
    }
}