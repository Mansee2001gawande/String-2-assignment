//14. Write a Java program to get the canonical representation of the string object
public class As14 {        //method intern use & campare 2 string .
    public static void main(String[] args) {
        String str = new String("my sister name is peru");   //intern()=           return type  string
    //Returns the canonical representation for the string object intern() method is used to make an exact 
    //copy of a string in heap memory and store it in the string constatnt pool
                    
        String str1=str.intern();   // str copy st1

        System.out.println("string "+str+ str1+" is equal");
    }
        }

        
    

