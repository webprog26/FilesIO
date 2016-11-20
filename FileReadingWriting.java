/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filereadingwriting;

import java.io.File;

/**
 *
 * @author webprog26
 */
public class FileReadingWriting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        File textToreadFile = new File("E:/files/text_to_read.txt");
//        File textWriteToFile = new File("E:/files/text_to_write.txt");
//        String text = TextFileReader.readTextFile(textToreadFile);
//        System.out.println("text " + text);
//        TextFileWriter.writeTextFile(TextFileReader.readTextFile(textToreadFile), textWriteToFile);
        File imageFile = new File("E:/files/image.gif");
        byte[] imageData = BytesReader.read(imageFile);
        System.out.println("imageData.length: " + imageData.length);
        BytesWriter.writeBytes(imageData, "E:/files/image2.gif");
        FileChannelCopy.copy(imageFile, new File("E:/files/image3.gif"));
    }    
}
