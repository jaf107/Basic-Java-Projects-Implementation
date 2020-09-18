package Tutorials.IOStreamsProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadInputs {
    public static void main(String[] args) {
        File file = new File("src/Tutorials/IOStreamsProject/Text.txt");

        try(FileInputStream fileInputStream = new FileInputStream(file)) {

            System.out.println("Total size to read in bytes is "+ fileInputStream.available());

            int content;
            while ((content = fileInputStream.read()) != -1){
                System.out.print((char)content);
            }
        }
        catch (IOException e){
//            System.out.println("IO Exception " + e.printStackTrace(););
            e.printStackTrace();
        }

    }
}
