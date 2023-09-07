//29. Write a Java program to Reverse Each Word of a String
public class As29 {
    public static void main(String[] args) {
        String str="my name is mansee";
        char a[]=str.toCharArray();
        for(int i=a.length-1;i>=0;i--){
            System.out.print( a[i]);
        }
    }

}
