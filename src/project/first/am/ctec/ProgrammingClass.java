package project.first.am.ctec;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ProgrammingClass
{
	private ArrayList<Classmate> friendsList;
	private ArrayList<String> questionsList;

	public ProgrammingClass()
	{
		friendsList = new ArrayList<Classmate>();
		questionsList = new ArrayList<String>();
	}

	private void addQuestionsToList()
	{
		questionsList.add("What is your favorite video game?");
		questionsList.add("Master Cheif or Commander Sheppard?");
		questionsList.add("Consoles or handhelds?");
		questionsList.add("Nintendo, Xbox, or Playstation?");
		questionsList.add("Mario or Zelda?");
	}

	private void addClassmatesToList()
	{
		friendsList.add(new Classmate("Brayden"));
		friendsList.add(new Classmate("Chase"));
		friendsList.add(new Classmate("Chadwick"));
		friendsList.add(new Classmate("Celest"));
		friendsList.add(new Classmate("Evan"));
	}

	private void askQuestionsGUI()
	{
		for (Classmate currentClassmate : friendsList)
		{
			currentClassmate.setQuestionOne(JOptionPane.showInputDialog(questionsList.get(0)));
			currentClassmate.setQuestionTwo(JOptionPane.showInputDialog(questionsList.get(1)));
			currentClassmate.setQuestionThree(JOptionPane.showInputDialog(questionsList.get(2)));
			currentClassmate.setQuestionFour(JOptionPane.showInputDialog(questionsList.get(3)));
			currentClassmate.setQuestionFive(JOptionPane.showInputDialog(questionsList.get(4)));
		}

	}

	private void displayAnswers()
	{
		for (Classmate currentClassmate : friendsList)
		{
			JOptionPane.showMessageDialog(null, currentClassmate.getQuestionOne(), questionsList.get(0), JOptionPane.OK_OPTION);
			JOptionPane.showMessageDialog(null, currentClassmate.getQuestionTwo(), questionsList.get(1), JOptionPane.OK_OPTION);
			JOptionPane.showMessageDialog(null, currentClassmate.getQuestionThree(), questionsList.get(2), JOptionPane.OK_OPTION);
			JOptionPane.showMessageDialog(null, currentClassmate.getQuestionFour(), questionsList.get(3), JOptionPane.OK_OPTION);
			JOptionPane.showMessageDialog(null, currentClassmate.getQuestionFive(), questionsList.get(4), JOptionPane.OK_OPTION);
		}

	}

	public void setup()
	{
		addQuestionsToList();
		addClassmatesToList();
		askQuestionsGUI();
		displayAnswers();

	}

}
