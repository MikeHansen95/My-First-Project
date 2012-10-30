package modual.zero.am.ctec;

import java.util.Scanner;

import javax.swing.JOptionPane;

@SuppressWarnings("resource")
public class GameBoy
{
    private String color;
    private String portable;
    private String models;
    private String size;
    private String name;

    public GameBoy()
    {
	color = "yellow";
	portable = "yes";
	models = "pocket";
	size = "small";
    }

    public GameBoy(String gameBoyColor, String gameBoyPortable,
	    String gameBoyModels, String gameBoySize)
    {
	color = gameBoyColor;
	portable = gameBoyPortable;
	models = gameBoyModels;
	size = gameBoySize;
    }

    public String getColor()
    {
	return color;
    }

    public String getPortable()
    {
	return portable;
    }

    public String getModels()
    {
	return models;
    }

    public String getSize()
    {
	return size;
    }

    public void setColor(String color)
    {
	this.color = color;
    }

    public void setPortable(String portable)
    {
	this.portable = portable;
    }

    public void setModels(String models)
    {
	this.models = models;
    }

    public void setSize(String size)
    {
	this.size = size;
    }

    private void printInfo()
    {
	System.out.println("Hi my name is "+ name);
	System.out.println("My GameBoy is the color: " + color);
	System.out.println("Is it portable: " + portable);
	System.out.println("The model is: " + models);
	System.out.println("The size of the GameBoy is: " + size);
    }

    private void askquestions()
    {

	Scanner myScanner = new Scanner(System.in);
	
	System.out.println("What is your name? ");
	name = myScanner.nextLine();

	System.out.println("What is your favorite color of GameBoy? ");
	color = myScanner.nextLine();
	
	
	System.out.println("What is your favorite model of GameBoy? ");
	models = myScanner.nextLine();
	
	System.out.println("Do you like portablility? ");
	portable = myScanner.nextLine();
	
	System.out.println("What size GameBoy do you prefer? ");
	size = myScanner.nextLine();
	

    }
    
    public void askGUI()
    {
	name = JOptionPane.showInputDialog("What is your name? ");
	color = JOptionPane.showInputDialog("What is your favorite color of GameBoy? ");
	models = JOptionPane.showInputDialog("What is your favorite model of GameBoy? ");
	portable = JOptionPane.showInputDialog("Do you like portability? ");
	size = JOptionPane.showInputDialog("What size GameBoy do you prefer? ");
    }

    public void start()
    {
	askGUI();
	printInfo();

    }

}
