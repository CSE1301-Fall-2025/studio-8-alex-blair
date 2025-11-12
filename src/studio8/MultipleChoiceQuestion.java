package studio8;

import support.cse131.NotYetImplementedException;

public class MultipleChoiceQuestion extends Question {


	private String []choices;
	
	/**
	 * Constructor
 
	 */
	public MultipleChoiceQuestion(String prompt, String answer, int points, String[] choices) {
		super(prompt, answer, points); //super with nothing after calls the constrcuter of the super class
		this.choices = choices;
	}
	
	/**
	 * Display the prompt for the question in addition to 
	 * the choices present for the question.
	 */
	public void displayPrompt() {
		//super.Prompt + "(" + this.choices + "Choices" +super.getPoints()points + " points)");
		this.displayPrompt();
		//loop through array
	}
	
	/**
	 * Getter method for the available choices
	 * @return String[] of choices
	 */
	public String[] getChoices() {
		throw new NotYetImplementedException();
	}
	
	public static void main(String[] args) {
		// TODO: create your own MultipleChoiceQuestion
	}

}
