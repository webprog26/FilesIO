/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filereadingwriting;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author webprog26
 */
public class BytesWriter {

    public static void writeBytes(byte[] data, String fileName){
        DataOutputStream dataOutputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        
        try{
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File(fileName)));
            dataOutputStream = new DataOutputStream(bufferedOutputStream);
            
            try{
                for(byte b: data){
                dataOutputStream.write(b);
                }
            } catch(IOException ioe){
                ioe.printStackTrace();
            }

        } catch (FileNotFoundException fnfe){
            fnfe.printStackTrace();
        } finally{
            if(bufferedOutputStream != null){
                try{
                    bufferedOutputStream.close();
                } catch(IOException ioe){
                    ioe.printStackTrace();
                }
            }
            
            if(dataOutputStream != null){
                try{
                    dataOutputStream.close();
                } catch(IOException ioe){
                    ioe.printStackTrace();
                }
            }
        }
    }
}
