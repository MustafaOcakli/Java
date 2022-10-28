package day27exceptionscollections;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileLineByLine {
    public static void main(String[] args) {
        readFileLineByLine();

    }

    public static void readFileLineByLine(){

        try {
            BufferedReader reader = new BufferedReader(new FileReader("src\\main\\java\\day26exceptions\\File01.txt"));

            String line = reader.readLine();

            while (line!=null){
                System.out.println(line);
                line = reader.readLine(); //2. satırı okuyor. artırma işlenmini reader yapıyor burda. i++ yok yani.
            }

        } catch (FileNotFoundException e) {
            System.out.println("There is an issue about the path or about the file - " + e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }






}
