package trenirovkadoma.Serializable;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args) {

//        try (FileInputStream fis = new FileInputStream("people.bin");
//            ObjectInputStream ois = new ObjectInputStream(fis)) {
        // сокращенное написание верхнего
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("people.bin"))){

         Person person1 = (Person) ois.readObject();
            System.out.println(person1);


//            //1 способ чтения из массив (относится к 1 способу записи)
//            int personCount = ois.readInt();
//            Person [] people = new Person[personCount];
//            for (int i = 0; i < personCount; i++) {
//               people[i] = (Person) ois.readObject();
//            }
//            System.out.println(Arrays.toString(people));
//
//
//            //2 способ чтения из массив (относится к 2 способу записи)
//            Person [] people1 = (Person[]) ois.readObject();
//            System.out.println(Arrays.toString(people1));
//
//
//
//

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
