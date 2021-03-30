package co.com.sofka.CrudPerson.model;

public class Person {

    private final Long id;
    private final String cc;
    private final String name;

    public Person(Long id, String cc, String name) {
        this.id = id;
        this.cc = cc;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getCc() {
        return cc;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", cc='" + cc + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
