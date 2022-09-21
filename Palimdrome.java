package week3.day1;

public class Palimdrome {

	public static void main(String[] args) {
		
	String name="madam";
	String name2="";
	for (int i= name.length()-1;i>=0; i--) 
	{
		name2= name2 + name.charAt(i);
	}
	      if(name.equals(name2)) {
			System.out.println("Palindrome");	
		}
		else {
			System.out.println("Not a Palindrome");
		}
	
	}

}
