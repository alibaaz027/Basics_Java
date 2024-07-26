package OOPs;

public class Encap {

    private int age;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        age = a;
    }

    public static void main(String[] args) {

        Encap en = new Encap();
        en.setAge(27);
        en.setName("Javed");
        System.out.println(en.getAge()+":"+en.getName());

    }
}
