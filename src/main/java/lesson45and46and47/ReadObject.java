package lesson45and46and47;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObject {

    public static void main(String[] args) {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("people.bin"))) {
            // FileInputStream fis = new FileInputStream("people.bin");
            // ObjectInputStream ois = new ObjectInputStream(fis);
            /* (lesson 45)
            Person person1 = (Person) ois.readObject();
            Person person2 = (Person) ois.readObject();
            */
            /* (lesson 46)
            int personCount = ois.readInt();
            Person[] people = new Person[personCount];

            for (int i = 0; i < personCount; i++) {
                people[i] = (Person) ois.readObject();
            }
            */
            /* (lesson 46)
            Person[] people = (Person[]) ois.readObject();
            System.out.println(Arrays.toString(people));
            */
            /* (lesson 45)
            System.out.println(person1);
            System.out.println(person2);
            */

            Person person1 = (Person) ois.readObject();
            System.out.println(person1);

            //ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}