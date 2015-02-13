import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class JOptionPaneDemo extends JFrame
	{
	private static final long serialVersionUID = 1L;
	static String name; 
	static int className;
	static JFrame frame = new JFrame();

	public static void theFill()
	    {
		name = JOptionPane.showInputDialog("What is your name?");  
		JOptionPane.showMessageDialog(frame, "Hi, " + name);
		
		Object[] options = {"Dwarf", "Rogue", "Warrior", "Dark Elf Warlock", "Paladin", "Wood Elf Ranger"};
		className = JOptionPane.showOptionDialog(frame, "What class would you like to be?",
				"Your Vocation",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null, options, options[2]);
		 
		
		switch(className)
			{
			case 0:
				{
				JOptionPane.showMessageDialog(frame, "Small... but deadly...");
				break;
				}
			case 1:
				{
				JOptionPane.showMessageDialog(frame, "Among the shadows you will live.");
				break;
				}
			case 2:
				{
				JOptionPane.showMessageDialog(frame, "The Last one to ever live....");
				break;
				}
			case 3:
				{
				JOptionPane.showMessageDialog(frame, "A bad yet good warrior to use magic.");
				break;
				}
			case 4:
				{
				JOptionPane.showMessageDialog(frame, "A great healer you will be.");
				break;
				}
			case 5:
				{
				JOptionPane.showMessageDialog(frame, "Good shot, Aragorn.");
				break;
				}
			}
		final String[] genre = { "Dungeon", "Wilderness", "Sci-Fi", "Random" };

			{
			final JFrame frame = new JFrame();
		    String favoritePizza = (String) JOptionPane.showInputDialog(frame, 
		            "What type of adventure would you like to experience?",
		            "Adventure Genre",
		            JOptionPane.QUESTION_MESSAGE, 
		            null, 
		            genre, 
		            genre[0]);
		    JOptionPane.showMessageDialog(frame, "Oh dear, you have no idea what you've just done...");
		    if(favoritePizza == genre[0])
		    	{
		    		String choice1 = JOptionPane.showInputDialog(frame, "You walk into the dungeon... you see 2 doors, 1 is to your right and the other is to your left. What do you do?");
		    		if(choice1.equals("Left"))
		    			{
		    				String choice2 = JOptionPane.showInputDialog(frame, "You walk through the left door and you see a zombie. Do you hit or run?");
		    				if(choice2.equals("Hit"))
		    					{
		    						JOptionPane.showMessageDialog(frame, "You hit the zombie and it dies!!!");
		    					}
		    				if(choice2.equals("Run"))
		    					{
		    						String choice3 = JOptionPane.showInputDialog(frame, "You get away and close the door. Do you go through the right door?");
		    						if(choice3.equals("Yes"))
		    							{
		    								theRightMethod();
		    							}
		    					}
		    			}
		    		
		    		}
		    }

		 }
		public static void theRightMethod()
			{
				if(JOptionPaneDemo.theFill().choice1.equals("Right"))
					{
						JOptionPane.showMessageDialog(frame, "You see a trap door and another door. What do you do?");
					}
			}
	}
	