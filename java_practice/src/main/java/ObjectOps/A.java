package ObjectOps;

public class A {

    int rollNo;
    String name;
    String email;
    char section;
    String cls;
    void input(){
        System.out.println("Enter the Student details= ");
    }

    public static class List extends A {

        void display() {
            rollNo = 101;
            name = "Javed Ali";
            email = "alijaved0509@gmail.com";
            section = 'A';
            cls = "B.tech";
            System.out.println(rollNo + " " + name + " " + email + " " + section + " " + cls);
        }
    }
    public static void main(String[] args) {
        List r= new List();
        r.input();
        r.display();
    }
}
