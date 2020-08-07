package trenirovkadoma.JavaColectionsFramevork.Stack;

import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
// 5 <- 3 <- 1 (последний заходит - первый выходит)

        stack.push(5);
        stack.push(3);
        stack.push(1);

//        System.out.println(stack.peek());// показывает элемент, но не выводит
//        System.out.println(stack.pop());// выводит элемент

        while (!stack.empty()){
            System.out.println(stack.pop());
        }



    }
}
