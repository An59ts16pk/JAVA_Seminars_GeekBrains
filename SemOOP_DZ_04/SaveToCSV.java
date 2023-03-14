package SemOOP_DZ_04;

//import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SaveToCSV {
    public static void saveToCSV(TaskBase<String> gt) {
        try (FileWriter fw = new FileWriter("SemOOP_DZ_04/note.csv", true)) {
            for(var el : gt.getPlans()) {
                fw.write(el.toString());
                fw.append('\n');
            }

            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
