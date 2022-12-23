public abstract class Animal {
    private String name;
    private int age;
    private String details; // mo ta

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Animal() {

    }

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal(String name, int age, String details) {
        this.name = name;
        this.age = age;
        this.details = details;
    }

    public String toString() {
        return "name : " + this.name + ", age : " + this.age + " years\ndetails: " + this.details;
    }

    public abstract void showInfor();

    public abstract void chirp(); // tieng keu

}
