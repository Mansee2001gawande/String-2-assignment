//24. Write a Java program to create a new string repeating every character twice of a given string
public class As24 {
    public static void main(String[] args) {
        String str="mansee";
        char ch[]=str.toCharArray();
        char rep[]=new char[ch.length*2];
        for(int i=0;i<ch.length;i++){
            rep[i*2]=ch[i];
             rep[i*2+1]=ch[i];
        }
        for(int i=0;i<rep.length;i++){
            System.out.print(rep[i]);
        }
    }
    
}
