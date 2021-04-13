public class StringManipulatorTest{

    public static void main(String[] args){


        System.out.println("First Method");
        StringManipulator manipulator = new StringManipulator();
        String str = manipulator.trimAndConcat("    Hello     ","     World    ");
        System.out.println(str); // HelloWorld 
        System.out.println("Second Method");
        StringManipulator manipulator2 = new StringManipulator();
        char letter = 'o';
        Integer a = manipulator2.getIndexOrNull("Coding", letter);
        Integer b = manipulator2.getIndexOrNull("Hello World", letter);
        Integer c = manipulator2.getIndexOrNull("Hi", letter);
        System.out.println(a); // 1
        System.out.println(b); // 4
        System.out.println(c); // null
        System.out.println("Third Method");
        StringManipulator manipulator3 = new StringManipulator();
        String word = "Hello";
        String subString = "llo";
        String notSubString = "world";
        Integer d = manipulator3.getIndexOrNull(word, subString);
        Integer e = manipulator3.getIndexOrNull(word, notSubString);
        System.out.println(d); // 2
        System.out.println(e); // null
        System.out.println("Forth Method");
        StringManipulator manipulator4 = new StringManipulator();
        String word2 = manipulator4.concatSubstring("Hello", 1, 2, "world");
        System.out.println(word2); // eworld

    }
}