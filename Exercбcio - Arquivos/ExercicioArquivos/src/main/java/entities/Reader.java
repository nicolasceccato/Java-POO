package entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reader {

    public static void reader(String path, String out){
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){
            String line = bufferedReader.readLine();

            while (line != null){
                System.out.println(line);
                line = bufferedReader.readLine();
                //Writer.writer(line,out);
            }
        } catch (IOException e){
            System.out.println("ERROR: "+e.getMessage());
        }
    }

}
