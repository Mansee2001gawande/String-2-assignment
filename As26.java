//26. Write a Java program to Count words in Given String
public class As26 {
    public static void main(String[] args) {
        String str="my sister is the best";
                 // 123456789012345678901
        int count=0;
        char ch[]=str.toCharArray();
        for(int i=0;i<ch.length;i++){
             count++;
        }
        System.out.print(count);
    }
}
