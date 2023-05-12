package files;

import java.io.*;
import java.util.Scanner;

public class FileWriterMain
{

    public void WriteData(String data){ // thi code can be applied in pos printing paper
        try{
        File myfile = new File("test.txt");
        FileWriter writeToFile = new FileWriter(myfile);
        writeToFile.write(data);
        writeToFile.append("more to file");

        FileWriter fileWriter = new FileWriter(myfile);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);


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

