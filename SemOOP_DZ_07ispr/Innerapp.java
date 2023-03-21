package SemOOP_DZ_07ispr;

import java.util.Objects;

public class Innerapp {
    IInterface v;

    public Innerapp(IInterface v){
        this.v = Objects.requireNonNullElseGet(v, NullInterface::new);
    }
    
    void write() {
        v.print();
    }
}
