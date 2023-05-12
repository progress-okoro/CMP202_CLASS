package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterMain
{

    public void WriteData(String data){
        try{
        File myfile = new File("test.txt");
        FileWriter writeToFile = new FileWriter(myfile);
        writeToFile.write(data);

        writeToFile.flush();
        writeToFile.close();
    }catch(IOException ioException){
            System.out.println("can not write to this file");
        }

}


    // to read from a file
    public void readFromFile() {
        try {
            File myfile = new File("test.txt");
            Scanner myReader = new Scanner(myfile);
            while (myReader.hasNext()){
                String dataInFile = myReader.nextLine();
                System.out.println(dataInFile);
            }
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("can not read from this file");
        }




    }
}

