package more_onClasses;

public class Interface {
    public static void main(String[] args) {
        interface Animal {
            public void eat();
            public void makeSound();
        }

        class Cat implements Animal {
            public void makeSound() {
                System.out.println("Meow");
            }
            public void eat() {
                System.out.println("omnomnom");
            }
        }

        class Program {
            public void main(String[] args) {
                Cat c = new Cat();
                c.eat();
            }
        }
    }
}
