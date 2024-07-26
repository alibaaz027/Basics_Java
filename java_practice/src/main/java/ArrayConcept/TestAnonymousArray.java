package ArrayConcept;

public class TestAnonymousArray {
    //Java Program to demonstrate the way of passing an anonymous array
    //to method.
    static void printArray(int arr[]){
        for (int i =1;i< arr.length;i++)
            System.out.println(arr[i]);
    }
    public static void main(String[] args) {
        printArray(new int[]{34,56,45,34,35});
    }
}
