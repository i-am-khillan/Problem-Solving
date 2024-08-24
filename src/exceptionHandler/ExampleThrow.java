package exceptionHandler;

public class ExampleThrow {
    static void checkAge(int age){
        if(age <18){
            throw new RuntimeException("Access Denied- Eligiable for voting");
        }
        else {
            System.out.println("Access grand-- eligiable for voting");
        }
    }

    public static void main(String[] args) {
        checkAge(30);
    }
}
