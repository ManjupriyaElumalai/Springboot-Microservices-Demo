package InterviewQuestions;

public class RemoveCommasWithoutPredinedMethod {
	

	public static void main(String[] args) {
		String sentence = "Im, a, Software, Developer";
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i< sentence.length(); i++) {
			char res = sentence.charAt(i);
			if(res != ',') {
				sb.append(res);
			}
			
		}
		System.out.println("old sentence..."+sentence);
		System.out.println("new snetence....."+ sb);
	}

}
