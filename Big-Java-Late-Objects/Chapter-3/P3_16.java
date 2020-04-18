import java.util.Scanner;

/**
 * P3.16 Write a program that reads in three strings and sorts them lexicographically.
 *Enter three strings: Charlie Able Baker
 *Able
 *Baker
 *Charlie
 * @author Lyle
 *
 */
public class P3_16 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter three words: ");
		String word1 = in.next();
		String word2 = in.next();
		String word3 = in.next();
		in.close();
		
		String first = "";
        String second = "";
        String third = "";
        
        if (word1.compareTo(word2) == 0 && word2.compareTo(word3) == 0) {
            first = word3;
            second = word2;
            third = word1;
        } else if(word1.compareTo(word2) > 0 && word2.compareTo(word3) > 0) {
        	first = word3;
            second = word2;
            third = word1;
        } else if(word1.compareTo(word2) < 0 && word2.compareTo(word3) > 0) {
        	first = word3;
            second = word1;
            third = word2;
        } else if(word1.compareTo(word2) < 0 && word2.compareTo(word3) < 0) {
        	first = word1;
            second = word2;
            third = word3;
        } else if(word3.compareTo(word1) > 0 && word1.compareTo(word2) > 0) {
        	first = word2;
            second = word1;
            third = word3;
        } else if(word2.compareTo(word3) > 0 && word3.compareTo(word1) > 0) {
        	first = word1;
            second = word3;
            third = word2;
        } else if(word1.compareTo(word3) > 0 && word3.compareTo(word2) > 0) {
        	first = word2;
            second = word3;
            third = word1;
        }
        
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
		
	}

}
