package SteamApi;

public class StringMethods {

	// The java.lang.String
	public static void main(String[] args) {
		//replace method
		String s = "Hello I'm manju priya and chennai";
		String res = s.replace("and chennai", "");
		System.out.println(res);
		
		//length
		String len = "Manju Priya";
		System.out.println(len.length());
		
		//charAt starting at index
		String c = "Manju";
		System.out.println("char value"+c.charAt(3));
		
		//startsWith and endsWith it will return boolean
		String ss ="Sachin";    
		 System.out.println(ss.startsWith("Sa"));//true    
		 System.out.println(ss.endsWith("n"));//true   
		 
		 //trim -> The String class trim() method eliminates white spaces before and after the String.
		 String t ="  Sachin  ";    
		 System.out.println(t);//  Sachin      
		 System.out.println(t.trim());//Sachin 

		 // upper case , lower case
		 String r="Sachin";    
		 System.out.println(r.toUpperCase());//SACHIN    
		 System.out.println(r.toLowerCase());//sachin    
		 System.out.println(r);//Sachin(no change in original)  
		 
		 //concat -> It will be append the new string end of another string
		 String firstName = "Manju ";
		    String lastName = "Priya";
		    System.out.println(firstName.concat(lastName));
		    
		    //contains -> will return the boolean value
		 String con = "Manju";
		 if(con.contains("M")) {
			 System.out.println("success");
		 }else {
			 System.out.println("fail");
		 }
	
	}
}
