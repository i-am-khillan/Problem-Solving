package automationTest;

public class TestStaticInstance {
    static int x=10;
    int y=20;
    public static void main(String[] args) {
        TestStaticInstance t=new TestStaticInstance();
        t.x=999;
        t.y=990;
        TestStaticInstance a1=new TestStaticInstance();
        System.out.println(a1.x+"__________"+a1.y);//what is output of this

    }
}
