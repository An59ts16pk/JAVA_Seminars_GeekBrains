package SemOOP_DZ_03;

import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class GeoTree implements Serializable {
    
    private List<Node> pair = new ArrayList<>();
    private List<List<Node>> tree = new ArrayList<>();

    public GeoTree(ArrayList<Node> pair) {
        this.pair = pair;
    }

    public GeoTree() {
        this(new ArrayList<>());
    }

    public void setGeoTree(Human who, Relationship role, Human towhom) {
        this.pair.add(new Node(who, role, towhom));
        this.tree.add(pair);
    }

    public List<Node> getPair() {
        return pair;
    }

    public List<List<Node>> getGeoTree() {
        return tree;
    }

    // public ArrayList<Node> getTree() {
    //     return tree;
    // }

    // // связь родитель - ребенок, муж - жена
    // public void setGeoTree(Human who, Relationship role, Human towhom){
    //     tree.add(new Node(who, role, towhom));
    // }

    // public void printGeoTree(){
    //     for(var el : tree) {
    //         System.out.println(el);
    //     }
    // }

    @Override
    public String toString() {
        return "GeoTree: {" +
                "pairs=" + pair +
                '}';
    }
}
