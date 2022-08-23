package org.example;


/**
 * This class extends the Exception class,
 * and handle the exception caused by Invalid paths given by user,
 * such as File not found exceptions.
 */

public class FileNotFoundException extends  Exception{

    String message;
    FileNotFoundException(String str){
        message=str;
    }

    @Override
    public String toString() {
        return ("File Not Found Exception "+ message);
    }
}
