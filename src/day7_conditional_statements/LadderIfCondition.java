package day7_conditional_statements;

public class LadderIfCondition {
	
	public static void main(String[] args) {
		
		// KBC - 4 options 
		
		//Question  -  what is capital of india?
		
		String Question = "What is capital of India?";
		// DElhi , Berlin , MUMBAI , NY
		
		String answer = "NY";
		
		if(answer.equals("DELHI")) {
			System.out.println("Correct Answer");
		}
		
		else if (answer.equals("BERLIN"))
		{
			System.out.println("BERLIN is not a correct answer");
		}
		
		else if(answer.equals("MUMBAI")) {
			System.out.println("MUMBAI is not a correct answer");
		}
		
		else if(answer.equals("NY")) {
			System.out.println("NY is not a correct answer");
		}
		
		
		
		
		
	}

}
