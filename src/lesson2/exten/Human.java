 package lesson2.exten;

/*final*/ public class Human { //- final, значить що цей метод кігцевий і перевизначити його неможна
    private String name;
    private int age;



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

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Human() {
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
