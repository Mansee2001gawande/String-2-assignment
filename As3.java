//4. Write a Java program to count a number of Unicode code points in the specified text range of a String
public class As3 {      //codePointAt()	Returns the Unicode of the character at the specified index	
    public static void main(String[] args) {     //unicode =ascii value
        // String str="mansee";
        /*int t1=str.codePointAt(0);
        int t2=str.codePointAt(1);
        int t3=str.codePointAt(2);
        int t4=str.codePointAt(3);
        int t5=str.codePointAt(4);
        int t6=str.codePointAt(5);
        System.out.print(t1+" "+t2+" "+t3+" "+t4+" "+t5+" "+t6);  */

         String str="mansee";
         //char a[]=str.toCharArray();      

        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(0);
        }
            int r  = str.charAt(0);
            int r1 = str.charAt(1);
            int r2 = str.charAt(2);
            int r3 = str.charAt(3);
            int r4 = str.charAt(4);
            int r5 = str.charAt(5);  
          
        System.out.print(r+" "+r1+" "+r2+" "+r3+" "+r4+" "+r5);  
           }
        }

    

    

