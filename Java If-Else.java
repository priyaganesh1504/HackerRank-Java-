/*n this challenge, we test your knowledge of using if-else conditional statements to automate decision-making processes. An if-else statement has the following logical flow*/
import java.io.*;
import java.util.*;

public class Solution {
 private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();


        if((n%2==1)||((n%2==0)&&(n>=6&&n<=20)))
            System.out.println("Weird");
        else if((n%2==0)&&(n>=2&&n<=5)||(n>20))
            System.out.println("Not Weird");
    

    
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
    }
}
