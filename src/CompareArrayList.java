import java.util.ArrayList;

public class CompareArrayList {
    public static void main(String[] args){
        ArrayList<String> array1 = new ArrayList<String>();
        array1.add("apple");
        array1.add("pineapple");
        array1.add("grapes");
        array1.add("guava");
        System.out.println("Arraylist1  = " +array1);
        ArrayList<String> array2 = new ArrayList<String>();
        array2.add("orange");
        array2.add("mango");
        array2.add("plum");
        array2.add("dates");
        System.out.println("Arraylist2 = " +array2);

        if (array1.equals(array2) == true){
            System.out.println("Array List are equal");
        }
        else
        {
            System.out.println(" Array List are not equal");
        }
    }
}
