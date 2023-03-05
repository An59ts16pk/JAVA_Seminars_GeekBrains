package SemOOP_DZ_02;

public class Human extends Person {
    private int id;
    private String firstName;
    private String secondName;
    private String lastName;
    private String gender;
    private int age;
    
    // public Human(int id, String firstName, String secondName, String lastName, String gender, int age) {
    //     this.id = id;
    //     this.firstName = firstName;
    //     this.secondName = secondName;
    //     this.lastName = lastName;
    //     this.gender = gender;
    //     this.age = age;
    // }
            
    public int getID() {return id;}
    public String getFirstName() {return firstName;}
    public String getSecondName() {return secondName;}
    public String getLastName() {return lastName;}
    public String getGender() {return gender;}
    public int getAge() {return age;}

    public void setID(int id) {this.id = id;}
    public void setFirstName(String firstName) {this.firstName = firstName;}
    public void setSecondName(String secondName) {this.secondName = secondName;}
    public void setLastName(String lastName) {this.lastName = lastName;}
    public void setGender(String gender) {this.gender = gender;}
    public void setAge(int age) {this.age = age;}

        
    // public String getInfo() {
    //     return String.format("{id=%d, fullName: %s %s %s, gender: %s, age: %d}",
    //      id, firstName, secondName, lastName, gender, age);
    // }

    @Override
    public String toString() {
        return String.format("{id=%d, fullName: %s %s %s, gender: %s, age: %d}",
        id, firstName, secondName, lastName, gender, age);
    }
}
