//12. Write a Java program to check whether two String objects contain the same data.
public class As12 {
    public static void main(String[] args) {
        String str1="mansee";
        String str2="gawande";

        int a=0;
        int b=0;

            for(int i=0;i<str1.length();i++){
            a=a+str1.charAt(i);
            //System.out.println(str1.charAt(i));      //mansee
         }
            for(int i=0;i<str2.length();i++){
            b=b+str2.charAt(i);
         }
            if(a==b){
            System.out.print("both string match ");
         }  else
            System.out.print("both string not matches");
         }
}
