package P3;

public class PalindromeString {
    public static void main(String[] args) {
        String s ="1234";
        //String rev ="";
        char []a = s.toCharArray();
        int i = 0;
        int j = a.length-1;

        while (i<j){
            char temp = a[i];
            a[i]= a[j];
            a[j]=temp;
            i++;
            j--;
        }

//        for (i=0;i<a.length;i++)
//        System.out.print(a[i]);
        String s1 =new String(a);

        System.out.println(s1);
        if(s.equals(s1)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }
    }

}
