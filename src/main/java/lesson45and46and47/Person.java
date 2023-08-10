package lesson45and46and47;

import java.io.Serializable;

public class Person implements Serializable {

    private static final long serialVersionUID = -168853438691580531L;

    // private static final long serialVersionUID = 6549176057625971368L;

    private /*transient*/ int id;
    private /*transient*/ String personName;
    private int age = 10;
    private byte type;



    public Person(int id, String name) {
        this.id = id;
        this.personName = name;
    }

    public int getId() { return id; }

    public String getName() { return personName; }

    @Override
    public String toString() { return id + " : " + personName; }

}