package project.first.am.ctec;

public class Classmate
{
	private String name;
	private String questionOne;
	private String questionTwo;
	private String questionThree;
	private String questionFour;
	private String questionFive;

	public String getQuestionOne()
	{
		return questionOne;
	}

	public void setQuestionOne(String questionOne)
	{
		this.questionOne = questionOne;
	}

	public String getQuestionTwo()
	{
		return questionTwo;
	}

	public void setQuestionTwo(String questionTwo)
	{
		this.questionTwo = questionTwo;
	}

	public String getQuestionThree()
	{
		return questionThree;
	}

	public void setQuestionThree(String questionThree)
	{
		this.questionThree = questionThree;
	}

	public String getQuestionFour()
	{
		return questionFour;
	}

	public void setQuestionFour(String questionFour)
	{
		this.questionFour = questionFour;
	}

	public String getQuestionFive()
	{
		return questionFive;
	}

	public void setQuestionFive(String questionFive)
	{
		this.questionFive = questionFive;
	}

	public Classmate()
	{
		name = null;

	}

	public Classmate(String ClassmateName)
	{
		name = ClassmateName;

	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

}
