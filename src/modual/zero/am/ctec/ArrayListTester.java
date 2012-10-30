package modual.zero.am.ctec;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ArrayListTester {
	// Declarations
	private ArrayList<GameBoy> gameboyList;

	public ArrayListTester() {
		gameboyList = new ArrayList<GameBoy>();
	}

	public void printListInfo() {
		// How to use a for-each loop also called an enhanced-for
		// for(Type variableName : dataStructure)

		for (GameBoy currentGameBoy : gameboyList) {
			JOptionPane.showMessageDialog(null, currentGameBoy.getColor());
		}
	}

	public void start() {
		// Create some objects for the list
		GameBoy justinGameboy = new GameBoy();
		GameBoy braydenGameboy = new GameBoy();
		// Add Justin, then Brayden
		gameboyList.add(justinGameboy);
		gameboyList.add(braydenGameboy);

		printListInfo();
		
		// Remove by object
		gameboyList.remove(justinGameboy);
		// Remove by position
		gameboyList.remove(0);
		//Cannot add after the .size() value of the list
		gameboyList.add(1, braydenGameboy);

	}

}
