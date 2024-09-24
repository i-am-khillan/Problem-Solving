package sept2024.sept19_2024;
public class ExceptionsHandleing {
    public static void main(String[] args) {
        try{
            int a=10/0;
        }
        catch (ArithmeticException e){
            e.printStackTrace();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.println("khillan");
            //return;
        }
        System.out.println("sdfa");
    }
}
