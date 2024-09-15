package lesson4;
//Batmobile (ID12), Light Saber(ID45), Wonder Woman (ID6), Hello Kitty Bag(ID201), and Junior QA Analyst Doll (ID56)

import java.util.HashMap;

public class Homework2 {

    private HashMap<Integer, String> toyStore;

    public Homework2() {

        toyStore = new HashMap<>();
        toyStore.put(12, "Batmobile");
        toyStore.put(45, "Light Saber");
        toyStore.put(6, "Wonder Woman");
        toyStore.put(201, "Hello Kitty Bag");
        toyStore.put(56, "Junior QA Analyst Doll");
    }

    public static void main(String[] args) {
        Homework2 homework = new Homework2();

        System.out.println(homework.getToyById(6));
        System.out.println(homework.getToyById(201));
        System.out.println(homework.getToyById(999));
    }


    public String getToyById(int id) {

        if (toyStore.containsKey(id)) {
            return toyStore.get(id);
        } else {
            return "Toy with this ID not found";
        }
    }
}
//наверно все это не правильно и я не верно понимаю задание,но сделала как смогла:(