package excep;

import java.io.FileInputStream;
import java.io.IOException;

public class Excep3 {
    public static void main(String[] args) {
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("dummy.txt");
            int ch;
            while ((ch = fis.read()) != -1) {
                System.out.print((char) ch); 
            }
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }
}

