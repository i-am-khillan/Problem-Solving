package company.publishSapient;

import java.util.Scanner;

import  static java.lang.System.*;
public class InputOperations {

    public static void main(String[] args) {
        String input;
        out.println("Enter integer or exit to quit -----  value ");
        while (true) {
            Scanner s = new Scanner(in);
            input = s.nextLine();
            if(input.equalsIgnoreCase("exit")){
                break;
            }
            try {
                int number=Integer.parseInt(input);
                out.println("Enter number to operate "+number);
            }
            catch (NumberFormatException e){
                out.println("Invalid input .Please enter valid integer or exit");
            }
            s.close();
        }
        out.println("Program terminanted");

    }
}
