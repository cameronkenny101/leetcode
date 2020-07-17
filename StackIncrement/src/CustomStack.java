import java.util.Stack;

public class CustomStack {

    Stack<Integer> stack;
    int size;
    int elements = 0;

    public CustomStack(int maxSize) {
        stack = new Stack();
        this.size = maxSize;
    }

    public void push(int x) {
        if(elements < size) {
            stack.push(x);
            elements++;
        }
    }

    public int pop() {
        if(elements == 0) {
            return -1;
        } else {
            elements--;
            return stack.pop();
        }
    }

    public void increment(int k, int val) {
        if(k > elements)
            k = elements;

        for(int i = 0; i < k; i++) {
            stack.set(i, stack.get(i) + val);
        }
    }
}
