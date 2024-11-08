package company.Wipro;

public class ChildClass extends ParentClass {
    public  void m22(){
        System.out.println("Method m22 for Child method");
    }
    public  void m23(){
        System.out.println("Method m23 for Child method ");
    }

    public static void main(String[] args) {
        ParentClass pc=new ChildClass();
        pc.m1();
        pc.m2();
        pc.m3();
    }
}
