package ImputOutputSream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Run {
    public static void main(String[] args) throws IOException {

        //Запис в файл
        String srt = "1. Four field";
        //Вибір файла з якого читаєм
        //Append - true дописуєм в файл, false записуєм по новому
        FileOutputStream fileOutput = new FileOutputStream("/Users/andrijdutko/Desktop/JavaExample/src/main/java/ImputOutputSream/FileRead.txt", false);
        //По байту записую в документ
        for(int i = 0; i < srt.length(); i++) {
            fileOutput.write(srt.charAt(i));
        }

        //Читання з файлу по байту
        FileInputStream file = new FileInputStream("/Users/andrijdutko/Desktop/JavaExample/src/main/java/ImputOutputSream/FileRead.txt");
        int read;
        do{
           read = file.read();
           if(read != -1) {
               System.out.print((char) read);
           }
        }while(read != -1);
    }
}
