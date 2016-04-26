package com.huangbin.algorithm.chaprter1.slides;

import java.util.Stack;

/**
 * Created by huangbin
 * duizhan
 */
public class StackUtils {

    private static Stack stack = new Stack();


    public static void main(String args[]) {


        push(stack, "abc0");
        push(stack, "abc1");
        push(stack, "abc2");
        write(stack);
        stack = pop(stack);
        pop(stack);


    }


    public static Stack push(Stack stack, Object object) {

        stack.push(object);

        System.out.println("the size of the statck is " + stack.size());

        return stack;
    }

    public static Stack pop(Stack stack) {

        System.out.println("the object popped now is ---" + stack.pop());
        return stack;
    }


    public static void write(Stack stack) {

        for (int i = 0; i < stack.size(); i++) {
            System.out.println("stack-" + i + "----" + stack.get(i));
        }
    }


}
