package InteractionInterviewQuestions;

public class StringReverse {

	public static void main(String[] args) {
		String name = "Manju";
		String reverseStr ="";
		System.out.println("Orginal string"+ name);
		for(int i=0; i<name.length();i++) {
			reverseStr = name.charAt(i) + reverseStr;
			System.out.println(reverseStr);
		}
		System.out.println("the reverseStr is "+reverseStr);
		
		//------------------------------------------************----------------------------
		
		// how to remove space or commas in string
		String str = "Im, a good, software engineer";
		
		StringBuilder sb = new StringBuilder();
		for(int i =0; i<str.length(); i++) {
			char rem = str.charAt(i);
			if(rem != ' ') {
				sb.append(rem);
			}
		}
		System.out.println("result is ...."+ sb);
		
		//using stringbuffer or stringbuilder 
		StringBuilder sbu = new StringBuilder(str);
		sbu.reverse();
		System.out.println(sbu);
		
		
	}

}
