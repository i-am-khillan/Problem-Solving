package company.publishSapient;

public class ReverseStringChild extends  ReverseString{
    public void m(){
        System.out.println("Child class Method m");
    }
    public static void main(String[] args) {
        //ReverseString sb=new ReverseStringChild();()

        ReverseStringChild sb=new ReverseStringChild();

        sb.m();
    }
}
