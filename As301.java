//30. Write a Java program How to search a word inside a string?
public class As301{
    public static void main(String[] args) {
        String str="my name is mansee";
        String search="mansee";

         String a[]=str.split(" ");
        /*  for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
         }*/
        boolean flag=false;
        for(int i=0;i<a.length;i++){
            if(a[i].equals(search)){
                flag=true;
            }
        }
        if(flag)
        System.out.println("found : "+search);
        else
        System.out.println("not found");

    }
}


    
