import java.util.*;

public class LabAssignmentStringHandlingPrograms {
		public static void main(String[] args) {
			program1();
			program2();
			program3();
			program4();
			program5();
			program6();
			program7();
			program8();
		}
	public static void program1(){
		System.out.println("PROGRAM 1 OUTPUT :");
			String str = "aaabcdddddefgggggghijjjjjjjkklnnnno";
			String st="";
			for(int i = 0;i < str.length()-1; i++){
				char ch1 = str.charAt(i);
				char ch2 = str.charAt(i+1);
				if(ch1==ch2){
					st=st+str.charAt(i);
				}else{
					st=st+str.charAt(i);
					if(st.length()>1)
						System.out.println("\""+st+"\" occured: "+st.length()+" times in given string");
					st= "";
				}
			}
		System.out.println("----------------------------------");
		}
	public static void program2(){
		System.out.println("PROGRAM 2 OUTPUT :");
		String str = "fgaaadddddgggggghjjjjjjjkknnnnpl";
		Map<Character, Integer> occurrences = new HashMap<>();
		for (char ch : str.toCharArray()) {
			occurrences.put(ch, occurrences.getOrDefault(ch, 0) + 1);
		}
		for (Map.Entry<Character, Integer> entry : occurrences.entrySet()) {
			char ch = entry.getKey();
			int count = entry.getValue();
			if (count > 1) {
				System.out.println(ch+" occurred: "+count+" Times");
			}
		}
		System.out.println("----------------------------------");
	}
	public static void program3(){
		String s1 = "Java Concept Of The Day";
		String[] words = s1.split(" ");
		System.out.println("PROGRAM 3 OUTPUT :");
		StringBuilder reversedString = new StringBuilder();
		for (int i = words.length - 1; i >= 0; i--) {
			reversedString.append(words[i]).append(" ");
		}
		String result = reversedString.toString().trim();
		System.out.println(result);
		System.out.println("----------------------------------");
	}
	public static void program4(){
		String str = "India is great country";
		String[] s1 = str.split("\\s+");
		System.out.println("PROGRAM 4 OUTPUT :");
		for (String word : s1) {
			String reverseWord = new StringBuilder(word).reverse().toString();
			System.out.println(reverseWord+ " length = "+ reverseWord.length());
		}
		System.out.println("----------------------------------");
	}
	public static void program5(){
		System.out.println("PROGRAM 5 OUTPUT :");
		String str="India iss my beautiful country aaa";
		String s2 = "";
		String[] s1=str.split(" ");
		for(String word:s1){
			if(word.length()>s2.length()){
				s2=word;
			}
		}
		System.out.println(s2);
		System.out.println("----------------------------------");
	}
	public static void program6(){
		System.out.println("PROGRAM 6 OUTPUT :");
		int[] arr ={7,5,9,8,5,6,7,5,4,8} ;
		ArrayList<Integer> list = new ArrayList<>();
		for(int num: arr){
			list.add(num);
		}
		LinkedHashSet<Integer> set = new LinkedHashSet<>(list);
		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
		for(Integer uniqueValue:set){
			map.put(uniqueValue, Collections.frequency(list,uniqueValue));
		}
		System.out.println(map);
		for (Map.Entry<Integer, Integer> entry : map.entrySet()){
			if(entry.getValue()>0)
				System.out.println(entry.getKey()+" occured "+entry.getValue()+" times");
		}
		System.out.println("----------------------------------");
	}
	public static void program7(){
		System.out.println("PROGRAM 7 OUTPUT :");
		String str = "aa bb cc aa bb cc bb aa bb";
		Map<String, Integer> occurrences = new HashMap<>();
		String[] words = str.split("\\s+");
		for (String word : words) {
			occurrences.put(word, occurrences.getOrDefault(word, 0) + 1);
		}
		for (Map.Entry<String, Integer> entry : occurrences.entrySet()) {
			String word = entry.getKey();
			int count = entry.getValue();
			System.out.println("\"" + word + "\" occurred: " + count + " times in given string");
		}
		System.out.println("----------------------------------");
	}
	public static void program8(){
		System.out.println("PROGRAM 8 OUTPUT :");
		String str = "raj";
		String s1 = "";
		StringBuilder s2 = new StringBuilder("");
		for(int i=str.length()-1; i>=0; i--){
			char ch = str.charAt(i);
			s2.append(ch);
			s1=str+s2;
		}
		System.out.println(s1);
	}
}