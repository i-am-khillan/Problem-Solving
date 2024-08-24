package exceptionHandler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderInputFromConsole {
    public static void main(String[] args) throws IOException {

        System.out.println("Enter or Data or Press any key:");
        String input;
        BufferedReader br=null;
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            input= br.readLine();
            System.out.println(input);
        }
        catch ( IOException e){
            e.printStackTrace();
        }
        finally {
            br.close();
        }

    }
}
