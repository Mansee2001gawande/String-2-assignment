//16. Write a Java program to convert all the characters in a string to Lowercase


public class As16 {
    public static void main(String[] args) {
        String str="MANSEE";
        ///System.out.print(str.toUpperCase());
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
    


    
    

