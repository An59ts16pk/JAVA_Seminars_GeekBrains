package SemOOP_DZ_02;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.*;

public class SaveResult {
    /**
     * Метод выгрузки генеологического дерева в файл csv
     * @param gt
     */
    public static void saveGeoTree(HumanBase gt) {
        try (FileWriter fw = new FileWriter("SemOOP_DZ_02/geoTree.csv", false)) {
            fw.write("      who      role    to whom :\n");
            for(List<Node> el : gt.getAllTree()) {
                for (Node e : el) {
                    fw.write(e.toString());
                    fw.append('\n');
                }
                // fw.write(el.toString());
                // fw.append('\n');
            }

            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
    
    /**
     * Метод записи в файл csv исследования по возрасту
     * @param st - пояснительная строка
     * @param rs - результат
     */
    public static void saveRes(String st, ArrayList<String> rs) {

        try (FileWriter fw = new FileWriter("SemOOP_DZ_02/file.csv", true)) {
            fw.write(st + rs);
            fw.append('\n');
            
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
