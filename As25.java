//25. Write a Java program to return the sum of the digits present in the given string. If there is no digits the sum return is 0
public class As25 {
    public static void main(String[] args) {
        String str ="my name is mansee";
        int sum=0;
        char ch[]=str.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='0'||ch[i]=='1'||ch[i]=='2'||ch[i]=='3'||ch[i]=='4'||ch[i]=='5'||ch[i]=='6'
            ||ch[i]=='7'||ch[i]=='8'||ch[i]=='9'){
                sum=(sum+ch[i]-48);
            }
        }
        System.out.println(sum);
    }
    
}
