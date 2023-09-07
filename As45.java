//45. Write a program to Compare the strings using equals(), compareTo() and == operator
public class As45 {
    public static void main(String[] args) {
        String str1="my name is mansee";
        String str2="my name is mansee";

        String a[]=str1.split(" ");
        String b[]=str2.split(" ");

        /*  for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
         }*/
        boolean flag=false;
        for(int i=0;i<a.length;i++){
        for(int j=0;j<b.length;j++){

            if (a[i]==b[j])
                flag=true;
            }
        }
    
        if(flag){
            System.out.print("both str are not equal");
        } else {
            System.out.print("string is equal");
        }

        for(int i=0;i<a.length;i++){
        for(int j=0;j<b.length;j++){

             if(a[i].equals(b[j])){          

                flag=true;
            }
        }
    }
    
        if(flag){
           /* System.out.print(" both str are not equal"); */ System.out.println(" "+str1.compareTo(str2)); 
        } else {
            System.out.print(" string is equal");
        }








    }
}
