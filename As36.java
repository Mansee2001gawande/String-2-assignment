//36. Write a Java program How to check Palindrome String
public class As36 {
    public static void main(String[] args) {
        String str1="madam";
        char a[]=new char[str1.charAt(0)];
        String in=" ";
        for(int i=str1.length()-1;i>=0;i--){
            in=in+str1.charAt(i);

    }
                System.out.println("string is palindrome"+in);

}
}
