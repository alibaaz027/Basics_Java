package OOPs;

public class Student {

    int roll , marks;
    String name;




    void input(){
        System.out.println("Enter the Name, Marks & Roll no.");
    }

    static class Students extends Student{



        void display(){
            roll=27;
            marks=210;
            name="Javed";
            System.out.println(roll+" "+marks+" "+name);
        }

    }

    public static void main(String[] args) {
       Students s= new Students();
        s.input();
        s.display();
        
    }
}
