//38. Write a Java program to Given string Convert Lowercase to Uppercase
public class As38 {
    public static void main(String[] args) {
        String str="mansee is the worst person";
        char a[]=str.toCharArray();
        for(int i=0;i<str.length();i++){
            if(a[i]>=95 &&a[i]<=122){
            a[i]=(char)((int)(a[i]-32));
        }
    }
    for(int j=0;j<str.length();j++){
        System.out.print(a[j]);
    }
    }
}
