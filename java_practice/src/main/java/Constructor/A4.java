package Constructor;

class B{

    A4 obj;
    B(A4 obj){

        this.obj=obj;

    }

    void display(){
        System.out.println(obj.data);//using data member of A4 class
    }

}

public class A4 {
    int data =10;
    A4(){
        B b = new B(this);
        b.display();
    }


    public static void main(String[] args) {
        A4 a4 = new A4();
    }
}
