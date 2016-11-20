/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filereadingwriting;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author webprog26
 */
public class TextFileWriter {
    public static void writeTextFile(String text, File file){
    
        if(file == null) return;
        
        try{
            PrintWriter out = new PrintWriter(file);
            try{
               out.print(text);
            } finally{
                out.close();
            }
        } catch(FileNotFoundException fnfe){
            fnfe.printStackTrace();
        }
    }
}
