import java.util.ArrayList;
import java.util.Scanner;

public class sumOfFirst {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the N values");
        int n = sc.nextInt();
        ArrayList<Integer> interger = new ArrayList<>();
        for (int i=0;i<n;i++){
            interger.add(i);
        }
        Integer arr = interger.stream().reduce(0,(a,b)-> a+b);
        System.out.println(arr);
    }
}
