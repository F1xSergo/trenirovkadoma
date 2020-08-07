package trenirovkadoma.JavaColectionsFramevork.InterfaceIterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

//java 5
        for (int x : list)// использует iterator внутри
            System.out.println(x);
        System.out.println();

        Iterator<Integer> iterator = list.iterator();
        int idx = 0;
        //before java 5
        while (iterator.hasNext()){
            System.out.println(iterator.next());

            if(idx ==1)
                iterator.remove();

            idx++;
        }
        System.out.println(list);

    }
}
