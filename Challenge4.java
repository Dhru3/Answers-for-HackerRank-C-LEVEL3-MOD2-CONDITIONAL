//Write a program to print the values from 1 to n. If a 3 digit number appears, the program has to be exited. Use break statement to perform this operation

import java.util.*;

public class Challenge4 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        for(int i=1; i<=num; i++){
            if(num>=99 && i>99){
                break;
            }
            
            System.out.print(i + " ");
        }
    }
}