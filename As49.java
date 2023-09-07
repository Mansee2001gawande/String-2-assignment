//49. Write a program to Check given strings are Anagram or not
public class As49 {
    public static void main(String[] args) {
        String str1= "TRIANGLE";
        String str2="INTEGRAL";

        int a=0;
        int b=0;

        for(int i=0;i<str1.length();i++){
            a=a+str1.charAt(i);
            //System.out.print(str1.charAt(0));
        }
        for(int i=0;i<str2.length();i++){
            b=b+str2.charAt(i);
            //System.out.print(str2.charAt(0));
        }
        if(a==b){
            System.out.println("string is anagram");
        } else {
        System.out.println("String is not anagram");
        }
     }
}
