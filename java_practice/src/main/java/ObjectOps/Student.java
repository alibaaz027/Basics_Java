package ObjectOps;
 class Student {

    int rollNo;
    String name;

    void insertInformation(int r , String n){
        rollNo=r;
        name=n;
    }

    void displayInformation(){
        System.out.println(rollNo+" " +name);
    }


    }
    class TestClass{
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();

        s1.insertInformation(111,"Javed");
        s2.insertInformation(112,"Harshit");

        System.out.println(s1.rollNo+" "+s1.name);

        s1.displayInformation();
        s2.displayInformation();

    }

}
