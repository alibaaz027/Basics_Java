package OOPs;

public class School {

    private int schoolCode;

    private String name;

    private String address;

    public School() {
        this.schoolCode = schoolCode;
        this.name = name;
        this.address = address;
    }

    public int getSchoolCode() {
        return schoolCode;
    }

    public void setSchoolCode(int schoolCode) {
        this.schoolCode = schoolCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static void main(String[] args) {
        School sc =new School();
        sc.setName("Rjit");
        sc.setSchoolCode(1192);
        sc.setAddress("Gwalior");
        System.out.println(sc.getName());
        System.out.println(sc.getAddress());
        System.out.println(sc.getSchoolCode());
    }
}
