package com.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileEx2 {

    public static void main(String[] args) {
        
        File inFile = new File("src//com//files//input2.dat");      
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(inFile);
            int ch;
            while ((ch = fis.read()) != -1) {
                System.out.print((char)ch);
            }
        } catch (IOException ioe) {
            System.out.println(ioe);
        } finally {
            try {
                if (fis != null) 
                	fis.close();
            } catch (IOException ioe) {
                System.out.println(ioe);
            }
        }
    }
}
