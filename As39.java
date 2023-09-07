//39. Write a Java program to Given string Convert Uppercase to Lowercase
public class As39 {
    public static void main(String[] args) {
        String str="MANSEE is the worst person";
        char a[]=str.toCharArray();

        for(int i=0;i<a.length;i++){
            if(a[i]>=65 && a[i]<=90){
                a [i]=(char)((int)a[i]+32);
            }
        }
        
            for(int j=0;j<a.length;j++){

            System.out.print(a[j]);
        }
    }
        }
        

