package com.company;

import java.io.IOException;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) {
        try(FileReader reader = new FileReader("param.txt"))
        {
            // читаем посимвольно
            int c;
            while((c=reader.read())!=-1){

                System.out.print((char)c);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
