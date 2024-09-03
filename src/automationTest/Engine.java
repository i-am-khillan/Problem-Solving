package automationTest;

public class Engine extends Car{
    static int x=10;
    int y=20;
    public void engine(){
        System.out.println("engine");

    }
    public void car(){
        System.out.println("engine");
    }
    public static void main(String[] args) {
        //Case 1
        Car c=new Car();
        c.car();// only Parent data & behavior accessed
        //Case 2
        Car c1=new Engine();
        c1.car();// parent hold the child object and access the child class data and methods.
       // c1.engine();
        //Case 3
        Engine e=new Engine();
        e.engine();//Only child method called
       // System.out.println(e.engine());
        // Case 4
        //Engine e1=new Car(); //Not allowed


    }
}
