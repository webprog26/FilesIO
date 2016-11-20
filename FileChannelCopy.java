/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filereadingwriting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 *
 * @author webprog26
 */
public class FileChannelCopy {
    private static final int BSIZE = 1024;
    
    public static void copy(File from, File to){
        FileChannel
                in = null,
                out = null;
        
        try{
            in = new FileInputStream(from).getChannel();
            out = new FileOutputStream(to).getChannel();
            
            ByteBuffer buffer = ByteBuffer.allocate(BSIZE);
            
            try{
                while(in.read(buffer) != -1){
                    buffer.flip();
                    out.write(buffer);
                    buffer.clear();
                }
            } catch(IOException ioe){
                ioe.printStackTrace();
            }
            
        } catch(FileNotFoundException exception){
            exception.printStackTrace();
        }
    }
}
