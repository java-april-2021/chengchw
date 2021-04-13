import java.util.*;


public class PuzzleJava{


    public int sumArray(int [] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }

    public ArrayList<Integer> greatThanTen(int [] arr){

        ArrayList<Integer> GreaterThanTen = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++){
            if (arr[i]> 10){
                GreaterThanTen.add(arr[i]);
            }
        }
        return GreaterThanTen; 
    }

    public ArrayList<String> shuffleArr(ArrayList<String> arr){

        Collections.shuffle(arr);
        return arr; 
    }

    public ArrayList<String> greaterThanFive(ArrayList<String> arr){

        ArrayList<String> GreaterThanFive = new ArrayList<String>();
        for (int i = 0 ; i < arr.size(); i++){

            if (arr.get(i).length() > 5){

                GreaterThanFive.add(arr.get(i));
            }
        }
        return GreaterThanFive; 
    }

    public ArrayList<Character> generateChar(){

        String CharStore = "abcdefghijklmnopqrstuvwxyz";

        ArrayList<Character> CharArr = new ArrayList<Character>();

        for(int i = 0; i<26; i++){

            CharArr.add(CharStore.charAt(i));
        }

        return CharArr;       

    }

    public ArrayList<Character> generateRanChar(){

        ArrayList<Character> CharRanArr = generateChar();
        Collections.shuffle(CharRanArr);

        return CharRanArr;
    }

    public ArrayList<Integer> genRanTen(){

        ArrayList<Integer> TenArr = new ArrayList<Integer>();
        Random r = new Random();
        for(int i = 0; i < 10; i++){

            TenArr.add(55 + r.nextInt(45));

        }
        
        return TenArr; 
    }
    
    
    public ArrayList<Integer> genRanSorTen(){

        ArrayList<Integer> TenArr = genRanTen();
        Collections.sort(TenArr);
        return TenArr; 
    }

    public String genRanString(){

        String NewString = "";
        String CharStore = "abcdefghijklmnopqrstuvwxyz";

        for(int i = 0; i < 5; i++){
            Random r = new Random();
            NewString += CharStore.charAt(r.nextInt(26));
        }
        return NewString; 
    }

    public ArrayList<String> genRanTenString(){

        ArrayList<String> TenStr = new ArrayList<String>();

        for (int i = 0; i < 10; i++){

            TenStr.add(genRanString());

        }

        return TenStr;

    }

}