package trenirovkadoma.JavaColectionsFramevork.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> List = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            List.add(i);
        }
        for (int i = 0; i < List.size(); i++) {//выводим каждый элемент способ 1
            System.out.println(List.get(i));
        }

        for (Integer x : List) {//выводим каждый элемент способ 2
            System.out.println(x);
        }

        List.remove(5);
        System.out.println(List);


//            System.out.println(List);
//            System.out.println(List.get(0));
//            System.out.println(List.get(99));
//            System.out.println(List.size());


        }
    }

