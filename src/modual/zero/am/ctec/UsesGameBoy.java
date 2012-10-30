package modual.zero.am.ctec;

import javax.swing.JOptionPane;

public class UsesGameBoy
{
    private GameBoy justinGameBoy;
    private GameBoy braydenGameBoy;
    private GameBoy defaultGameBoy;

    public UsesGameBoy()
    {
	justinGameBoy = new GameBoy("black", "yes", "advanceSP", "small");
	braydenGameBoy = new GameBoy("white", "yes", "color", "medium");
	defaultGameBoy = new GameBoy();
    }

    private void print()
    {
	defaultGameBoy.start();
	justinGameBoy.start();
	braydenGameBoy.start();
    }

    public void whileTest()
    {
	// Declaring and initializing my loop variable for a while loop.
	boolean questionTester = false;
	int whileCounter = 0;

	while (whileCounter < 10)
	{
	    justinGameBoy.askGUI();

	    whileCounter+=2;
	}
    }

    public void forTest()
    {
	// declare and init; condition; increment
	for (int testCount = 0; testCount < 10; testCount++)
	{
	    JOptionPane.showMessageDialog(null, testCount);
	}

    }

    public void start()
    {
	// askQuestions();
	// askGUI();
	// whileTest();
	forTest();
    }
}
