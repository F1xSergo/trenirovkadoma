package trenirovkadoma.Serializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Person person1 = new Person(1, "Mike");

        Person[] people = {new Person(1, "Bob"), new Person(2, "Mike"), new Person(3, "Tom")};


//        try (FileOutputStream fos = new FileOutputStream("people.bin")){
//            ObjectOutputStream oos = new ObjectOutputStream(fos);

            try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("people.bin"))){
            // сокращенное написание верхнего


            oos.writeObject(person1);
//            //1 способ записи в массив
//            oos.writeInt(people.length);
//            for (Person person : people) {
//                oos.writeObject(person);
//            }
//
//            //2 способ записи в массив
//            oos.writeObject(people);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
