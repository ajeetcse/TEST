import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SortArrayList {
    public static void main(String[] args){
        ArrayList<Integer> arrlist = new ArrayList<Integer>();
        System.out.println("Adding element to Arraylist");

        arrlist.add(7);
        arrlist.add(10);
        arrlist.add(5);
        arrlist.add(9);
        arrlist.add(1);
        arrlist.add(4);
        arrlist.add(3);
        arrlist.add(8);
        arrlist.add(2);
        arrlist.add(6);
        Collections.sort(arrlist);
        System.out.println(arrlist);
    }
}
