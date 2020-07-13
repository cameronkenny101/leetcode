public class Main {

    public static void main(String args[]) {
        Stack myStack = new Stack();

        myStack.push(3);
        System.out.println(myStack.q1);
        myStack.push(7);
        System.out.println(myStack.q1);
        myStack.push(12);
        System.out.println(myStack.q1);
        myStack.pop();
        System.out.println(myStack.q1);
        System.out.println(myStack.top());
        System.out.println(myStack.empty());
    }
}
