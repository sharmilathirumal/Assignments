package org.example;

import java.util.Stack;

public class StackProgram {
    private Stack<Integer> stack;

    public StackProgram() {
        stack = new Stack<>();
    }

    // a. Push element onto the stack
    public void pushElement(int element) {
        stack.push(element);
        System.out.println(element + " pushed to the stack.");
    }

    // b. Pop element from the stack
    public void popElement() {
        if (!stack.isEmpty()) {
            int removed = stack.pop();
            System.out.println(removed + " popped from the stack.");
        } else {
            System.out.println("Stack is empty. Cannot pop.");
        }
    }

    // c. Check if stack is empty
    public void checkEmpty() {
        if (stack.isEmpty()) {
            System.out.println("The stack is empty.");
        } else {
            System.out.println("The stack is NOT empty.");
        }
    }

    public static void main(String[] args) {
        StackProgram myStack = new StackProgram();

        myStack.pushElement(10);
        myStack.pushElement(20);
        myStack.pushElement(30);

        myStack.popElement();

        myStack.checkEmpty();
    }

}

/* output
10 pushed to the stack.
20 pushed to the stack.
30 pushed to the stack.
30 popped from the stack.
The stack is NOT empty.
 */