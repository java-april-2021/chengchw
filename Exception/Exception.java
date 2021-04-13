import java.util.*;
// class Exception extends Exception{};

public class Exception {
    public static void main(String[] args) {
        
        ArrayList<Object> myList= new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World"); 

        for (int i = 0; i < myList.size(); i++){

             try{

                Integer castedValue = (Integer) myList.get(i);
                System.out.println("Succesful Cast " + castedValue + " value to Integer");

             }

             catch (java.lang.Exception e){

                System.out.println("Fail to Cast " + myList.get(i) + " value to Integer");


             }

        }
        
    }
}