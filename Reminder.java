
import java.util.Date;
public class Reminder {

	
	private int id;		//THe picture only has a d, assummed id. I'm gonna say that this contains a unique id. A, primary key, you could say
	private String name;
	private Date time;
	private String description;

		public Reminder(String cName, Date cTime, String cDescription, int cId)
		{
			name = cName;
			time = cTime;
			description = cDescription;
			id = cId;
		}

		public Date getTime()
		{
			return time;	
		}

		public String getName()
		{
			return name;
		}

		public String getDescription()
		{
			return description;
		}
		
		public int getId()
		{
			return id;

		}
		
		public void setTime(Date cTime)
		{
			time = cTime;	
		}

		public void setName(String cName)
		{
			name = cName;
		}

		public void setDescription(String cDescription)
		{
			description = cDescription;	
		}
}
