/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filereadingwriting;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author webprog26
 */
public class TextFileReader {
    
    public static String readTextFile(File file){

        if(file == null) return null;
        
        StringBuilder builder = new StringBuilder();
        
        FileInputStream fileInputStream = null;
        BufferedReader bufferedReader = null;
        
        try{
            fileInputStream = new FileInputStream(file);
            bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            
            String line;
            
            try {
                while((line = bufferedReader.readLine()) != null){
                    builder.append(line);
                    builder.append("\n");
                }
            } catch (Exception e) {
            }
        } catch(FileNotFoundException fnfe){
            fnfe.printStackTrace();
        } finally{
            if(fileInputStream != null){
                try{
                    fileInputStream.close();
                } catch(IOException ioe){
                    ioe.printStackTrace();
                }
            }
            
            if(bufferedReader != null){
                try{
                    bufferedReader.close();
                } catch(IOException ioe){
                    ioe.printStackTrace();
                }
            }
        }
        return builder.toString();
    }
}
