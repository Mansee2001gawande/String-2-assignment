//46. Write a program to First alphabet capital of each word in given string
public class As46 {
    public static void main(String[] args) {
        String str="shree ram viddhyalay prathmik shaada";
        String words[]=str.split(" ");
        String blank="";

        for (int i = 0; i <words.length; i++) {
            char a[]=words[i].toCharArray();
            

            if(a[0]>=95){
               a [0]=(char)(int)(a[0]-32);
               words[i]=new String (a);

            }
        
        blank=blank +words[i];
        }
        System.out.print(" "+blank);
        }

    }
    
        
        


    

