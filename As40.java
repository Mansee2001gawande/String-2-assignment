//40. Write a Java program to Count Number of Uppercase and Lowercase letters
public class As40 {
    public static void main(String[] args) {
        int count=0,count1=0;
        String str= "maNSeE iS ThE woRSt PerSoN";
        char a[]=str.toCharArray();
        for(int i=0;i<a.length;i++){
            if(a[i]>=65 && a[i]<=90){           //u/l
                count++;
            }
        }
            System.out.println("capital ch in given String is"+count);

            for(int i=0;i<str.length();i++){
            if(a[i]>=95 && a[i]<=122){          //l/u
                count1++;
            }
        }
             System.out.println("small ch in given String is"+count1);



    }
    
}
