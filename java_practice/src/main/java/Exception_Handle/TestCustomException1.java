package Exception_Handle;


class InvalidAgeException extends Exception{
    InvalidAgeException(String str){
        super(str);//calling Exception to the parent class
    }
}
public class TestCustomException1 {

    static void validate(int age) throws InvalidAgeException{
        if(age<18){
            throw  new InvalidAgeException("Not Eligible for Vote");
        }else {
            System.out.println("Go for Vote");
        }
    }

    public static void main(String[] args) {
        try {
            validate(13);

        }catch (InvalidAgeException e){
            System.out.println("Caught an Exception");
            System.out.println("Exception occur "+e);
            System.out.println(e.getMessage());
        }
    }
}
