package SemOOP_DZ_01;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class SaveResult {
    
    public static void saveRes(String st, ArrayList<String> rs) {

        try (FileWriter fw = new FileWriter("SemOOP_DZ_01/file.txt", true)) {
            fw.write(st + rs);
            fw.append('\n');
            
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
