//11. Write a Java program to check whether a given string ends with the contents of another string
public class As11 {
    public static void main(String[] args) {
         String str1 = "the girl named is mansee";
        String str2 = "see look at theree";
        String ending = "ee";
         boolean laste1 = str1.endsWith(ending);             // to find last given ending character
         boolean laste2 = str2.endsWith(ending);            //string.endswith(ending);
        
        System.out.println("1 st string last two character "+ending+" " +laste1);
        System.out.println( "2 nd string last two character " + ending +" "+ laste2);
            }
        }
        
    
    

