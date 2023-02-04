package entities;

import com.sun.source.tree.TryTree;

import javax.imageio.IIOException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Writer {

    public static  BufferedWriter writer(String line){
        String path = "C:" + File.separator + "Users" + File.separator + "nicolas.ceccato" + File.separator + "Desktop" + "summary.csv";
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path))){
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        }catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }
}
