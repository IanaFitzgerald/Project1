package lesson7.FileManager;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class FileManager {
    public static void main(String[] args) {
        String file = "Legionfile.txt";

        FileManager fileManager = new FileManager();
        fileManager.creatFile(file);
        fileManager.whiteToFile(file, "Как обычно ничего не понятно");
        fileManager.readFile(file);

    }

    public void creatFile(String fileName) {
        File file = new File(fileName);

        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void whiteToFile(String fileName, String text){
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write(text);
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Error. Cannot write...");
            throw new RuntimeException(e);
        }
    }
    public void readFile(String fileName){
        File file = new File(fileName);
        try {
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                String row = scanner.nextLine();
                System.out.println(row);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

}
