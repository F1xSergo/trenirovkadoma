package trenirovkadoma.Serializable;

import java.io.Serializable;

public class Person implements Serializable {

    private static final long serialVersionUID = 1394653650568010885L;
    private int id;
    private String personName;
    private int age;
    private byte type;



    public Person(int id, String name) {
        this.id = id;
        this.personName = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return personName;
    }

    @Override
    public String toString() {
        return id + " : " + personName;
    }
}
