package Constructor;

public class Student {
    int rollNo;
    String name,course;
    float fee;

    Student(int rollNo,String name,String course){
        this.rollNo=rollNo;
        this.name=name;
        this.course=course;
    }

    Student(int rollNo,String name,String course ,float fee){
        this(rollNo,name,course);//reusing Constructor
        this.fee=fee;

    }
    public void display(){
        System.out.println(rollNo+" "+name+" "+course+" "+fee);
    }

    public static void main(String[] args) {
        Student s1 = new Student(1,"Javed","Java");
        Student s2 = new Student(2,"Ali","Angular",2000);
        s1.display();
        s2.display();
    }
}
