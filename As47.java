//47. Write a program to Convert a character array to string
import java.util.Scanner;
public class As47 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("enter the length of the array");
        int length=sc.nextInt();

        char a[]=new char [length];
        System.out.print("enter the character series");
        for(int i=0;i<a.length;i++){
         a[i]= sc.next().charAt(0);
        }
        String s=new String(a);
        System.out.print(s);
    }
    
}
