//35. Write a Java program to find maximum between two string
public class As35 {
    public static void main(String[] args) {
        boolean flag =true;
        String str1="mansee";
        String str2="gawande";
        char a[]=str1.toCharArray();
        char b[]=str2.toCharArray();
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]>b[j]){
                    flag=true;
                    break;
                
                 System.out.print("string 1 is greater"+a[i]);
                }
                else {
                    System.out.print("2nd string is greater"+b[j]);
                }
            }
        }


    }
    
}
