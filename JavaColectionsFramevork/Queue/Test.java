package trenirovkadoma.JavaColectionsFramevork.Queue;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Test {
    public static void main(String[] args) {
        Person person1 = new Person(1);
        Person person2 = new Person(2);
        Person person3 = new Person(3);
        Person person4 = new Person(4);

       // Queue<Person> people = new LinkedList<>();
        Queue<Person> people = new ArrayBlockingQueue<Person>(10);
        people.add(person3);
        people.add(person2);
        people.add(person4);
        people.add(person1);


            System.out.println(people + " //вывели список");

        System.out.println(people.remove() + " //изьяли человека");//изьяли человека
        System.out.println(people.peek() + " // посмотрели на человека, но не изьяли");// посмотрели на человека, но не изьяли
        System.out.println(people + " //вывели список после изьятия");//вывели список после изьятия



 /* Алишев - очередь Queue(источник)
                        Методы(выводят ошибку           методы(не выводят ошибку
                              в случае ошибки)                  в случае ошибки)
                        Throws Exeption                 Return special value
insert                  add(e)                          offer(E)
remove                  remove()                        poll()
examine                 element()                       peek()
  */


    }
}
class Person{
    private int id;

    public Person(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                '}';
    }
}
