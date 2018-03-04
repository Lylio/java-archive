import java.io.*;

public class LetterFrequencies {

	public static void main(String[] args) {

		File inputFile = new File("C:\\Users\\Lyle\\Desktop\\test.txt");
		FileReader reader = null;
		try {
			reader = new FileReader(inputFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("LETTER ANALYSIS\n");

		int nextChar;
		final int SIZE = 26;
		char ch;
		int[] alphaCounts = new int[SIZE];
		char [] alphabet = new char [SIZE];
		int charTotal = 0;
		double charFreq = 0;
		double freqDiff = 0;
		double maxFreq = 0;
		char maxCh = 0;
		double [] avgCounts = {8.2, 1.5, 2.8, 4.3, 12.7, 2.2, 2.0, 6.1, 7.0,
				0.2, 0.8, 4.0, 2.4, 6.7, 7.5, 1.9, 0.1, 6.0,  
				6.3, 9.1, 2.8, 1.0, 2.4, 0.2, 2.0, 0.1};


		System.out.printf("%-7s %-5s %-6s %-9s %s\n", "Letter","Freq","Freq%", "AvgFreq%","Diff");
		try {
			while ((nextChar = reader.read()) != -1) {
				ch = ((char) nextChar);
				if (ch >= 'A' && ch <= 'Z') {
					alphaCounts[ch - 'A']++;
					charTotal++;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}


		for (int i = 0; i < 26; i++) {
			charFreq = (double)alphaCounts[i] / charTotal * 100;
			if(charFreq >= maxFreq) {
				maxFreq = charFreq;
				maxCh = (char) (i + 'A');
			}
			freqDiff = charFreq - avgCounts[i];
			System.out.printf("%4c %5d %7.1f %7.1f %8.1f \n", i + 'A', alphaCounts[i], charFreq,avgCounts[i],freqDiff);
		}

		System.out.printf("\nThe most frequent letter is %s at %.1f%%", maxCh, maxFreq);

		try {
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}