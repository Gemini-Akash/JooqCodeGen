package org.example;


import org.jooq.codegen.GenerationTool;
import org.jooq.meta.jaxb.*;

public class Main {


    public static void main(String[] args) throws Exception {

        System.out.println("Hello world!");
//
//        ReadFile obj =new ReadFile();
//        obj.readFile();

        EntityClassGen entityClassGen = new EntityClassGen();
        EntityClassGen.EntityGenerator("src/main/resources/FormattedScript.sql","Entity.Generated","D:\\JooqCodeGen\\src\\main\\java");



    }
}