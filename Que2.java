import java.util.Scanner;
public class Que2 {
	private static Scanner sc;
    public static void main(String[] args) {
        String maxOccStr;
        int i, max = 0;
		int[] charFreq = new int[256];
        sc= new Scanner(System.in);
        System.out.print("Enter Any Text =  ");
        maxOccStr = sc.nextLine();

        for(i = 0; i < maxOccStr.length(); i++){
            charFreq[maxOccStr.charAt(i)]++;
        }
        for(i = 0; i < 256; i++) {
            if(charFreq[i] > charFreq[max]) {
                max = i;
             }
        }
        System.out.format("\nThe Maximum Occurring Character = %c",  max);
        System.out.format("\n'%c' Character Occurs %d Times ", max, charFreq[max]);	
    }
}


                


