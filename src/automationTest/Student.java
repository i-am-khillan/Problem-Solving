package automationTest;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class Student {
    String name;
    String rollno;
    Student(String name,String rollno){
        this.name=name;
        this.rollno=rollno;
    }
    public String toString(){
        return name +"----------------"+rollno;
    }

    public static void main(String[] args) {
        Student s1=new Student("khillan","987");
        Student s2=new Student("ravi","098");
        System.out.println(s1);
        System.out.println(s1.toString());
        System.out.println(s2);


        String sb1=new String(new String("khillan"));

        System.out.println(sb1);
    }
}
