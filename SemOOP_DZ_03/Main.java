package SemOOP_DZ_03;

//import java.util.ArrayList;
import java.util.*;
import java.io.*;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main implements Serializable {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        HumanBase hb = new HumanBase();

        Human irina = CreateHuman.getInstance()
            .setID()
            .setFirstName("Ирина")
            .setSecondName("Петровна")
            .setLastName("Ивановна")
            .setAge(58)
            .setGender("ж")
            .create();

        Human egor = CreateHuman.getInstance()    
            .setID()
            .setFirstName("Егор")
            .setSecondName("Васильевич")
            .setLastName("Иванов")
            .setAge(62)
            .setGender("м")
            .create();

        Human petay = CreateHuman.getInstance()
            .setID()
            .setFirstName("Петя")
            .setSecondName("Егорович")
            .setLastName("Иванов")
            .setAge(32)
            .setGender("м")
            .create();

        Human masha = CreateHuman.getInstance()
            .setID()
            .setFirstName("Маша")
            .setSecondName("Егоровна")
            .setLastName("Иванова")
            .setAge(27)
            .setGender("ж")
            .create();

        Human ivan = CreateHuman.getInstance()
            .setID()
            .setFirstName("Ваня")
            .setSecondName("Петрович")
            .setLastName("Иванов")
            .setAge(10)
            .setGender("м")
            .create();

        Human ann = CreateHuman.getInstance()
            .setID()
            .setFirstName("Анна")
            .setSecondName("Петровна")
            .setLastName("Иванова")
            .setAge(8)
            .setGender("ж")
            .create();
        
        Human sasha = CreateHuman.getInstance()
            .setID()
            .setFirstName("Саша")
            .setSecondName("Петрович")
            .setLastName("Иванов")
            .setAge(5)
            .setGender("м")
            .create();    
        
        GeoTree gt1 = new GeoTree();
        GeoTree gt2 = new GeoTree();
        gt1.setGeoTree(irina, Relationship.WIFE, egor);
        gt2.setGeoTree(egor, Relationship.HUSBAND, irina);

        GeoTree gt3 = new GeoTree();
        gt3.setGeoTree(egor, Relationship.FATHER, petay);
        gt3.setGeoTree(irina, Relationship.MOTHER, petay);
        gt2.setGeoTree(petay, Relationship.SON, irina);
        gt1.setGeoTree(petay, Relationship.SON, egor);
        
        GeoTree gt4 = new GeoTree();
        gt4.setGeoTree(egor, Relationship.FATHER, masha);
        gt4.setGeoTree(irina, Relationship.MOTHER, masha);
        gt1.setGeoTree(masha, Relationship.DAUGHTER, egor);
        gt2.setGeoTree(masha, Relationship.DAUGHTER, irina);
        gt4.setGeoTree(masha, Relationship.SISTER, petay);
        gt3.setGeoTree(petay, Relationship.BROTHER, masha);

        GeoTree gt5 = new GeoTree();
        gt5.setGeoTree(petay, Relationship.FATHER, ivan);
        gt3.setGeoTree(ivan, Relationship.SON, petay);
        

        GeoTree gt6 = new GeoTree();
        gt6.setGeoTree(petay, Relationship.FATHER, ann);
        gt3.setGeoTree(ann, Relationship.DAUGHTER, petay);
        gt6.setGeoTree(ann, Relationship.SISTER, ivan);
        gt5.setGeoTree(ivan, Relationship.BROTHER, ann);
        

        GeoTree gt7 = new GeoTree();
        gt7.setGeoTree(petay, Relationship.FATHER, sasha);
        gt3.setGeoTree(sasha, Relationship.SON, petay);
        gt7.setGeoTree(sasha, Relationship.BROTHER, ivan);
        gt7.setGeoTree(sasha, Relationship.BROTHER, ann);
        gt5.setGeoTree(ivan, Relationship.BROTHER, sasha);
        gt6.setGeoTree(ann, Relationship.SISTER, sasha);
        
        hb.setFamily(gt1.getPair());
        hb.setFamily(gt2.getPair());
        hb.setFamily(gt3.getPair());
        hb.setFamily(gt4.getPair());
        hb.setFamily(gt5.getPair());
        hb.setFamily(gt6.getPair());
        hb.setFamily(gt7.getPair());
        
        System.out.println(irina);
        //System.out.println(hb.getAllTree());
        SaveResult.saveGeoTree(hb);
        
        //Ищем детей Ирины
        System.out.println("\nДети Ирины:");
        ArrayList<String> res = new Research(hb).spend(irina, Relationship.MOTHER);
        System.out.println(res);
        
        // Ищем детей Егора
        System.out.println("\nДети Егора:");
        System.out.println(new Research(hb).spend(egor, Relationship.FATHER));
        
        // Ищем мужа Ирины (Чья жена Ирина?)
        System.out.println("\nМуж Ирины");
        System.out.println(new Research(hb).spend(irina, Relationship.WIFE));

        // Ищем людей определенного возраста
        System.out.println(new Research(hb).searchAge());

               
        // Экспорт в файл temp.out через сериализацию текущего древа
        FileOutputStream outputStream = new FileOutputStream("SemOOP_DZ_03/temp.out");
        ObjectOutputStream oos = new ObjectOutputStream(outputStream);
        oos.writeObject(hb);
        oos.flush();
        oos.close();
        
        // Импорт из файла temp.out в древо через десериализацию
        HumanBase hbExp = new HumanBase();
        FileInputStream fis = new FileInputStream("SemOOP_DZ_03/temp.out");
        ObjectInputStream oin = new ObjectInputStream(fis);
        hbExp = (HumanBase) oin.readObject();
        System.out.println("\nВосстановленое древо после десериализации: \n");
        System.out.println(hbExp.getAllTree());
        oin.close();
    }
}
