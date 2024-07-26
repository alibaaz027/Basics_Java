package Practices;

import java.util.stream.IntStream;

public class OneToHundredWLoop {
    public static void main(String[] args) {
      //  printNum(1);
       // printNumber(1,100);
       // printNumbers(1);
       // printOneToHundred(1,100);
       // IntStream.range(1,101).forEach(numberss-> System.out.println(numberss));
        //IntStream.range(1,301).forEach(n-> System.out.println(n));
        ptr(1);




        //IntStream.range(1,500).forEach(n-> System.out.println(n));



        //IntStream.range(1,202).forEach(e-> System.out.println(e));
    }

    public static void printNum(int num){

        if(num<=100){
        System.out.print(num+" ");
        num++;
        printNum(num);
        }
    }
    public static void printNumber(int srtNum , int endNum){
        if(srtNum<=endNum){
            System.out.println(srtNum);
            srtNum++;
            printNumber(srtNum,endNum);
        }
    }

    public static void printNumbers(int nums){

        if(nums<=100){
            System.out.println(nums);
            nums++;
            printNumbers(nums);
        }
    }

    public static void printOneToHundred(int startNum , int endNums){
      if (startNum<=endNums){

          System.out.println(startNum);
          startNum++;
          printOneToHundred(startNum,endNums);

      }
    }

    public static void ptr(int input){
        if (input<=100){
            System.out.println(input);
            input++;
            ptr(input);
        }
    }


}
