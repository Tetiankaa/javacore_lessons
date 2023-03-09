package lesson2.generics;

public class User<ID> {
    private ID id;
    private String name;

    public User() {
    }

    public User(ID id, String name) {
        this.id = id;
        this.name = name;
    }

    public ID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(ID id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}