package tl.binaryfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoBinaryFile {
    public static void main(String[] args) throws IOException {
        File dataFile = new File("data.txt");
        dataFile.createNewFile();
        FileOutputStream fos = new FileOutputStream(dataFile);
        char c = 'j';
        fos.write(c);
        fos.close();
        FileInputStream fis = new FileInputStream(dataFile);
        int b;
        while ((b = fis.read()) != -1) {
            System.out.println((char) b);
        }
    }
}
