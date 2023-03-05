package SemOOP_DZ_02;

public class CreateHuman {

    private static CreateHuman instance;

    public static CreateHuman getInstance(){
        if (instance == null) instance = new CreateHuman();
        instance.init();
        return instance;
    }

    private CreateHuman(){
    
    }

    Human temp;
    int count = 1;
    private void init(){
        temp = new Human();

        temp.setID(count);
        temp.setFirstName("");
        temp.setSecondName("");
        temp.setLastName("");
        temp.setGender("");
        temp.setAge(0);
    }

    public CreateHuman setID() {
        temp.setID(count);
        count++;
        return this;
    }

    public CreateHuman setFirstName(String firstName) {
        temp.setFirstName(firstName);
        return this;
    }

    public CreateHuman setSecondName(String secondName) {
        temp.setSecondName(secondName);
        return this;
    }

    public CreateHuman setLastName(String lastName) {
        temp.setLastName(lastName);
        return this;
    }

    public CreateHuman setGender(String gender) {
        temp.setGender(gender);
        return this;
    }

    public CreateHuman setAge(int age) {
        temp.setAge(age);
        return this;
    }

    public  Human create(){
        return temp;
    }
}
