//30. Write a Java program How to search a word inside a string?
import java.util.Scanner ;
public class As30 {
    public static void main(String[] args) {
        String  str1= "new pink flower";
       // String found="pink";
       Scanner sc=new Scanner (System.in);
       System.out.print("enter the word you want to find");
       String found=sc.nextLine();
        int check=str1.indexOf(found);
            //System.out.print(check);
            boolean val=str1.contains(found);
            System.out.print(val);     // true/false

            if(check>0){
                System.out.print("found word"+found);
            }else
                System.out.print("not found");
            
            }
            } 

        

    
    

