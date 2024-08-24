package exceptionHandler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrywithoutCatchFinally {

    public static void main(String[] args) throws IOException {

        System.out.println("Enter Data or press any key :");
        try (BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){
            String input=br.readLine();
            System.out.println(input);
            br.close();// No need to use this because its autoclosable
        }
    }
}
