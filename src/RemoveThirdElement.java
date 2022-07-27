import java.util.ArrayList;

public class RemoveThirdElement {
    public static void main(String[] args) {
        ArrayList<Integer> arrlist = new ArrayList<>();
        arrlist.add(34);
        arrlist.add(32);
        arrlist.add(38);
        arrlist.add(43);
        arrlist.add(54);
        System.out.println("array element element = " +arrlist);
        arrlist.remove(3);
        System.out.println("remove successfully element = " +arrlist);
    }
}
