package InterviewCoding;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scan.nextInt();

        if(num%2==0){
            System.out.println("Even number");
        }
        else {
            System.out.println("Odd number");
        }
    }


    }

