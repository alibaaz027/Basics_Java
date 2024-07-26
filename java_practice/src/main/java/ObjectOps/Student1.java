package ObjectOps;

public class Student1 {

    int rollNum;
    String name;

    public Student1(int rollNum,String name){

        this.rollNum=rollNum;
        this.name=name;

    }

    void displayOutput(){
        System.out.println(rollNum+" "+name);
    }

}

    class  Test1{
    public static void main(String[] args) {
        Student1 s3 = new Student1(111,"Ali");
        System.out.println(s3.rollNum+" "+s3.name);
        s3.displayOutput();

    }
}
