package Exceptions_List;

public class files {

        public static <File> void main(String[] args) {

            File file = new File("a.txt");
            if(file.exists()) {
                System.out.println("Yes");
            }
        }
    }

