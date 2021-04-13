import java.util.ArrayList;
import java.util.Arrays;
public class BasicsJavaTest{

    public static void main(String[] args){

        int [] arr = {1,-2,-5,3,-9,4,5,10};

        BasicsJava BJ = new BasicsJava();

        System.out.println("Print 1 to 255");
        BJ.printNum();
        System.out.println("Print odd number from 1 to 255");
        BJ.printOddNum();
        System.out.println("Print Sum");
        BJ.printSum();
        System.out.println("Iterating through an array");
        BJ.iterateArray(arr);
        System.out.println("Find Max");
        BJ.findMax(arr);
        System.out.println("Get Average");
        BJ.getAverage(arr);

        System.out.println("Array with Odd Numbers");
        ArrayList<Integer> ArrayListPrint =  BJ.arrayWithOdd();
        System.out.println(ArrayListPrint);

        System.out.println("Greater Than Y");
        int greater = BJ.greaterThan(arr, 3);
        System.out.println(greater);

        System.out.println("Square the values");
        int [] SquareArr = BJ.squareTheValue(arr);
        System.out.println(Arrays.toString(SquareArr));
        //
        System.out.println("Eliminate Negative Numbers");
        int [] prtarr = BJ.eliNegNum(arr);
        System.out.println(Arrays.toString(prtarr));

        System.out.println("Max, Min, and Average");
        double [] prtmaxminave = BJ.maxMinAvg(arr);
        System.out.println(Arrays.toString(prtmaxminave));

        System.out.println("Shifting the Values in the Array");
        int [] ShiftArr = BJ.shitValArr(arr);
        System.out.println(Arrays.toString(ShiftArr));









    }

}