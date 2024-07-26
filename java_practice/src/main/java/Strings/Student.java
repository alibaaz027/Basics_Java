package Strings;

public class Student {

    private int id;
    private String name;
    private int roll_no;

    public Student(int id, String name, int roll_no) {
        this.id = id;
        this.name = name;
        this.roll_no = roll_no;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", roll_no=" + roll_no +
                '}';
    }

    public static void main(String[] args) {
        Student obj = new Student(1,"Ali",23);
        System.out.println(obj);
    }
}

