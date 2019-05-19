package learn1.GroovyForJavaEyes;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class ExecuteJava{
    public static void main(String args[]) throws Exception{
        Process process = Runtime.getRuntime().exec("cmd /C dir");
        BufferedReader result = new BufferedReader(new InputStreamReader(
                process.getInputStream(), StandardCharsets.UTF_8
        ));

        String line;
        while( (line = result.readLine()) != null){
            System.out.println(line);
        }


    }
}