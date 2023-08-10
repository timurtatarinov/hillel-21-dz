package lesson45and46and47;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {

    public static void main(String[] args) {

        /* (lesson 45)
        Person person1 = new Person(1, "Bob");
        Person person2 = new Person(2, "Mike");
        */
        /* (lesson 46)
        Person[] people = { new Person(1, "Bob"),
                new Person(2, "Mike"),
                new Person(3, "Tom") };
        */

        Person person1 = new Person(1, "Mike");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("people.bin"))) {
            // FileOutputStream fos = new FileOutputStream("people.bin");
            // ObjectOutputStream oos = new ObjectOutputStream(fos);
            /* (lesson 45)
            oos.writeObject(person1);
            oos.writeObject(person2);
            */
            /* (lesson 46)
            oos.writeInt(people.length);

            for (Person person : people) {
                oos.writeObject(person);
            }
            */

            oos.writeObject(person1);

            //fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}