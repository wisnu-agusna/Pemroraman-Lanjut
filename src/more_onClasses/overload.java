package more_onClasses;

public class overload {
        public void doSomething() {
            System.out.println("A");
        }
        public void doSomething(String str) {
            System.out.println(str);
        }
    }
    class method {
        public static void main(String[ ] args) {
            overload object = new overload();
            object.doSomething ("B");
        }
    }

