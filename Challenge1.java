//Write a program to print the values from 1 to n except 4. Use continue statement to skip 4

import java.util.*;

public class Challenge1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for(int i=1; i<count+1; i++){
            if(i!=4){
                System.out.print(i + " ");
            }
        }
        
    }
}