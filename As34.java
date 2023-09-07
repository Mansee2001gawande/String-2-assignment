//34. Write a Java program to reverse words in a given string
public class As34{
    public static void main(String[] args) {
    String str="my pappa is best father in th world";
    char a[]=str.toCharArray();
    for(int i=a.length-1;i>=0;i--){
        System.out.print(a[i]);
    }
    }
}