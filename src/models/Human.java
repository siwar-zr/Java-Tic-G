package models;

public class Human {

    private String name;
    private int age;

    public Human(){

    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void afficher(){

        System.out.println(age + " " + name);
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){

        return age;
    }


    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }
}
