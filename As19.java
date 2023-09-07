//19. Write a Java program to replace a specified character with another character
public class As19 {
    public static void main(String[] args) {
        String str="mansee";
        int pos=3-1;
        char rep='t';
        System.out.print(str);
        String p=str.substring(0,pos)+rep+str.substring(pos+1);
        System.out.print(" "+p);
    }
    
}
