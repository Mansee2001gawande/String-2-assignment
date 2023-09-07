//27. Write a Java program to Swap Two Strings
public class As27 {
    public static void main(String[] args) {
        String str="gawand";
        String str2="mansee";
        char ch[]=str.toCharArray();
        char ch1[]=str2.toCharArray();
        //for(int i=0;i<ch.length&&i<ch1.length ;i++){
            for(int i=0;i<ch.length;i++){
                for(int j=0;j<ch.length;j++){
            
            if(ch[i]>ch1[j]){
            ch[i]=(char)(ch[i]^ch1[j]);
            ch1[j]=(char)(ch[i]^ch1[j]);
            ch[i]=(char)(ch[i]^ch1[j]);
            System.out.print(ch[i]);
            System.out.print(ch1[j]);
            } 
        }
    }
        }
    }
    

