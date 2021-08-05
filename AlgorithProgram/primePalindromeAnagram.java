package AlgorithProgram;
import java.util.*;


public class primePalindromeAnagram {


	private static void checkPrime(int min, int max) {
		int flag = 0;
		ArrayList<String> primeNum = new ArrayList<>();

		for (int i = min; i <= max; i++) {
			if (i == 1 || i == 0)
				continue;
			flag = 1;

			for (int j = 2; j <= i / 2; ++j) {
				if (i % j == 0) {
					flag = 0;
					break;
				}
			}
			if (flag == 1) {
				System.out.print(i + " ");
				primeNum.add(Integer.toString(i));
			}
		}
		System.out.println();
		printAnagrams(primeNum);
		checkPalindromePair(primeNum);
	}

	
	 // Purpose: Method to print all anagrams between entered range.
	
	private static void printAnagrams(ArrayList<String> primeNum) {

		HashMap<String, List<String>> map = new HashMap<>();

		for (int i = 0; i < primeNum.size(); i++) {
			String word = primeNum.get(i);
			char[] letters = word.toCharArray();
			Arrays.sort(letters);
			String newWord = new String(letters);

			// calculate hashcode of string after sorting
			if (map.containsKey(newWord)) {
				map.get(newWord).add(word);
			} else {
				List<String> words = new ArrayList<>();
				words.add(word);
				map.put(newWord, words);
			}
		}

		System.out.println("Anagrams are: ");
		for (String s : map.keySet()) {
			List<String> values = map.get(s);
			if (values.size() > 1) {
				System.out.print(values);
			}
		}
		System.out.println();
	}

	 // Purpose: Boolean method to check Palindrome number.
	 
	private static boolean isPalindrome(String num) {
		int len = num.length();
		// compare each character from 1st with its corresponding character from last
		for (int i = 0; i < len / 2; i++)
			if (num.charAt(i) != num.charAt(len - i - 1))
				return false;
		return true;
	}

	
	 // Method check for palindrome pair and print it.

	private static boolean checkPalindromePair(List<String> array) {
		boolean flag = false;
		System.out.println("\n" + "Palindrome numbers");
		for (int i = 0; i < array.size() - 1; i++) {
			if (isPalindrome(array.get(i))) {
				System.out.print(array.get(i) + " ");
				flag = true;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		int min = 0;
		int max = 1000;

		System.out.println("Prime numbers between " + min + " and " + max + " are: ");
		checkPrime(min, max);
		
	}

}