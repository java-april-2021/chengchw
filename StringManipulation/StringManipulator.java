
public class StringManipulator{

    public String trimAndConcat(String StrA, String StrB){

       String strA = StrA.trim();
       String strB = StrB.trim();

        return strA+strB;
        
    }

    public Integer getIndexOrNull(String StrA, char C){

        Integer ind = StrA.indexOf(C);

        if (ind == -1){

            return null;
        }

        return ind;
        
    }

    public Integer getIndexOrNull(String StrA, String StrB){

        Integer ind = StrA.indexOf(StrB);

        if (ind == -1){

            return null;
        }

        return ind;
        
    }

    public String concatSubstring(String StrA, int a, int b, String StrB){

        String str = StrA.substring(a,b);


        return str+StrB;
        
    }

}