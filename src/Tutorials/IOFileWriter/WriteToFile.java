package Tutorials.IOFileWriter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class WriteToFile {
    public static void main(String[] args) {
        File file = new File("src/Tutorials/IOFileWriter/MyFile.txt");

        try(FileWriter fileWriter = new FileWriter(file)) {

            fileWriter.write("This is Amazing...");
            fileWriter.write("\nYou are Awesome");
            fileWriter.close();

            // Read it all back to us

            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line  = null;

            while ((line = bufferedReader.readLine()) != null)
            {
                System.out.println(line);

            }


//            try(FileReader fileReader = new FileReader(file))
//            {
//                int content;
//                while ((content=  fileReader.read()) != -1)
//                    System.out.print((char)content);
//
//            }catch (Exception e)
//            {
//
//            }
        }
        catch (Exception e)
        {

        }
    }
}
