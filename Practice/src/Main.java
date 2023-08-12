public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Parent.Child child = parent.new Child();

        child.setInner(42);
        System.out.println(child.getInner());

        System.out.println(parent.outer);

        parent.outer = child.inner;

    }
}