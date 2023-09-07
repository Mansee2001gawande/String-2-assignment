//31. Write a Java program to find first non repeating character in a string
public class As31 { // find unique  character who does not repeat in string ;
    public static void main(String[] args) {
       String  str="mnanmsee";
       int count =0;
       char dnr='a';
       boolean flag =true;


            char ch[]= str.toCharArray();
            for (int i=0;i<ch.length;i++){
                if(ch[i]==dnr){
                flag=true;
                count++;
                }

            }
         if (flag=true){
         System.out.println("found non repeating character "+dnr+" "+count);
         } else
        System.out.println("not found repeating ch");

        }
    }
    

    

