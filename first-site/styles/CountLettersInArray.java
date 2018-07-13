import java.util.Random;

public class CountLettersInArray {
	public static void main(String[] args){
		// an array of chars
		char[] charArr = createCharArray(100);
		
		//Display the array
		System.out.println("The letters are:");
		displayArray(charArr); 
		
		//count the occurrences of each letter
		int[] countArr = countLetters(charArr);
		
		//Display counts 
		System.out.println();
		System.out.println("The occurences of each letter are: ");
		displayCountArr(countArr);
	}
	
	/** Create an array of characters */
	public static char[] createCharArray(int num){
		//declare an array of char and creae it
		char[] charArr = new char[num];
		
		//create chars randomly and assign them to the array
		Random r = new Random();
		for (int i = 0; i < charArr.length; i++){
			charArr[i] = (char)(r.nextInt('z'-'a') + 'a');
		}
		return charArr;
	}
	
	/** Display the array of characters */
	public static void displayArray(char[] charArr){
		for(int i = 0; i < charArr.length; i++){
			if((i+1) % 20 == 0)
				System.out.println(charArr[i]);
			else 
				System.out.print(charArr[i] + "   ");
		}	
	}
	
	/** Count the occurrences of each letter and return the countAray */
	public static int[] countLetters(char[] charArr){
		//declare and create and array of 26 int
		int[] countArr = new int[26];
		
		//count each letter in the array 
		for (int i = 0; i < charArr.length; i++){
			countArr[charArr[i] - 'a']++;
		}
		
		return countArr;
	}
	
	/** Display countArr */
	public static void displayCountArr(int[] countArr){
		for(int i = 0; i < countArr.length; i++){
			if((i + 1) % 10 ==0)
				System.out.println(countArr[i] + " " + (char)(i + 'a'));
			else
				System.out.print(countArr[i] + " " + (char)(i + 'a') + "    ");
		}
	}
	
}





