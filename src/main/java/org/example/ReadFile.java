package org.example;

import org.jooq.exception.IOException;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ReadFile {
    public  void readFile() throws IOException,  java.io.IOException {




        Path path1 = Paths.get("D:\\JooqCodeGen\\src\\main\\resources");
        String filename = "FormattedScript" + ".sql";
        String path = path1 + File.separator + filename;

        FileWriter fileWriter =new FileWriter(path);

        try
        {

            FileInputStream fis=new FileInputStream("src/main/resources/Script.sql");
            Scanner sc=new Scanner(fis);

            while(sc.hasNextLine())
            {
                String line = sc.nextLine();
                String text = removeSquare(line);
                fileWriter.write(text);
                fileWriter.write(System.lineSeparator());
            }
            sc.close();     //closes the scanner
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

        fileWriter.close();

    }

    private String removeSquare(String line) {
        String str =line.replaceAll("[\\[\\]]", "");
        return str;
    }

}


