import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class CustomException extends Exception{
    public CustomException(String message){
        // call the constructor of Exception class
        super(message);
    }
}
class Main{
    ArrayList<String> languages = new ArrayList<>(Arrays.asList("java","Python","JavaScript"));
    //check the exception condition
    public void checkLanguage(String language) throws CustomException{
        //throws exception if language already present in arraylist
        if (languages.contains(language)){
            throw new CustomException(language + "already exists");
        }else {
            //insert language to Arraylist
            languages.add(language);
            System.out.println(language + " is added to the arrayList");
        }
    }
    public static void main(String[] args){
        Main obj = new Main();
        // exception is handled using try and catch
        try{
            obj.checkLanguage("Swift");
            obj.checkLanguage("java");
        }
        catch (CustomException e){
            System.out.println("[" + e + "] Exception Occured");
        }
    }
}