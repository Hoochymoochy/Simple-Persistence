package newPack;

import com.sun.security.jgss.GSSUtil;

import javax.annotation.processing.Filer;
import java.io.*;
import java.util.Scanner;

public class Files {
    public static String readTxtFile(String sFileName){
        StringBuilder sBuilder = new StringBuilder();
        try(BufferedReader bReader = new BufferedReader(new FileReader(sFileName))){
            String line;
            while((line = bReader.readLine()) != null) {
                sBuilder.append(line);
            }
        }
        catch(Exception e){
            System.out.println("oh no ERROR");
        }
        return sBuilder.toString();
    }
}
