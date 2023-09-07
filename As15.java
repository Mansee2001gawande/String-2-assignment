//15.Write a Java program to create a character array containing the contents of a string
        import java.util.Scanner;
    public class As15 { 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter length of an array :-");
        int length=sc.nextInt();

        char a[]=new char [length];
        System.out.print("enter character elements :-");
        for(int i=0;i<a.length;i++){
        a[i]=sc.next().charAt(0);
    }
        String s=  new String (a);
        System.out.print(s);

    }
    
}
