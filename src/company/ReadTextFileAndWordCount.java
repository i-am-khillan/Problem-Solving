package company;

import com.sun.org.apache.xpath.internal.operations.Neg;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFileAndWordCount {
    public static void main(String[] args) {

        int count=readTextFiled("C:\\Users\\kverma\\Documents\\file.txt");


       // int count=readTextFiled("");
        System.out.println(count);
    }
    public static int readTextFiled(String file){
    int wordCount=0;
    try{
        BufferedReader br=new BufferedReader(new FileReader(file));
        String line;
        while ((line=br.readLine())!=null){
            String word[]=line.trim().split("\\s+");
            if (word.length == 1 && word[0].isEmpty()){
                continue;
            }
            wordCount +=word.length;
        }
    }
//    catch (FileNotFoundException e){
//        e.printStackTrace();
//    }
    catch (IOException es){
        es.printStackTrace();
    }
    return wordCount;
    }
}
