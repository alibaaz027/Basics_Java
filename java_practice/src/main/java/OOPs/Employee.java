package OOPs;

public class Employee {

    private int id;

    private String name;

    private double salary;

    public Employee(int id , String name){
        this.id = id;
        this.name= name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void  giveBonus(double bonus){
        if(bonus>0){
            salary+= bonus;
        }else {
            System.out.println("Invalid! Bonus amount should Be positive");
        }
    }


    public static void main(String[] args) {
        Employee employee = new Employee(1,"Javed");

        employee.setSalary(50000);
        System.out.println(employee.getSalary());

        employee.giveBonus(1000);
        System.out.println(employee.getSalary());

        employee.giveBonus(-500);

    }
}
