package SemOOP_DZ_06.MathCalk;

import SemOOP_DZ_06.Logg.Logger;
import SemOOP_DZ_06.Logg.Logirable;
import SemOOP_DZ_06.Logg.MainLogger;

public class Operation {
    Logirable logger;
    MainLogger ml = new MainLogger();
    public Operation(Logirable logger){
        this.logger = logger;
    }
    public Operation(){ }
    public void  getAnswer(String str){
        System.out.println(str);
        ml.doLog(new Logger(str));
    }
}
