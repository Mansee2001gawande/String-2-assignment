//2. Write a Java program to get the character at the given index within the String
import java.util.Scanner;class As2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str="parrot";
        System.out.print("enter the index position"); 
        int index=sc.nextInt();
        String s2="";
        for(int i=0;i<str.length();i++){
            s2=s2+str.charAt(i);
        }
            System.out.print(s2);
            index=s2.charAt(index);    //index =111
            System.out.println(" "+(char)index);

        
    }
}