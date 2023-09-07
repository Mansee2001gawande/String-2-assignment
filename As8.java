//8. Write a Java program to test if a given string contains the specified sequence of char values
public class As8 {
    public static void main(String[] args) {
        String str="my father name is vijay gawande";
        String pop[]=  str.split(" ");

        //String match="father";
       // System.out.println(str.contains(match));    // 2nd string matches with string1
       char match[]={'f','a','t','h','e','r'};
       for(int i=0;i<pop.length;i++){
   
           char ch=pop[i].charAt(i);
           System.out.print(ch);
           for(int j=0;j<match.length;j++){
               if (ch==match[j]){
            System.out.println(pop[i]+" ");
               }
                                        
            }
        }
    }
}
    