package org.example;


import io.swagger.codegen.DefaultGenerator;

import java.io.IOException;

public class GenerateApiSpring {

    public void executeCmd() {
        DefaultGenerator defaultGenerator =new DefaultGenerator();



        defaultGenerator.generate();
    }

}
