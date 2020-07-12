public class Main {

    public static void main(String args[]) {
        Skiplist skiplist = new Skiplist();
        System.out.println(skiplist.search(4));
        skiplist.add(4);
        System.out.println(skiplist.search(4));
    }
}
