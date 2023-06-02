public class Main {
    public static void main(String[] args) {
        Tree t = new Tree();
        t.insert("abc");
        t.insert("abc");
        t.insert("abc");
        System.out.println(t.delete("abc"));
    }
}
