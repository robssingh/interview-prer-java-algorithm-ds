package datasturctures.hashing;


import java.util.*; 

public class GroupAnagramsTogether {

	

		private static void printAnagrams(String arr[]) 
		{ 
			HashMap<Integer, List<String> > map = new HashMap<>(); 

			for (int i = 0; i < arr.length; i++) { 

				// convert to char array, sort and 
				// then re-convert to string 
				String word = arr[i]; 
				char[] letters = word.toCharArray(); 
				Arrays.sort(letters); 
				String newWord = new String(letters); 

				// calculate hashcode of string 
				// after sorting 
				int n = newWord.hashCode();
				System.out.println(n);
				if (map.containsKey(n)) { 

					// Here, we already have 
					// a word for the hashcode 
					List<String> words = map.get(n); 
					words.add(word); 
					map.put(n, words); 
				} 
				else { 

					// This is the first time we are 
					// adding a word for a specific 
					// hashcode 
					List<String> words = new ArrayList<>(); 
					words.add(word); 
					map.put(n, words); 
				} 
			} 

			// print all the values where size is > 1 
			// If you want to print non-anagrams, 
			// just print the values having size = 1 
			for (Integer i : map.keySet()) { 
				List<String> values = map.get(i); 
				if (values.size() > 1) { 
					System.out.print(values); 
				} 
			} 
		} 

		public static void main(String[] args) 
		{ 

			// Driver program 
			String arr[] = { "cat", "dog", "tac", "god", "act" }; 
			printAnagrams(arr); 
			
//			System.out.println('c'+'a'+'t');
		} 

}
