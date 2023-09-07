//23. Write a Java program to trim any leading or trailing whitespace from a given string
public class As23 {
    public static void main(String[] args) {
        String str="      my name is mansee";    // string ke aage or piche ki space count krta hai middle ki nhi
        char []a=str.toCharArray();
        for(int i=0;i<a.length;i++){
            char var=' ';
            if(a[i]==var)
            continue;
          
          System.out.print(a[i]);
        }
    }
}
