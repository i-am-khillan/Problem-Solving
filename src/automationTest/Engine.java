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


        Engine a=new Engine();
        a.x=999;
        a.y=990;
        Engine a1=new Engine();
        System.out.println(a1.x+"__________"+a1.y);//what is output of this
    }
}
