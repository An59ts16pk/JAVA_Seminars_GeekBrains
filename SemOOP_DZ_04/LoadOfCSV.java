package SemOOP_DZ_04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;

public class LoadOfCSV {
    public void loadOfCSV() throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("SemOOP_DZ_04/note.csv"))) {
        String str;
        while ((str = br.readLine()) != null) {
            System.out.println(str);
        }
        br.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    
    }
}
