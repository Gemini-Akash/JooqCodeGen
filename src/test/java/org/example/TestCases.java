package org.example;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertThrows;

public class TestCases {


    @Test
    public void testCaseForScriptPath() {

        FileNotFoundException exception=assertThrows(FileNotFoundException.class, () -> {
            EntityClassGen entityClassGen =new EntityClassGen();
            entityClassGen.EntityGenerator("src/main/resources/Scrpt.sql","Entity.Generated","D:\\JooqCodeGen\\src\\main\\java");
        });
        System.out.println(exception.getMessage());
        assertEquals("Script Not found", exception.message);
    }


    @Test
    public void testCaseForDirectoryPath() {

        FileNotFoundException exception=assertThrows(FileNotFoundException.class, () -> {
            EntityClassGen entityClassGen =new EntityClassGen();
            entityClassGen.EntityGenerator("src/main/resources/Script.sql","Entity.Generated","D:\\JoGen\\src\\main\\java");
        });
        System.out.println(exception.getMessage());
        assertEquals("Directory Not found", exception.message);
    }


}
