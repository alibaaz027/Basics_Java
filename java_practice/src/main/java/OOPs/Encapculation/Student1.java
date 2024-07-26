package OOPs.Encapculation;

//Read Only Class
public class Student1 {
     //private int id=23;
    private String name="Ali";

//     public int getId(){
//         return id;
//     }
      public String getName(String n){

          return n;
      }

    public static void main(String[] args) {
        Student1 s = new Student1();
       String n =s.getName("Baaz");
        System.out.println(n);

//       int num =s.getId();
//        System.out.println(num);
    }
}
