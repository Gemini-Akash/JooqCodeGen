package org.example;

import org.jooq.exception.IOException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ReadFile {
    public  void readFile() throws IOException,  java.io.IOException {

        File file = new File("src/main/resources/Script.sql");
        Scanner input = new Scanner(file);


        Path path1 = Paths.get("D:\\JooqCodeGen\\src\\main\\resources");
        String filename = "FormattedScript" + ".sql";
        String path = path1 + File.separator + filename;

        FileWriter fileWriter =new FileWriter(path);



        int count = 0;
        while (input.hasNext()) {
            String word= input.next();
            String text= word.replaceAll("[\\[\\]]", "");
            fileWriter.write(text);
            fileWriter.write(" ");
            count = count + 1;
        }
        System.out.println(count);
        fileWriter.close();

    }

    }


