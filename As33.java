//33. Write a Java program to find the maximum occurring character in a string
import java.util.Scanner;
public class As33 {
    public static void main(String[] args) {
        int i,max;
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the string :=");
        String str=sc.nextLine();
    //String str="peru drinking fizz";

         int a[]=new int [str.length()];     
        char strarr[]=str.toCharArray();
        char repeat=str.charAt(0);


        for(i=0;i<strarr.length;i++){
            a[i]=1;                              //count=1
        for(int j=i+1;j<strarr.length;j++){
           if(strarr[i]==strarr[j]){
            a[i]++;                      //count++;
            break;
           }
        }
    }
        max=a[0];
    for(i=0;i<a.length;i++){
        if(max==a[i]){
            max=a[i];
            repeat=strarr[i];
        }
    }
    System.out.println("max repeat character:= "+repeat);
    System.out.println("repeat character count:= "+max);
    }
} 
/*char ch[]=str.toCharArray();
for( i=0;i<ch.length;i++){
    int count=1;
    for(int j=i+1;j<ch.length;j++){
        if(ch[i]!=ch[j]){
            count++;
            break;
        }
    
         System.out.print(" "+ch[j]+" "+count);
        }
    }
}
} 
