//Write a program to print the vales from 1 to n. Use goto statement to perform looping operation

//In languages like C and C++, goto allows a program to jump directly to a labeled part of the code. 
//While this can make code shorter, it often results in "spaghetti code" — code that is difficult to read, understand, and maintain. 
//The flow of control is unpredictable and can jump to various parts of the program.

//Thus I jave used an alternate method to solve this problem not using the "goto" statement.

import java.util.*;

public class Challenge3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        for(int i=1; i<=num; i++){
            System.out.println(i);
        }
    }
}