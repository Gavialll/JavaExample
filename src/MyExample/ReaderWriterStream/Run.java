package ReaderWriterStream;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Run {
    public static void main(String[] args) {
        File file = new File("/Users/andrijdutko/Desktop/JavaExample/src/main/java/ReaderWriterStream/FileRead.txt");

        try (FileWriter fileWriter = new FileWriter(file);){

            String str = "Hello world 123";
            fileWriter.write(str);

        } catch(IOException exception) {
            exception.printStackTrace();
        }

        try(FileReader fileReader = new FileReader(file)){

            StringBuffer stringBuffer = new StringBuffer();
            int i;
            do{
                i = fileReader.read();
                stringBuffer.append((char)i);
            }while(i != -1);
            System.out.println(stringBuffer);

        }catch(IOException exception){
            exception.getMessage();
        }





    }
}
