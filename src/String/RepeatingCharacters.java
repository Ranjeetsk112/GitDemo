package String;

import java.util.HashMap;

public class RepeatingCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "INDIAISGREAT";
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Count the occurrences of each character
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Print the occurrence of each character
        for (char c : charCountMap.keySet()) {
            System.out.println(c + ": " + charCountMap.get(c));
        }    

	}

}
