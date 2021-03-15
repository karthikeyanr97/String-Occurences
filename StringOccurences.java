import java.util.Scanner;

public class StringOccurences extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the first sentence:");
		String firstSentence = scanner.nextLine();
		System.out.println("Enter the second sentence:");
		String seccondSentence = scanner.nextLine();

		int result = countNoOfWords(firstSentence, seccondSentence);

		if (result == -1)
			System.out.println("Given sentence existing max of 100 characters");
		else
			System.out.println(result);

		scanner.close();
	}
}

class UserMainCode {

	public static int countNoOfWords(String firstSentence, String seccondSentence) {

		int count = 0;

		if (firstSentence.length() > 100 || seccondSentence.length() > 100)
			return -1;

		String wordsArray1[] = firstSentence.split(" ");
		String wordsArray2[] = seccondSentence.split(" ");

		for (int i = 0; i < wordsArray1.length; i++) {

			if (wordsArray1[i].equals(wordsArray2[1]))
				count++;

		}

		return count;

	}

}
