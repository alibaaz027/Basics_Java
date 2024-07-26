package Strings;

final class Employee
{
    final String panCardNumber;
    public Employee(String panCardNumber)
    {
        this.panCardNumber=panCardNumber;
    }
    public String getPanCardNumber(){
        return panCardNumber;
    }
}
public class ImmutableDemo
{
    public static void main(String ar[])
    {
        Employee e = new Employee("ABC123");
        String s1 = e.getPanCardNumber();
        System.out.println("Pan card Number: " + s1);
    }
}