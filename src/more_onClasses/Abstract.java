package more_onClasses;

public class Abstract {
    public static void main(String[] args) {

    }
    abstract static class Animal {
        public int age;
        public abstract int printAge();

    }
    static class Dog extends Animal {
        public int printAge() {
            return age;
        }
    }
}
