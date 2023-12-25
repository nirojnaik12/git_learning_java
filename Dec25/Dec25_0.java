package Dec25;

import java.util.Scanner;
public class Dec25_0{
    public static void main(String[] args) {
        try (Scanner myObj = new Scanner(System.in)) {
            System.out.println("enter your name :");
            String userName=myObj.nextLine();
            System.out.println(userName);
        }

        
    }
}