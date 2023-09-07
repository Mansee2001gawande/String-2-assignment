//32. Write a Java program to print after removing duplicates from a given string
import java.util.Scanner;
public class As32 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the lengthof tE ARRAY");
        int length=sc.nextInt();

        int a[]=new int [length];
        System.out.println("enter the elements of an array:=");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("enter the poition of array you want to delete :=");
        int pos=sc.nextInt();

        for(int i=pos-1;i<a.length-1;i++){
          
            a[i]=a[i+1];
             length--;

        }
         System.out.println("after detete the position array:=");
        for(int i=0;i<a.length;i++){
         System.out.print(a[i]+" ");
        }
    }
}
