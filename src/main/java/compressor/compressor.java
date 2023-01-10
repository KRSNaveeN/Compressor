/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compressor;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;
/**
 *
 * @author User
 */
public class compressor {
    
    public static void method(File file)throws IOException{
        String filedirectory = file.getParent();
        
        //predifeined fileinput stream
        FileInputStream fis = new FileInputStream(file);
        //it return input bytes of the iput file passed
        FileOutputStream fos = new FileOutputStream(filedirectory+"/Compressed1.gz");
        //this return the output bytes and gave the location and file name given is compressed1.gz
        GZIPOutputStream gzip = new GZIPOutputStream(fos); 
                //it compresses the file passed in it
                byte[] buffer = new byte[1024];
                int len;
                while((len= fis.read(buffer))!=-1){
                    gzip.write(buffer, 0,len);
                }  
                gzip.close();
                fos.close();
                fis.close();
        
    }
    public static void main(String[] args)throws IOException{
        File path = new File( "C:/Users/User/Desktop/projectfile/sampletext.txt");
        method(path);  
    }

  

   

    
}
