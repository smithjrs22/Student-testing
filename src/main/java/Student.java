

public class Student {
    private String name;
    private int age;
    Student(){
        name = "Jenna";
        age = 30;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    void setNameAndAge(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String introduce(){
       return "hi i'm " + name + " and my age is " + age;
    }
}