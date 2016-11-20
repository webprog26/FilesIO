/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filereadingwriting;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author webprog26
 */
public class BytesReader {
    
    public static byte[] read(File file){
        BufferedInputStream bf = null;
        
        try {
            bf = new BufferedInputStream(new FileInputStream(file));
        
            try{
                byte[] data = new byte[bf.available()];
                bf.read(data);
                return data;
            } catch(FileNotFoundException fnfe){
                fnfe.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
           if(bf != null){
               try{
                    bf.close();
               } catch(IOException ioe){
                   ioe.printStackTrace();
               }
           }
        }
        
        return null;
    }
}
