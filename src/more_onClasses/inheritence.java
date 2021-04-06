package more_onClasses;

class inheritence {
        public inheritence() {
            System.out.println("New A");
        }
    }
    class B extends inheritence {
        public B() {
            System.out.println("New B");
        }
    }

    class Program {
        public static void main(String[ ] args) {
            B obj = new B();
        }
    }

