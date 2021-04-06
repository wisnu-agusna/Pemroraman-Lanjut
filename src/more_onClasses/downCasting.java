package more_onClasses;

public class downCasting {
    public static void main(String[] args) {
        System.out.println("A");
    }
}
class type extends downCasting {
    public void print() {
        System.out.println("B");
    }
    public static void main(String[ ] args) {
        downCasting object = new type();
        type b = (type) object;
        b.print();
    }
}


