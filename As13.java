//13. Write a Java program to get the contents of a given string as a byte array
public class As13 {
    public static void main(String[] args) {
        String str="peru is listning the music ";
        byte bytearr[]=str.getBytes();
        String newstring= new String (bytearr);
        System.out.print(newstring);               //peru is listning the music 
    }
    
}
