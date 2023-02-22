package SemOOP_DZ_01;

public class Human {
    private int id;
    private String firstName;
    private String secondName;
    private String lastName;
    private int age;
    private String  gender;
            
    public Human(int id, String firstName, String secondName, String lastName, int age, String gender) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    public int getID() {return id;}
    public String getFirstName() {return firstName;}
    public String getSecondName() {return secondName;}
    public String getLastName() {return lastName;}
    public int getAge() {return age;}
    public String getGender() {return gender;}
    

    public void setID(int id) {this.id = id;}
    public void setFirstName(String firstName) {this.firstName = firstName;}
    public void setSecondName(String secondName) {this.secondName = secondName;}
    public void setLastName(String lastName) {this.lastName = lastName;}
    public void setAge(int age) {this.age = age;}
    public void setGender(String gender) {this.gender = gender;}
    
    public String getInfo() {
        return String.format("{id=%d, fullName: %s %s %s, age: %d, gender: %s}",
         id, firstName, secondName, lastName, age, gender);
    }
}
