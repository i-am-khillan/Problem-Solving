package testPackage;

public class ClassChild extends ParentClass {
    public void m1Child(){
        System.out.println("method m1");
    }
    public void m2Child(){
        System.out.println("method m1");
    }

    public static void main(String[] args) {

        ParentClass pc=new ClassChild();
        pc.m1();
        pc.m2();
        pc.m3();
    }
}
