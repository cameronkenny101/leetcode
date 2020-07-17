public class Main {

    public static void main(String args[]) {
    CustomStack obj = new CustomStack(5);
    obj.push(1);
    obj.push(2);
    obj.push(5);
    System.out.println(obj.pop());
    obj.increment(1, 100);
    System.out.println(obj.pop());
    System.out.println(obj.pop());
    }
}
