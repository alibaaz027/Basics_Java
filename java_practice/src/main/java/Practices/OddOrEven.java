package Practices;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number = ");
        int input = sc.nextInt();

        if(input%2==0){
            System.out.println("Even Number");
        }else {
            System.out.println("Odd Number");
        }
    }
}
