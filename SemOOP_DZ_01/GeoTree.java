package SemOOP_DZ_01;

import java.util.ArrayList;

public class GeoTree {
    
    private ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getTree() {
        return tree;
    }

    // связь родитель - ребенок, муж - жена
    public void setGeoTree(Human who, Relationship role, Human towhom){
        tree.add(new Node(who, role, towhom));
    }

    public void printGeoTree(){
        for(var el : tree) {
            System.out.println(el);
        }
    }
}
