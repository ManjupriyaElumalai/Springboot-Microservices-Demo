package InterviewQuestions;

public class StringProgram {

	public static void main(String[] args) {
		String str = "Heloo, I'm, Manju, Priya";
		StringBuilder sb = new StringBuilder();
		for(int i =0; i<str.length(); i++) {
			char c = str.charAt(i);
			if(c != ','){
				sb.append(c);
				
			}
		}
		
		System.out.println("output is"+	sb);
		
	}

}
