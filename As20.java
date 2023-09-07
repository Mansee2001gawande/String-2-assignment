//20. Write a Java program to replace each substring of a given string that matches the given regular
 //expression with the given replacement
public class As20 {  //string me se 1 word remove krke new word add krna hai ream exitis.
    public static void main(String[] args) {
        String str="my name issss mansee ";
        int pos=8;
        String rep="is";
        System.out.print(str);
        String p=str.replace("issss","is");
        System.out.print(" "+p);

    }
}
