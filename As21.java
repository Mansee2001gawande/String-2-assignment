//21. Write a Java program to check whether a given string starts with the contents of another string
public class As21 {
    public static void main(String[] args) {
        String str1="there is a temple";
        char a[]=new char[str1.charAt(0)];
        String in=" ";
        for(int i=0;i<str1.length();i++){
            in=in+str1.charAt(i);
            System.out.println(in);
        }
    }
}
