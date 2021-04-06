package Exceptions_List;

import java.util.HashMap;
class hasmap{
    public static void main(String[ ] args) {
        HashMap<String, String> m = new HashMap<>();
        m.put("A", "First");
        m.put("B", "Second");
        m.put("C", "Third");
        System.out.println(m.get("B"));
    }
}
