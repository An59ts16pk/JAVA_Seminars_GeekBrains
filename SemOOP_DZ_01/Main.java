package SemOOP_DZ_01;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Human irina = new Human(1, "Ирина", "Петровна", "Иванова", 58, "ж");
        Human egor = new Human(2, "Егор", "Васильевич", "Иванов", 62, "м");
        Human petay = new Human(3, "Петя", "Егорович", "Иванов", 32, "м");
        Human masha = new Human(4, "Маша", "Егоровна", "Иванова", 27, "ж");
        Human ivan = new Human(5, "Ваня", "Петрович", "Иванов", 10, "м");
        Human ann = new Human(6, "Анна", "Петровна", "Иванова", 8, "ж");
        Human sasha = new Human(7, "Саша", "Петрович", "Иванов", 5, "м");

        GeoTree gt = new GeoTree();
        
        gt.setGeoTree(egor, Relationship.Husband, irina);
        gt.setGeoTree(irina, Relationship.Wife, egor);

        gt.setGeoTree(petay, Relationship.Son, egor);
        gt.setGeoTree(petay, Relationship.Son, irina);
        gt.setGeoTree(egor, Relationship.Father, petay);
        gt.setGeoTree(irina, Relationship.Mother, petay);

        gt.setGeoTree(masha, Relationship.Daughter, egor);
        gt.setGeoTree(masha, Relationship.Daughter, irina);
        gt.setGeoTree(egor, Relationship.Father, masha);
        gt.setGeoTree(irina, Relationship.Mother, masha);

        gt.setGeoTree(ivan, Relationship.Son, petay);
        gt.setGeoTree(petay, Relationship.Father, ivan);
        
        gt.setGeoTree(ann, Relationship.Daughter, petay);
        gt.setGeoTree(petay, Relationship.Father, ann);

        gt.setGeoTree(sasha, Relationship.Son, petay);
        gt.setGeoTree(petay, Relationship.Father, sasha);

        // System.out.println(irina.getInfo());
        // System.out.println(egor.getInfo());
        //gt.printGeoTree();

        // Ищем детей Ирины
        System.out.println("\nДети Ирины:");
        ArrayList<String> res = new Research(gt).spend(irina, Relationship.Mother);
        System.out.println(res);
        
        SaveResult.saveRes("Дети Ирины: ", res);
        
        
        // Ищем детей Егора
        System.out.println("\nДети Егора:");
        System.out.println(new Research(gt).spend(egor, Relationship.Father));
        
        // Ищем мужа Ирины (Чья жена Ирина?)
        System.out.println("\nМуж Ирины");
        System.out.println(new Research(gt).spend(irina, Relationship.Wife));

        // Ищем людей определенного возраста
        System.out.println(new Research(gt).searchAge());
    }
}
