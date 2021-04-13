import java.util.*;

public class PuzzleJavaTest{
    public static void main(String[] args){

        int [] MyArr = {3,5,1,2,7,9,8,13,25,32};

        PuzzleJava PJ = new PuzzleJava();

        int sumation = PJ.sumArray(MyArr);
        System.out.println(sumation);

        ArrayList<Integer> GreaterThanTenList = PJ.greatThanTen(MyArr);

        System.out.println(GreaterThanTenList);

        String [] names = {"Nancy","Jinichi","Fujibayashi","Momochi","Ishikawa"};
        ArrayList<String> NameList = new ArrayList<String>(Arrays.asList(names));

        System.out.println(PJ.shuffleArr(NameList));
        System.out.println(PJ.greaterThanFive(NameList));

        System.out.println(PJ.genRanTen());
        System.out.println(PJ.genRanSorTen());
        System.out.println(PJ.genRanString());
        System.out.println(PJ.genRanTenString());
        System.out.println(PJ.generateChar());

        ArrayList<Character> RandomChar = PJ.generateRanChar();
        System.out.println(RandomChar);
        // System.out.println(RandomChar.get(0));

        if (RandomChar.get(0) == 'a' ||
            RandomChar.get(0) == 'e' ||
            RandomChar.get(0) == 'i' ||
            RandomChar.get(0) == 'o' ||
            RandomChar.get(0) == 'u'){

                System.out.println("This is Vowel");
            }
        
        else{

                System.out.println("This is not Vowel");
        }

        // System.out.println(PJ.generateTen());





    }
}