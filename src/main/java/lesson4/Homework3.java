package lesson4;
//Steve, Tim, Lucy, Steve, Pat, Angela, Tom, Tim, Anna, Lucy
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Homework3 {
    public static void main(String[] args) {
        Homework3 homework3 = new Homework3();
        homework3.removeDuplicates();
    }

    public void removeDuplicates (){
        ArrayList<String> arrayList = new ArrayList<String>();
        ArrayList<String> result = new ArrayList<String>();
        arrayList.add("Steve");
        arrayList.add("Tim");
        arrayList.add("Lucy");
        arrayList.add("Steve");
        arrayList.add("Pat");
        arrayList.add("Angela");
        arrayList.add("Tom");
        arrayList.add("Tim");
        arrayList.add("Anna");
        arrayList.add("Lucy");

        Collections.sort(arrayList);
        System.out.println(arrayList);
        for (int i = 0; i < arrayList.size()-1; i++) {
            if (arrayList.get(i) != arrayList.get(i + 1)) {
                result.add(arrayList.get(i));
            }
        }
        System.out.println(result);

}
}
