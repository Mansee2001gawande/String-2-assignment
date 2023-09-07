//37. Write a Java program to check if the letter 'x' is present in the word 'String Exercises'
public class As37 {
    public static void main(String[] args) {
        String str1="xerox";
        char found='e';
        for(int i=0;i<str1.length();i++){
            char c=str1.charAt(i);
           // char c1=str1.charAt(1);
            //char c2=str1.charAt(2);
           // char c3=str1.charAt(3);
           // char c4=str1.charAt(4);
        

            if( c==found)
            //if(c==found||c1==found||c2==found||c3==found|| c4==found)
                System.out.println ("character is found in the word "+ str1.indexOf(found));
           
          //else
           // System.out.print("character is not found");
        }

    }
    
}
