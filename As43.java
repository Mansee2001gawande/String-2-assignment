//43. Write a program to Convert any type of value to string value using String.valueOf() method
public class As43 {      //return the value of given string 
    public static void main(String[] args) {
        String str="everybody is watching me";
        System.out.print(String.valueOf(str));         // it return any string ,int,boolean,char etc

        int a=40;
        System.out.println(String.valueOf(" "+a+10));
    }
}
