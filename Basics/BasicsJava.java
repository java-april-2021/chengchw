import java.util.ArrayList;
public class BasicsJava{

    public void printNum(){

        for(int i = 1; i < 256; i++){

            System.out.println(i);
        }
    }

    public void printOddNum(){

        for(int i = 1; i < 256; i += 2){

            System.out.println(i);
        }
    }

    public void printSum(){

        int sum = 0;
        for(int i = 1; i < 256; i++){

            sum += i;
            String PrintStr = "New number: " + i + " Sum: " + sum;
            System.out.println(PrintStr);
        }
    }

    public void iterateArray(int[] arr){

        for(int i = 0; i < arr.length; i++){

            System.out.println(arr[i]);
        }
    }

    public void findMax(int[] arr){

        int maxNum = arr[0];      
        for(int i = 0; i < arr.length; i++){

            if (maxNum < arr[i]){

                maxNum = arr[i];
            }            
        }
        System.out.println(maxNum);
    }

    public void getAverage(int[] arr){

        int sum = 0;      
        for(int i = 0; i < arr.length; i++){

            sum += arr[i];
                        
        }

        double avg = (double)sum/arr.length;
        System.out.println(avg);
    }

    public  ArrayList<Integer> arrayWithOdd(){

        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i = 1; i < 256; i+=2){

            list.add(i);
                        
        }

        return list;
    }

    
    public  int greaterThan(int[] arr, int y){

        int count = 0;

        for(int i = 0; i < arr.length; i++){

            if (arr[i]> y){

                count += 1;
            }
                        
        }

        return count;
    }

    public  int [] squareTheValue(int [] arr){

        
        int [] sqrarr = new int[arr.length];
        
        for(int i = 0; i < arr.length; i++){

            sqrarr[i] = arr[i]*arr[i];          
                        
        }

        return  sqrarr;
    }

    public  int [] eliNegNum(int [] arr){

       int [] eliarr = new int[arr.length];

        for(int i = 0; i < arr.length; i++){

            if (arr[i]< 0){

                eliarr[i] = 0;
            }

            else{

                eliarr[i] = arr[i];
            }
                        
        }

        return eliarr;
    }

    public  double [] maxMinAvg(int [] arr){

        double Max = (double)arr[0];
        double Min = (double)arr[0];
        double Sum = 0;

        for(int i = 0; i < arr.length; i++){

            Sum += arr[i];
            if (Max < arr[i]){
                Max = arr[i];
            }
            
            if (Min > arr[i]){

                Min = arr[i];
            }
        }

        double Avg = Sum/arr.length;
        double [] returnArr = {Max,Min,Avg};

        return returnArr;
    }

    public  int [] shitValArr(int [] arr){

        int [] shiarr = new int[arr.length];

        for(int i = 1; i < arr.length; i++){

            shiarr[i-1] = arr[i];
        }

        shiarr[arr.length-1] = 0;

        return shiarr;
    }




}