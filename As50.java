//50. Write a program to separate all tokens (words) using StringTokenizer

import java.util.StringTokenizer;

public class As50 {//The StringTokenizer class helps us split Strings into multiple tokens.
    public static void main(String[] args) {
		StringTokenizer obj = new StringTokenizer("tommorow morning will be good"," thanks");  
		while (obj.hasMoreTokens())
        {  
			System.out.println(obj.nextToken());  
        }    
    }    
   }  

    

