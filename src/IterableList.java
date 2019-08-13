import java.util.ArrayList;

public class IterableList {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("one");
        stringArrayList.add("three");
        stringArrayList.add("four");
        stringArrayList.add("five");
        stringArrayList.add(0, "two");
        stringArrayList.add(null);
        stringArrayList.add("one");
        stringArrayList.add("two");

        stringArrayList.forEach(s->{
            System.out.println("the next element is");
            System.out.println(s);

        });
    }
}
