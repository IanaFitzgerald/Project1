package lesson4;
import java.util.HashMap;
public class HW5 {
    public static void main(String[] args) {
        System.out.println(getToyById(6));
        System.out.println(getToyById(201));
        System.out.println(getToyById(999));
    }

    public static String getToyById(int id) {
        HashMap<Integer, String> toyStore = new HashMap<>();
        toyStore.put(12, "Batmobile");
        toyStore.put(45, "Light Saber");
        toyStore.put(6, "Wonder Woman");
        toyStore.put(201, "Hello Kitty Bag");
        toyStore.put(56, "Junior QA Analyst Doll");
        if (toyStore.containsKey(id)) {
            return toyStore.get(id);
        } else {
            return "Toy with this ID not found";
        }
    }
}
