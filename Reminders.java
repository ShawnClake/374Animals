import java.util.ArrayList;
import java.util.Date;

public class Reminders {

	private ArrayList<Reminder> reminders;

	public Reminders(ArrayList<Reminder> mainReminders)
	{
		reminders =mainReminders;
		
		
	}
	
	public int getCount()
	{
		return reminders.size();
		
		
	}
	
	public Reminder check()		//Checks if any of the current reminders have the same time as the current date, if yes returns the first reminder found, else returns null
	{
		Date currentTime = new Date();	//Praying this gives the current time
		
		for(int i = 0; i < reminders.size(); i++)
		{
			if(reminders[i].getTime() == currentTime)
				 return reminders[i];
			
		}
		
		
	}
	
	

	public void addReminder(Reminder addedReminder)
	{
		reminders.add(addedReminder);
		
	}

	public void removeReminder(int position)	//The position int will have to be taken
	{
		if(position > -1 || position >= reminders.size())
		{
			System.out.println("Error: Reminder position was not within bounds.");
			return;
		}
			
			
		reminders.remove(position);
		return;	//The reminder was successfully removed
			
			
		
	}

	
	public void printReminders()
	{
		for(int i = 0; i < reminders.size(); i++)
		{
			System.out.println("Reminder 1: " + reminders[i].getName());
			System.out.println("Description: " + reminders[i].getDescription());
			System.out.println("Date: " + reminders[i].getTime());
			System.out.println("");
			
			
			
		}
		
		
		
	}



}
