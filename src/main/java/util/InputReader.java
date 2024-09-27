package util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InputReader {
    private List<String> lines = new ArrayList<>();

    public void readInputTxt(){
        try {
            File file=new File("src/main/resources/Feladat_fejlesztőknek_1_jutalékadatok.txt");    //creates a new file instance
            FileReader fr=new FileReader(file);   //reads the file
            BufferedReader br=new BufferedReader(fr);  //creates a buffering character input stream
            String line;
            while((line=br.readLine())!=null) {
                lines.add(line);
            }
            fr.close();    //closes the stream and release the resources
            System.out.println("Lenght of list: " + lines.size());
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
