package Basics;

import java.util.Scanner;

public class Tables {

    public static void main(String[] args) {

       // int a=2;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int c=scan.nextInt();


        for (int i =1;i<=10;i++){

            System.out.println(c +"X"+i +"="+c*i);
        }
    }

}
