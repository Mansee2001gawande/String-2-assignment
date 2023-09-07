/*public class que1 {
    public static void main(String[] args) {
        String txt="TECHNOLOGY";
        for(int i=txt.length()-1;i>=0;i--){
            System.out.print(txt.charAt(i));
        }
    }     //YGOLONHCET
    
} */
class que1{
    public static void main(String[] args) {
        String a="chinki";
        int count=0;
        char []b=a.toCharArray();
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b.length;j++){
                if(b[i]==b[j])
                count++;
            }
        }
        System.out.print(count);
    }
}
