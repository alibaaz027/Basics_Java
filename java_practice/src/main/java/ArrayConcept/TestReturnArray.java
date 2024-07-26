package ArrayConcept;
//Java Program to return an array from the method

public class TestReturnArray {
    //creating method which returns an array
    static int[] get(){
        return new  int[]{23,33,44,55};
    }

    public static void main(String[] args) {
        int arr[]= get();
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
